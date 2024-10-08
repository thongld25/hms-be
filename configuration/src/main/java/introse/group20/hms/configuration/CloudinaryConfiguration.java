package introse.group20.hms.configuration;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
@Configuration
public class CloudinaryConfiguration {
    @Bean
    public Cloudinary getCloudinary()
    {
        Map config = new HashMap();
        config.put("cloud_name", "ddiudyz6q");
        config.put("api_key", "329585949937736");
        config.put("api_secret", "7EbGo_VqXnh8QwjHr6Aap49W4Vg");
        config.put("secure", true);
        return new Cloudinary(config);
    }
}
