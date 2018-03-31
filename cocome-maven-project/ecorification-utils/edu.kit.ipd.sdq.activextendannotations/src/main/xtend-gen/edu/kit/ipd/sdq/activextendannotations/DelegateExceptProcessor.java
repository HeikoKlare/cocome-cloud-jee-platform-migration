package edu.kit.ipd.sdq.activextendannotations;

import com.google.common.annotations.Beta;
import edu.kit.ipd.sdq.activextendannotations.DelegateExcept;
import java.util.Collection;
import java.util.Collections;
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
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@Beta
@SuppressWarnings("all")
public class DelegateExceptProcessor implements TransformationParticipant<MutableMemberDeclaration> {
  @Beta
  public static class Util extends DelegateProcessor.Util {
    @Extension
    private TransformationContext context;
    
    public Util(final TransformationContext context) {
      super(context);
      this.context = context;
    }
    
    public Iterable<ResolvedMethod> filterMethodsFromExceptionalInterfaces(final MemberDeclaration member, final Collection<ResolvedMethod> methods) {
      final Function1<TypeReference, String> _function = new Function1<TypeReference, String>() {
        @Override
        public String apply(final TypeReference it) {
          return it.getName();
        }
      };
      final List<String> exceptionalInterfaceNames = ListExtensions.<TypeReference, String>map(((List<TypeReference>)Conversions.doWrapArray(member.findAnnotation(this.context.findTypeGlobally(DelegateExcept.class)).getClassArrayValue("value"))), _function);
      final Function1<ResolvedMethod, Boolean> _function_1 = new Function1<ResolvedMethod, Boolean>() {
        @Override
        public Boolean apply(final ResolvedMethod method) {
          final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
            @Override
            public Boolean apply(final String name) {
              return Boolean.valueOf(method.getDeclaration().getDeclaringType().getQualifiedName().equals(name));
            }
          };
          boolean _exists = IterableExtensions.<String>exists(exceptionalInterfaceNames, _function);
          return Boolean.valueOf((!_exists));
        }
      };
      return IterableExtensions.<ResolvedMethod>filter(methods, _function_1);
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
          AnnotationReference _findAnnotation = it.findAnnotation(Util.this.context.findTypeGlobally(DelegateExcept.class));
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
      return Collections.<TypeReference>unmodifiableSet(CollectionLiterals.<TypeReference>newHashSet());
    }
  }
  
  @Override
  public void doTransform(final List<? extends MutableMemberDeclaration> elements, @Extension final TransformationContext context) {
    @Extension
    final DelegateExceptProcessor.Util util = new DelegateExceptProcessor.Util(context);
    final Consumer<MutableMemberDeclaration> _function = new Consumer<MutableMemberDeclaration>() {
      @Override
      public void accept(final MutableMemberDeclaration it) {
        boolean _isValidDelegate = util.isValidDelegate(it);
        if (_isValidDelegate) {
          final Iterable<ResolvedMethod> relevantMethods = util.filterMethodsFromExceptionalInterfaces(it, util.getMethodsToImplement(it));
          final Consumer<ResolvedMethod> _function = new Consumer<ResolvedMethod>() {
            @Override
            public void accept(final ResolvedMethod method) {
              util.implementMethod(it, method);
            }
          };
          relevantMethods.forEach(_function);
        }
      }
    };
    elements.forEach(_function);
  }
}
