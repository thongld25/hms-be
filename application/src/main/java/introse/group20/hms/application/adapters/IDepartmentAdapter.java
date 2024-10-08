package introse.group20.hms.application.adapters;

import introse.group20.hms.core.entities.Department;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IDepartmentAdapter {
    List<Department> getAllAdapter();
    Department addDepartmentAdapter(Department department);
    void deleteDepartmentAdapter(UUID id);
}
