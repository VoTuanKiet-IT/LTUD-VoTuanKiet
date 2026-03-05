package nhom14.VoTuanKiet.controllers;

import nhom14.VoTuanKiet.services.BookService;
import nhom14.VoTuanKiet.services.CartService;
import nhom14.VoTuanKiet.services.CategoryService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link BookController}.
 */
@Generated
public class BookController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'bookController'.
   */
  private static BeanInstanceSupplier<BookController> getBookControllerInstanceSupplier() {
    return BeanInstanceSupplier.<BookController>forConstructor(BookService.class, CategoryService.class, CartService.class)
            .withGenerator((registeredBean, args) -> new BookController(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'bookController'.
   */
  public static BeanDefinition getBookControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BookController.class);
    beanDefinition.setInstanceSupplier(getBookControllerInstanceSupplier());
    return beanDefinition;
  }
}
