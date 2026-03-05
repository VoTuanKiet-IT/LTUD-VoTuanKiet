package nhom14.VoTuanKiet.services;

import nhom14.VoTuanKiet.entities.Book;
import lombok.RequiredArgsConstructor; 
import org.springframework.stereotype.Service; 
 
import java.util.List;
import java.util.Optional; 
 
@Service 
@RequiredArgsConstructor 
public class BookService { 
    private final List<Book> books; 
 
    public List<Book> getAllBooks() { 
        return books; 
    }
    public Optional<Book> getBookById(Long id) { 
        return books.stream() 
        .filter(book -> book.getId().equals(id)) 
        .findFirst(); 
    }
    public void addBook(Book book) { 
        books.add(book); 
    } 
} 