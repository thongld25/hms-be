package introse.group20.hms.infracstructure.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Entity
@Table(name = "posts")
@Data
@NoArgsConstructor
public class PostModel {
    @Id
    @GeneratedValue
    private UUID id;
    private String title;
    @Lob
    private String content;
    @Column(length = 1000)
    private String summary;
    private String cover;
    @Column(length = 500)
    private String coverContent;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryModel category;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorModel doctor;
}
