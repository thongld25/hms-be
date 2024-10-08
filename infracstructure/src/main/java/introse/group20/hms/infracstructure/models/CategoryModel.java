package introse.group20.hms.infracstructure.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "categories")
@NoArgsConstructor
public class CategoryModel {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<PostModel> posts;
}
