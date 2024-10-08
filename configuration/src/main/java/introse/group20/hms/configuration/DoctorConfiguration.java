package introse.group20.hms.configuration;

import introse.group20.hms.application.adapters.IDoctorAdapter;
import introse.group20.hms.application.services.DoctorService;
import introse.group20.hms.application.services.interfaces.IDoctorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DoctorConfiguration {

    @Bean
    public IDoctorService doctorService(IDoctorAdapter doctorAdapter)
    {
        return new DoctorService(doctorAdapter);
    }

}
