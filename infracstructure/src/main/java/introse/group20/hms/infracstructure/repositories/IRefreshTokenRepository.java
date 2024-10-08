package introse.group20.hms.infracstructure.repositories;

import introse.group20.hms.infracstructure.models.RefreshTokenModel;
import introse.group20.hms.infracstructure.models.UserModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface IRefreshTokenRepository extends JpaRepository<RefreshTokenModel, UUID> {
    Optional<RefreshTokenModel> findByToken(String token);
    @Modifying
    @Query("delete from RefreshTokenModel r where r.userModel = :userModel")
    int deleteByUserModel(@Param("userModel") UserModel userModel);
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM refresh_tokens r WHERE r.user_id = :userId", nativeQuery = true)
    void deleteByUserId(UUID userId);

}
