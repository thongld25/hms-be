package introse.group20.hms.configuration;

import introse.group20.hms.application.adapters.IRefreshTokenAdapter;
import introse.group20.hms.application.services.RefreshTokenService;
import introse.group20.hms.application.services.interfaces.IRefreshTokenService;
import introse.group20.hms.application.utils.IJwtUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RefreshTokenConfiguration {

    @Bean
    public IRefreshTokenService refreshTokenService(IRefreshTokenAdapter refreshTokenAdapter, IJwtUtils jwtUtils){
        return new RefreshTokenService(refreshTokenAdapter, jwtUtils);
    }

}
