package edu.kit.ipd.sdq.activextendannotations;

import com.google.common.annotations.Beta;
import edu.kit.ipd.sdq.activextendannotations.DelegateDeclared;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.xtend.lib.annotations.DelegateProcessor;
import org.eclipse.xtend.lib.macro.TransformationContext;
import org.eclipse.xtend.lib.macro.TransformationParticipant;
import org.eclipse.xtend.lib.macro.declaration.AnnotationReference;
import org.eclipse.xtend.lib.macro.declaration.MemberDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableMemberDeclaration;
import org.eclipse.xtend.lib.macro.declaration.ResolvedMethod;
import org.eclipse.xtend.lib.macro.declaration.TypeDeclaration;
import org.eclipse.xtend.lib.macro.declaration.TypeReference;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Annotation processor of the @{@link DelegateDeclared} active annotation.
 */
@Beta
@SuppressWarnings("all")
public class DelegateDeclaredProcessor implements TransformationParticipant<MutableMemberDeclaration> {
  /**
   * Utility class of the {@link DelegateDeclaredProcessor}. Extends the utility class of the
   * {@link DelegateProcessor} of the the @{@link DelegateDeclared} active annotation.
   */
  @Beta
  public static class Util extends DelegateProcessor.Util {
    @Extension
    private TransformationContext context;
    
    /**
     * Basic constructor, sets the transformation context.
     */
    public Util(final TransformationContext context) {
      super(context);
      this.context = context;
    }
    
    /**
     * Filters the output of {@link Util#getDelegatedInterfaces} to only return
     * the interfaces that are direct super interfaces of the class which uses the delegate annotation.
     */
    @Override
    public Set<TypeReference> getDelegatedInterfaces(final MemberDeclaration delegate) {
      final Function1<TypeReference, Boolean> _function = new Function1<TypeReference, Boolean>() {
        @Override
        public Boolean apply(final TypeReference iface) {
          return Boolean.valueOf(IterableExtensions.toSet(Util.this.context.newSelfTypeReference(delegate.getDeclaringType()).getDeclaredSuperTypes()).contains(iface));
        }
      };
      return IterableExtensions.<TypeReference>toSet(IterableExtensions.<TypeReference>filter(super.getDelegatedInterfaces(delegate), _function));
    }
    
    /**
     * Getter for the delegates. The delegates are the members marked by the {@link DelegateDeclared}
     * annotation.
     */
    @Override
    public Iterable<? extends MemberDeclaration> getDelegates(final TypeDeclaration it) {
      final Function1<MemberDeclaration, Boolean> _function = new Function1<MemberDeclaration, Boolean>() {
        @Override
        public Boolean apply(final MemberDeclaration it) {
          AnnotationReference _findAnnotation = it.findAnnotation(Util.this.context.findTypeGlobally(DelegateDeclared.class));
          return Boolean.valueOf((_findAnnotation != null));
        }
      };
      return IterableExtensions.filter(it.getDeclaredMembers(), _function);
    }
    
    /**
     * Getter for the listed interfaces of a member.
     */
    @Override
    public Set<TypeReference> listedInterfaces(final MemberDeclaration it) {
      return IterableExtensions.<TypeReference>toSet(((Iterable<TypeReference>)Conversions.doWrapArray(it.findAnnotation(this.context.findTypeGlobally(DelegateDeclared.class)).getClassArrayValue("value"))));
    }
  }
  
  /**
   * Is invoked by the compiler.
   * @param annotatedTargetElements is the mutable java representation of the annotated elements.
   * @param context is a {@link TransformationContext} providing useful services.
   */
  @Override
  public void doTransform(final List<? extends MutableMemberDeclaration> elements, @Extension final TransformationContext context) {
    @Extension
    final DelegateDeclaredProcessor.Util util = new DelegateDeclaredProcessor.Util(context);
    final Consumer<MutableMemberDeclaration> _function = new Consumer<MutableMemberDeclaration>() {
      @Override
      public void accept(final MutableMemberDeclaration it) {
        boolean _isValidDelegate = util.isValidDelegate(it);
        if (_isValidDelegate) {
          final Consumer<ResolvedMethod> _function = new Consumer<ResolvedMethod>() {
            @Override
            public void accept(final ResolvedMethod method) {
              util.implementMethod(it, method);
            }
          };
          util.getMethodsToImplement(it).forEach(_function);
        }
      }
    };
    elements.forEach(_function);
  }
}
