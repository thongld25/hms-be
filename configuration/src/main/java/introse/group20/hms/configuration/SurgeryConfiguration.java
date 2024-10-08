package introse.group20.hms.configuration;

import introse.group20.hms.application.adapters.ISurgeryAdapter;
import introse.group20.hms.application.services.SurgeryService;
import introse.group20.hms.application.services.interfaces.ISurgeryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SurgeryConfiguration {
    @Bean
    public ISurgeryService surgeryService(ISurgeryAdapter surgeryAdapter)
    {
        return new SurgeryService(surgeryAdapter);
    }
}
