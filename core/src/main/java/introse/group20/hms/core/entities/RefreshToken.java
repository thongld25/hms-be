package introse.group20.hms.core.entities;

import java.time.Instant;
import java.util.UUID;


public class RefreshToken {
    private UUID id;
    private String token;
    private Instant expiredTime;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setRefreshToken(String refreshToken) {
        this.token = refreshToken;
    }

    public Instant getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Instant expiredTime) {
        this.expiredTime = expiredTime;
    }
}
