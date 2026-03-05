package nhom14.VoTuanKiet.controllers;

import nhom14.VoTuanKiet.services.BookService;
import nhom14.VoTuanKiet.services.CategoryService;
import lombok.RequiredArgsConstructor;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;  

@Controller 
@RequestMapping("/books") 
@RequiredArgsConstructor 
public class BookController { 
    private final BookService bookService; 
    private final CategoryService categoryService;
    @GetMapping 
    public String showAllBooks( 
               @NotNull Model model, 
               @RequestParam(defaultValue = "0") Integer pageNo, 
               @RequestParam(defaultValue = "20") Integer pageSize, 
               @RequestParam(defaultValue = "id") String sortBy) { 
        model.addAttribute("books", bookService.getAllBooks(pageNo,
pageSize, sortBy)); 
        model.addAttribute("currentPage", pageNo); 
        model.addAttribute("categories", categoryService.getAllCategories()); 
        model.addAttribute("totalPages", bookService.getAllBooks(pageNo, pageSize, sortBy).size() / pageSize); 
        return "book/list"; 
    } 
}