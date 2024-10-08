package introse.group20.hms.application.services;

import introse.group20.hms.application.adapters.IRefreshTokenAdapter;
import introse.group20.hms.application.services.interfaces.IRefreshTokenService;
import introse.group20.hms.application.utils.IJwtUtils;
import introse.group20.hms.core.entities.RefreshToken;
import introse.group20.hms.core.exceptions.RefreshTokenException;

import java.time.Instant;
import java.util.UUID;


public class RefreshTokenService implements IRefreshTokenService {
    private long ttlRefreshToken = 10000;

    IRefreshTokenAdapter refreshTokenAdapter;
    public RefreshTokenService(IRefreshTokenAdapter refreshTokenAdapter, IJwtUtils jwtUtils)
    {
        this.refreshTokenAdapter = refreshTokenAdapter;
        this.jwtUtils = jwtUtils;
    }

    IJwtUtils jwtUtils;
    @Override
    public RefreshToken findByRefreshToken(String refreshToken) throws RefreshTokenException {
        return refreshTokenAdapter.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new RefreshTokenException("Refresh token not exist"));
    }
    @Override
    public void deleteByUserId(UUID userId) {
        refreshTokenAdapter.deleteByUserId(userId);
    }

    @Override
    public String generateRefreshToken(UUID userId) {
        refreshTokenAdapter.deleteByUserId(userId);
        RefreshToken refreshToken = new RefreshToken();
        refreshToken.setRefreshToken(UUID.randomUUID().toString().concat(userId.toString()));
        refreshToken.setExpiredTime(Instant.now().plusMillis(ttlRefreshToken));
        refreshTokenAdapter.addRefreshToken(userId, refreshToken);
        return refreshToken.getToken();
    }

    @Override
    public void verifyRefreshToken(RefreshToken refreshToken) throws RefreshTokenException {
        if(refreshToken.getExpiredTime().compareTo(Instant.now()) < 0){
            refreshTokenAdapter.deleteRefreshToken(refreshToken);
            throw new RefreshTokenException("Refresh Token : " + refreshToken.getToken() + "is expired");
        }
    }
}
