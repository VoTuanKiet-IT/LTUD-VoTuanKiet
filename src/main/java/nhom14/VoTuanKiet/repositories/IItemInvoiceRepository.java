package nhom14.VoTuanKiet.repositories;

import nhom14.VoTuanKiet.entities.ItemInvoice;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
 
@Repository 
public interface IItemInvoiceRepository extends JpaRepository<ItemInvoice, Long>{ 
} 
