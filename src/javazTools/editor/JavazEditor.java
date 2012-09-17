package javazTools.editor;
import javaz.Javaz;
import javaz.JavazFactory;
import org.eclipse.emf.common.util.EList;
import javaz.*;
public class JavazEditor{
  private Javaz javaz;
  private JavazFactory factory;
  public JavazEditor(Javaz x ){
		javaz = x;
		factory = JavazFactory.eINSTANCE;

  }
  public EList<JavaParameter> getMethodparameters(Method value ){
		if(!(value == null)){
			EList<JavaParameter> res = value.getParameters();
			return res;
		}
		return null;

  }
  public EList<JavaPackageX> getJavazpackages(Javaz value ){
		if(!(value == null)){
			EList<JavaPackageX> res = value.getPackages();
			return res;
		}
		return null;

  }
  public EList<JavaClass> getJavazclasses(Javaz value ){
		if(!(value == null)){
			EList<JavaClass> res = value.getClasses();
			return res;
		}
		return null;

  }
  public EList<JavaClass> getJavaClassimplements(JavaClass value ){
		if(!(value == null)){
			EList<JavaClass> res = value.getImplements();
			return res;
		}
		return null;

  }
  public EList<Field> getJavaClassfields(JavaClass value ){
		if(!(value == null)){
			EList<Field> res = value.getFields();
			return res;
		}
		return null;

  }
  public EList<JavaClass> getJavaClassimports(JavaClass value ){
		if(!(value == null)){
			EList<JavaClass> res = value.getImports();
			return res;
		}
		return null;

  }
  public EList<Method> getJavaClassmethods(JavaClass value ){
		if(!(value == null)){
			EList<Method> res = value.getMethods();
			return res;
		}
		return null;

  }
}