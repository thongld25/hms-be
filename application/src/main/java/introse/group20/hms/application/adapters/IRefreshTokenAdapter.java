package introse.group20.hms.application.adapters;

import introse.group20.hms.core.entities.RefreshToken;
import introse.group20.hms.core.exceptions.RefreshTokenException;

import java.util.Optional;
import java.util.UUID;

public interface IRefreshTokenAdapter {
    Optional<RefreshToken> findByRefreshToken(String refreshToken);
    void addRefreshToken(UUID userId, RefreshToken refreshToken);
    void deleteByUserId(UUID userId);
    void deleteRefreshToken(RefreshToken refreshToken);
}
