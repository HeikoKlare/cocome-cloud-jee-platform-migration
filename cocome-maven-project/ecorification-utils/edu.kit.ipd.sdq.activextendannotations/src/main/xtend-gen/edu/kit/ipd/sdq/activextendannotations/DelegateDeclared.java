package edu.kit.ipd.sdq.activextendannotations;

import com.google.common.annotations.Beta;
import edu.kit.ipd.sdq.activextendannotations.DelegateDeclaredProcessor;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.eclipse.xtend.lib.annotations.Delegate;
import org.eclipse.xtend.lib.macro.Active;

/**
 * Variation of the Xtend @{@link Delegate} active annotation, that only delegates the methods that were declared in the
 * direct super interfaces of the class that uses the annotation.
 * @author Timur Saglam
 */
@Beta
@Target({ ElementType.FIELD, ElementType.METHOD })
@Active(DelegateDeclaredProcessor.class)
@Documented
public @interface DelegateDeclared {
  /**
   * Optional list of interfaces that this delegate is restricted to.
   * Defaults to the common interfaces of the context type and the annotated element.
   */
  public Class<?>[] value() default {};
}
