package introse.group20.hms.application.services.interfaces;

import introse.group20.hms.core.entities.Department;

import java.util.List;
import java.util.UUID;

public interface IDepartmentService {
    List<Department> getAll();
    Department addDepartment(Department department);
    void deleteDepartment(UUID id);
}
