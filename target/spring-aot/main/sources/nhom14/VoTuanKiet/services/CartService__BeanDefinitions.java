package nhom14.VoTuanKiet.services;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CartService}.
 */
@Generated
public class CartService__BeanDefinitions {
  /**
   * Get the bean definition for 'cartService'.
   */
  public static BeanDefinition getCartServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CartService.class);
    beanDefinition.setInstanceSupplier(CartService::new);
    return beanDefinition;
  }
}
