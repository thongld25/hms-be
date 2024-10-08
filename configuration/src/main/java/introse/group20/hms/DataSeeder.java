package introse.group20.hms;

import introse.group20.hms.infracstructure.models.DepartmentModel;
import introse.group20.hms.infracstructure.models.UserModel;
import introse.group20.hms.infracstructure.models.enums.Role;
import introse.group20.hms.infracstructure.repositories.IDepartmentRepository;
import introse.group20.hms.infracstructure.repositories.IUserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class DataSeeder implements CommandLineRunner {
    @Autowired
    private IDepartmentRepository departmentRepository;
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private PasswordEncoder encoder;
    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        List<DepartmentModel> departmentModels = new ArrayList<>();
        departmentModels.add(new DepartmentModel("Khoa Sản phụ khoa"));
        departmentModels.add(new DepartmentModel("Khoa Ngoại chung"));
        departmentModels.add(new DepartmentModel("Trung tâm Hỗ trợ sinh sản IVF"));
        departmentModels.add(new DepartmentModel("Thẩm mỹ Bệnh viện Hồng Ngọc"));
        departmentModels.add(new DepartmentModel("Khoa Nhi"));
        departmentModels.add(new DepartmentModel("Khoa Nội chung"));
        departmentModels.add(new DepartmentModel("Khoa Chẩn đoán hình ảnh và Thăm dò chức năng"));
        departmentModels.add(new DepartmentModel("Khoa Xét nghiệm – Giải phẫu"));
        departmentModels.add(new DepartmentModel("Khoa Vật lý trị liệu – Phục hồi chức năng"));
        departmentModels.add(new DepartmentModel("Khoa Tiêu hóa – Gan – Mật"));
        departmentModels.add(new DepartmentModel("Khoa Mắt"));
        departmentModels.add(new DepartmentModel("Khoa Răng – Hàm – Mặt"));
        departmentModels.add(new DepartmentModel("Khoa Tai – Mũi – Họng"));
        departmentModels.add(new DepartmentModel("Khoa Da liễu"));
        departmentModels.add(new DepartmentModel("Khoa Nam học"));
        departmentModels.add(new DepartmentModel("Khoa Nội tiết"));
        departmentModels.add(new DepartmentModel("Khoa Tim mạch"));
        departmentModels.add(new DepartmentModel("Khoa Thận lọc máu"));
        departmentModels.add(new DepartmentModel("Khoa Ung bướu"));
        departmentModels.add(new DepartmentModel("Khoa Khám bệnh"));
        departmentModels.add(new DepartmentModel("Khoa Kiểm soát nhiễm khuẩn"));
        departmentModels.add(new DepartmentModel("Phòng Tiêm chủng vacxin"));
        departmentModels.add(new DepartmentModel("Khoa Cấp cứu Hồi sức tích cực ICU"));
        departmentModels.add(new DepartmentModel("Khoa Cơ – Xương – Khớp"));
        departmentModels.add(new DepartmentModel("Khoa Tâm lý và Sức khỏe tâm thần"));
        departmentModels.add(new DepartmentModel("Khoa Hô Hấp"));
        departmentRepository.saveAll(departmentModels);
        UUID id = UUID.randomUUID();
        UserModel user = new UserModel("ADMIN", encoder.encode("ADMIN"), Role.ADMIN);
        user.setId(id);
        entityManager.persist(user);
    }
}
