package introse.group20.hms.infracstructure.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Entity
@Table(name = "departments")
@Data
@NoArgsConstructor
public class DepartmentModel {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    public DepartmentModel(String name)
    {
        this.name = name;
    }
}
