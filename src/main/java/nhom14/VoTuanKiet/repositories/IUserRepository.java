package nhom14.VoTuanKiet.repositories;

import nhom14.VoTuanKiet.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 
 
@Repository 
public interface IUserRepository extends JpaRepository<User, Long> { 
    User findByUsername(String username); 
} 