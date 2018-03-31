package edu.kit.ipd.sdq.activextendannotations;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import edu.kit.ipd.sdq.activextendannotations.DelegateExceptProcessor;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.eclipse.xtend.lib.annotations.Delegate;
import org.eclipse.xtend.lib.macro.Active;

/**
 * Works exactly like the {@link Delegate} annotation, but accepts an optional list
 * of interfaces to which no delegation methods will be generated.
 * @author Heiko Klare
 */
@Beta
@GwtCompatible
@Target({ ElementType.FIELD, ElementType.METHOD })
@Active(DelegateExceptProcessor.class)
@Documented
public @interface DelegateExcept {
  /**
   * Optional list of interfaces whose methods shall not be delegated.
   */
  public Class<?>[] value() default {};
}
