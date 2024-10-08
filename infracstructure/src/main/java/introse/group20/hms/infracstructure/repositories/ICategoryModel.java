package introse.group20.hms.infracstructure.repositories;

import introse.group20.hms.infracstructure.models.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ICategoryModel extends JpaRepository<CategoryModel, UUID> {
}
