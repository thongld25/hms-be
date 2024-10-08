package introse.group20.hms.infracstructure.adapters;

import introse.group20.hms.application.adapters.ISurgeryAdapter;
import introse.group20.hms.core.entities.Surgery;
import introse.group20.hms.infracstructure.models.SurgeryModel;
import introse.group20.hms.infracstructure.repositories.ISurgeryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
@Component
public class SurgeryAdapter implements ISurgeryAdapter {
    @Autowired
    private ISurgeryRepository surgeryRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<Surgery> getAllAdapter() {
        List<SurgeryModel> surgeryModels = surgeryRepository.findAll();
        return surgeryModels.stream()
                .map(surgeryModel -> modelMapper.map(surgeryModel, Surgery.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<Surgery> getSurgeryForDoctorAdapter(UUID doctorId) {
        return null;
    }

    @Override
    public Surgery addSurgeryAdapter(UUID doctorId, UUID patientId, Surgery surgery) {
        return null;
    }

    @Override
    public void updateSurgeryAdapter(Surgery surgery) {

    }

    @Override
    public void deleteSurgeAdapter(UUID surgeryId) {

    }
}
