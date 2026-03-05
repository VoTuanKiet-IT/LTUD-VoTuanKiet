package nhom14.VoTuanKiet.services;

import nhom14.VoTuanKiet.entities.Book;
import lombok.RequiredArgsConstructor; 
import org.springframework.stereotype.Service; 
 
import java.util.List; 
 
@Service 
@RequiredArgsConstructor 
public class BookService { 
    private final List<Book> books; 
 
    public List<Book> getAllBooks() { 
        return books; 
    } 
} 