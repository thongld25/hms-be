package introse.group20.hms.webapi.controllers;

import introse.group20.hms.application.services.interfaces.IRefreshTokenService;
import introse.group20.hms.application.services.interfaces.IUserService;
import introse.group20.hms.application.utils.IJwtUtils;
import introse.group20.hms.core.entities.RefreshToken;
import introse.group20.hms.core.entities.User;
import introse.group20.hms.core.exceptions.ErrorMessage;
import introse.group20.hms.core.exceptions.RefreshTokenException;
import introse.group20.hms.webapi.DTOs.AuthDTO.*;
import introse.group20.hms.webapi.security.impl.UserPrincipal;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import introse.group20.hms.webapi.utils.AuthExtensions;
import java.util.UUID;

@CrossOrigin(value = "*", maxAge = 3600)
@RestController
@RequestMapping("/auth")
@Validated
public class AuthController {
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    IUserService userService;
    @Autowired
    IRefreshTokenService refreshTokenService;
    @Autowired
    PasswordEncoder encoder;
    @Autowired
    IJwtUtils jwtUtils;
    @Autowired
    ModelMapper modelMapper;

    @PostMapping(value = "login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> login(@Valid @RequestBody LoginRequest loginRequest){
        UsernamePasswordAuthenticationToken upat = new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword());
        Authentication authenticationObj = authenticationManager
                .authenticate(upat);
        SecurityContextHolder.getContext().setAuthentication(authenticationObj);
        String accessToken = jwtUtils.generateAccessToken(((UserPrincipal) authenticationObj.getPrincipal()).getId());
        UserPrincipal userPrincipal = (UserPrincipal) authenticationObj.getPrincipal();
        String refreshToken = refreshTokenService.generateRefreshToken(userPrincipal.getId());
        return ResponseEntity.ok(new LoginResponse(userPrincipal.getUsername(), accessToken, refreshToken));
    }

    @PostMapping(value = "refreshToken", produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<?> refreshToken(@Valid @RequestBody TokenRefreshRequest tokenRefreshRequest) throws RefreshTokenException {
        RefreshToken refreshToken = refreshTokenService.findByRefreshToken(tokenRefreshRequest.getRefreshToken());
        refreshTokenService.verifyRefreshToken(refreshToken);
        UUID userId = jwtUtils.getUserIdFromToken(tokenRefreshRequest.getAccessToken());
        String newAccessToken = jwtUtils.generateAccessToken(userId);
        return ResponseEntity.ok(
            new TokenRefreshResponse(newAccessToken, refreshToken.getToken())
        );
    }
    @PostMapping(value = "/logout", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MessageResponse> logout()
    {
        UUID userId = AuthExtensions.GetUserIdFromContext(SecurityContextHolder.getContext());
        refreshTokenService.deleteByUserId(userId);
        return new ResponseEntity<MessageResponse>(new MessageResponse("Logout successfully!"), HttpStatus.OK);
    }
}
