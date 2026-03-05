package nhom14.VoTuanKiet.controllers;

import nhom14.VoTuanKiet.entities.Book;
import nhom14.VoTuanKiet.services.BookService;
import lombok.RequiredArgsConstructor;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RequestMapping; 
 
import java.util.List; 
 
@Controller 
@RequestMapping("/books") 
@RequiredArgsConstructor 
public class BookController { 
    private final BookService bookService; 
    @GetMapping 
    public String showAllBooks(@NotNull Model model) { 
        model.addAttribute("books", bookService.getAllBooks()); 
        return "book/list"; 
    } 
} 