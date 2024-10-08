package introse.group20.hms.application.utils;

import java.util.UUID;

public interface IJwtUtils {
//    String generateAccessToken(Authentication authentication);
    UUID getUserIdFromToken(String accessToken);
    String generateAccessToken(UUID userId);
    boolean verifyToken(String accessToken);
}
