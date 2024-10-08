package introse.group20.hms.configuration;

import introse.group20.hms.application.adapters.IPatientAdapter;
import introse.group20.hms.application.services.PatientService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PatientConfiguration {
    @Bean
    public PatientService patientService(IPatientAdapter patientAdapter)
    {
        return new PatientService(patientAdapter);
    }
}
