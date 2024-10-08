package introse.group20.hms.configuration;

import introse.group20.hms.application.adapters.ITreatmentPlanAdapter;
import introse.group20.hms.application.services.TreatmentPlanService;
import introse.group20.hms.application.services.interfaces.ITreatmentPlanService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TreatmentPlanConfiguration {
    @Bean
    public ITreatmentPlanService treatmentPlanService(ITreatmentPlanAdapter treatmentPlanAdapter)
    {
        return new TreatmentPlanService(treatmentPlanAdapter);
    }
}
