package nhom14.VoTuanKiet.services;

import nhom14.VoTuanKiet.daos.Cart;
import nhom14.VoTuanKiet.daos.Item;
import nhom14.VoTuanKiet.entities.Invoice;
import nhom14.VoTuanKiet.entities.ItemInvoice;
import nhom14.VoTuanKiet.repositories.IBookRepository;
import nhom14.VoTuanKiet.repositories.IInvoiceRepository;
import nhom14.VoTuanKiet.repositories.IItemInvoiceRepository;
import jakarta.servlet.http.HttpSession; 
import jakarta.validation.constraints.NotNull; 
import lombok.RequiredArgsConstructor; 
import org.springframework.stereotype.Service; 
 
import java.util.Date; 
import java.util.Optional; 
 
@Service
@RequiredArgsConstructor
public class CartService { 
    private static final String CART_SESSION_KEY = "cart"; 
    private final IInvoiceRepository invoiceRepository;
    private final IItemInvoiceRepository itemInvoiceRepository;
    private final IBookRepository bookRepository;
 
    public Cart getCart(@NotNull HttpSession session) { 
        return Optional.ofNullable((Cart) 
        session.getAttribute(CART_SESSION_KEY)) 
                .orElseGet(() -> { 
                    Cart cart = new Cart(); 
                    session.setAttribute(CART_SESSION_KEY, cart); 
                    return cart; 
                }); 
    } 
 
    public void updateCart(@NotNull HttpSession session, Cart cart) { 
        session.setAttribute(CART_SESSION_KEY, cart); 
    } 
 
    public void removeCart(@NotNull HttpSession session) { 
        session.removeAttribute(CART_SESSION_KEY); 
    } 
 
    public int getSumQuantity(@NotNull HttpSession session) { 
        return getCart(session).getCartItems().stream() 
                .mapToInt(Item::getQuantity) 
                .sum(); 
    } 
 
    public double getSumPrice(@NotNull HttpSession session) { 
        return getCart(session).getCartItems().stream() 
                .mapToDouble(item -> item.getPrice() * item.getQuantity()) 
                .sum(); 
    }

    public void saveCart(@NotNull HttpSession session) { 
        var cart = getCart(session); 
        if (cart.getCartItems().isEmpty()) return; 
 
        var invoice = new Invoice(); 
        invoice.setInvoiceDate(new Date(new Date().getTime())); 
        invoice.setPrice(getSumPrice(session)); 
        invoiceRepository.save(invoice); 
 
        cart.getCartItems().forEach(item -> { 
            var items = new ItemInvoice(); 
            items.setInvoice(invoice); 
            items.setQuantity(item.getQuantity()); 
            items.setBook(bookRepository.findById(item.getBookId()) .orElseThrow()); 
            itemInvoiceRepository.save(items); 
        }); 
        removeCart(session); 
    }
}
