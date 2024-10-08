package introse.group20.hms.webapi.security.jwt;

import introse.group20.hms.application.utils.IJwtUtils;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.UUID;

public class JwtUtils implements IJwtUtils {
//    @Value("{...}")
    private String secretKey = "======================JWT12345=Spring===========================";
//    @Value("{...}")
    private long expiredTime = 604800000L;
    public SecretKey getSecretKey(){
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(secretKey));
    }
    public String generateAccessToken(UUID userId){
        String accessToken = Jwts.builder().subject(userId.toString())
                .issuedAt(new Date())
                .expiration(new Date(new Date().getTime() + expiredTime))
                .signWith(getSecretKey(), SignatureAlgorithm.HS256)
                .compact();
        return accessToken;
    }

    public UUID getUserIdFromToken(String accessToken){
        return UUID.fromString(Jwts.parser().setSigningKey(getSecretKey())
                .build()
                .parseSignedClaims(accessToken)
                .getPayload()
                .getSubject());
    }
    public boolean verifyToken(String accessToken){
        try {
            Jwts.parser().verifyWith(getSecretKey())
                    .build()
                    .parseSignedClaims(accessToken);
            return true;
        }catch (Exception e){
            // log error
        }
        return false;
    }
}
