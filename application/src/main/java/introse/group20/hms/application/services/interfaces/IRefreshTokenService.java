package introse.group20.hms.application.services.interfaces;

import introse.group20.hms.core.entities.RefreshToken;
import introse.group20.hms.core.exceptions.RefreshTokenException;

import java.util.UUID;

public interface IRefreshTokenService {
    RefreshToken findByRefreshToken(String refreshToken) throws RefreshTokenException;
    void deleteByUserId(UUID userId);

    String generateRefreshToken(UUID userId);
    void verifyRefreshToken(RefreshToken refreshToken) throws RefreshTokenException;
}
