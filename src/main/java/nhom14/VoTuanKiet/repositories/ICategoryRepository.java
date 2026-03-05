package nhom14.VoTuanKiet.repositories;

import nhom14.VoTuanKiet.entities.Category; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
 
@Repository 
public interface ICategoryRepository extends  
    JpaRepository<Category, Long> { 
}