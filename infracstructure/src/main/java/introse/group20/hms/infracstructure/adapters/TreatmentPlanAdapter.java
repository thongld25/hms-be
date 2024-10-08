package introse.group20.hms.infracstructure.adapters;

import introse.group20.hms.application.adapters.ITreatmentPlanAdapter;
import introse.group20.hms.core.entities.TreatmentPlan;
import introse.group20.hms.core.exceptions.BadRequestException;
import introse.group20.hms.infracstructure.models.DoctorModel;
import introse.group20.hms.infracstructure.models.PatientModel;
import introse.group20.hms.infracstructure.models.TreatmentPlanModel;
import introse.group20.hms.infracstructure.repositories.IDoctorRepository;
import introse.group20.hms.infracstructure.repositories.IPatientRepository;
import introse.group20.hms.infracstructure.repositories.ITreatmentPlanRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class TreatmentPlanAdapter implements ITreatmentPlanAdapter {
    @Autowired
    private ITreatmentPlanRepository treatmentPlanRepository;
    @Autowired
    private IPatientRepository patientRepository;
    @Autowired
    private IDoctorRepository doctorRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<TreatmentPlan> getForUserAdapter(UUID userId) {
        List<TreatmentPlanModel> treatmentPlanModels = treatmentPlanRepository.findByPatientId(userId);
        return treatmentPlanModels.stream()
                .map(treatmentPlanModel -> modelMapper.map(treatmentPlanModel, TreatmentPlan.class))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<TreatmentPlan> getByIdAdapter(UUID id) {
        return Optional.empty();
    }

    @Override
    public void createTreatmentPlanAdapter(UUID patientId, UUID doctorId, TreatmentPlan treatmentPlan) throws BadRequestException {
        TreatmentPlanModel treatmentPlanModel = modelMapper.map(treatmentPlan, TreatmentPlanModel.class);
        Optional<PatientModel> patientModel = patientRepository.findById(patientId);
        Optional<DoctorModel> doctorModel = doctorRepository.findById(doctorId);
        if (patientModel.isEmpty() || doctorModel.isEmpty())
        {
            throw new BadRequestException("Bad request!");
        }
        treatmentPlanModel.setDoctor(doctorModel.get());
        treatmentPlanModel.setPatient(patientModel.get());
        treatmentPlanRepository.save(treatmentPlanModel);
    }

    @Override
    public void updateTreatmentPlanAdapter(TreatmentPlan treatmentPlan) {

    }

    @Override
    public void deleteTreatmentPlanAdapter(UUID id) {

    }
}
