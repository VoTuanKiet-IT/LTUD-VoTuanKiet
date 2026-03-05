package nhom14.VoTuanKiet;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link VoTuanKietApplication}.
 */
@Generated
public class VoTuanKietApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'voTuanKietApplication'.
   */
  public static BeanDefinition getVoTuanKietApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(VoTuanKietApplication.class);
    beanDefinition.setInstanceSupplier(VoTuanKietApplication::new);
    return beanDefinition;
  }
}
