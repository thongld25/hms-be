package introse.group20.hms.webapi.security.jwt;

import introse.group20.hms.application.adapters.IUserAdapter;
import introse.group20.hms.application.utils.IJwtUtils;
import introse.group20.hms.webapi.security.impl.UserPrincipal;
import introse.group20.hms.webapi.security.impl.UserPrincipalService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.UUID;

public class AuthFilter extends OncePerRequestFilter {
    @Autowired
    IJwtUtils jwtUtils;
    @Autowired
    UserPrincipalService userPrincipalService;
    @Autowired
    IUserAdapter userAdapter;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            String token = getTokenFromHeader(request);
            if(token != null && jwtUtils.verifyToken(token)){
                UUID userId = jwtUtils.getUserIdFromToken(token);
                UserPrincipal userPrincipal = userPrincipalService.loadUserByUserId(userId);
                UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userPrincipal, null, userPrincipal.getAuthorities());
                authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        filterChain.doFilter(request, response);
    }
    private String getTokenFromHeader(HttpServletRequest request){
        String authHeader = request.getHeader("Authorization");
        if (StringUtils.hasText(authHeader) && authHeader.startsWith("Bearer ")) {
            return authHeader.substring(7);
        }
        return null;
    }
}
