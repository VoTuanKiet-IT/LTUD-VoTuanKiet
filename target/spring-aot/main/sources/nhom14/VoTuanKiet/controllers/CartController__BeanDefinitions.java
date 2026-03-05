package nhom14.VoTuanKiet.controllers;

import nhom14.VoTuanKiet.services.CartService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CartController}.
 */
@Generated
public class CartController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'cartController'.
   */
  private static BeanInstanceSupplier<CartController> getCartControllerInstanceSupplier() {
    return BeanInstanceSupplier.<CartController>forConstructor(CartService.class)
            .withGenerator((registeredBean, args) -> new CartController(args.get(0)));
  }

  /**
   * Get the bean definition for 'cartController'.
   */
  public static BeanDefinition getCartControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CartController.class);
    beanDefinition.setInstanceSupplier(getCartControllerInstanceSupplier());
    return beanDefinition;
  }
}
