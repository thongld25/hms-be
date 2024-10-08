package introse.group20.hms.webapi.utils;

import introse.group20.hms.webapi.security.impl.UserPrincipal;
import org.springframework.security.core.context.SecurityContext;

import java.util.UUID;

public class AuthExtensions {
    public static UUID GetUserIdFromContext(SecurityContext context)
    {
        UserPrincipal userPrincipal= (UserPrincipal) context.getAuthentication().getPrincipal();
        return userPrincipal.getId();
    }
}
