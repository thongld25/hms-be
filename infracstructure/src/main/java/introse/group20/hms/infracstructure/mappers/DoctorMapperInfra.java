package introse.group20.hms.infracstructure.mappers;

import introse.group20.hms.core.entities.Doctor;
import introse.group20.hms.infracstructure.models.DoctorModel;
import introse.group20.hms.infracstructure.models.VoteModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.OptionalDouble;

@Component
public class DoctorMapperInfra {
    @Autowired
    private ModelMapper modelMapper;
    public Doctor mapToDoctor(DoctorModel doctorModel)
    {
        Doctor doctor = modelMapper.map(doctorModel, Doctor.class);
        doctor.setRating(calculateMeanRating(doctorModel.getVotes()));
        return doctor;
    }
    private float calculateMeanRating(List<VoteModel> votes) {
        if (votes == null || votes.isEmpty()) {
            return 0.0f;
        }

        OptionalDouble meanRating = votes.stream()
                .mapToDouble(vote -> vote.getRating().getValue())
                .average();

        return (float) meanRating.orElse(0.0);
    }
}
