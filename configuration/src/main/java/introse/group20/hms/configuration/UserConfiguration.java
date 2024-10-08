package introse.group20.hms.configuration;

import introse.group20.hms.application.adapters.IUserAdapter;
import introse.group20.hms.application.services.UserService;
import introse.group20.hms.application.services.interfaces.IUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
    @Bean
    public IUserService userService(IUserAdapter userAdapter)
    {
        return new UserService(userAdapter);
    }
}
