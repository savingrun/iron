package run.aquan.iron.system.repository;

import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import run.aquan.iron.system.enums.Datalevel;
import run.aquan.iron.system.model.entity.SysUser;
import run.aquan.iron.system.model.entity.User;

import java.util.Optional;

public interface SysUserRepository extends JpaRepository<SysUser, Integer> {

    Optional<SysUser> findByUsernameAndDatalevel(@NonNull String username, @NonNull Datalevel datalevel);

}
