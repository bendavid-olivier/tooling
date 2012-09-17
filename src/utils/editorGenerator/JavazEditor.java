package utils.editorGenerator;
import javaz.*;

import org.eclipse.emf.common.util.EList;
public class JavazEditor{
	private Javaz javaz;
	private JavazFactory factory;
	public JavazEditor(Javaz x) {
		javaz = x;
		factory = JavazFactory.eINSTANCE;
	}
	
	public void addPackageX(String name){
		if (getPackageByName(name)==null){
			JavaPackageX pack = factory.createJavaPackageX();		
			pack.setName(name);
			pack.setNeedToGenerate(true);
			javaz.getPackages().add(pack);
		}
	}
	
	public void addPackageXForImport(String name){
		if (getPackageByName(name)==null){
			JavaPackageX pack = factory.createJavaPackageX();		
			pack.setName(name);
			pack.setNeedToGenerate(false);
			javaz.getPackages().add(pack);
		}
	}
	
	public JavaPackageX getPackageByName(String name){
		JavaPackageX res = null;
		for(JavaPackageX x : javaz.getPackages()){
			if(x.getName().equals(name)){
				res = x;
			}
		}
		return res;
	}
	
	public void addClassForImport(String className, String packName){
		if(getClassByName(className, packName)==null){
			addPackageXForImport(packName);
			JavaClass jc = factory.createJavaClass();
			jc.setName(className);
			jc.setPackage(getPackageByName(packName));
			jc.setRewritable(false);
			jc.setNeedToGenerate(false);
			javaz.getClasses().add(jc);
		}
	}
	
	public JavaClass addPublicClass(String className, String packName){
		JavaClass jc = factory.createJavaClass();
		jc.setName(className);
		jc.setPackage(getPackageByName(packName));
		jc.setKind(JavaKind.CLASS);
		jc.setPublic(true);
		jc.setRewritable(true);
		jc.setNeedToGenerate(true);
		javaz.getClasses().add(jc);		
		return jc;
	}
	
	public JavaClass addPublicInterface(String className, String packName){
		JavaClass jc = factory.createJavaClass();
		jc.setName(className);
		jc.setPackage(getPackageByName(packName));
		jc.setKind(JavaKind.INTERFACE);
		jc.setPublic(true);
		jc.setRewritable(true);
		jc.setNeedToGenerate(true);
		javaz.getClasses().add(jc);		
		return jc;
	}
	
	public void addClassPrivateField(JavaClass jc, String fieldName, String type){
		Field f = factory.createField();
		f.setVisibility(JavaVisibilityKind.PRIVATE);
		f.setName(fieldName);
		f.setType(type);
		jc.getFields().add(f);
	}
	
	public void addClassPublicField(JavaClass jc, String fieldName, String type){
		Field f = factory.createField();
		f.setVisibility(JavaVisibilityKind.PUBLIC);
		f.setName(fieldName);
		f.setType(type);
		jc.getFields().add(f);
	}
	
	public void addClassFinalField(JavaClass jc, String fieldName, String type){
		Field f = factory.createField();
//		f.setVisibility(JavaVisibilityKind.PUBLIC);
		f.setFinal(true);
		f.setName(fieldName);
		f.setType(type);
		jc.getFields().add(f);
	}
	
	public Method addClassPublicConstructor(JavaClass jc){
		Method m = factory.createMethod();
		m.setVisibility(JavaVisibilityKind.PUBLIC);
		m.setName(jc.getName());
		m.setConstructor(true);
		jc.getMethods().add(m);
		return m;
	}
	
	public Method addClassPublicMethod(JavaClass jc, String methodName){
		Method m = factory.createMethod();
		m.setVisibility(JavaVisibilityKind.PUBLIC);
		m.setName(methodName);
		m.setConstructor(false);
		jc.getMethods().add(m);
		return m;
	}
	
	public Method addClassPublicStaticMethod(JavaClass jc, String methodName){
		Method m = factory.createMethod();
		m.setVisibility(JavaVisibilityKind.PUBLIC);
		m.setName(methodName);
		m.setConstructor(false);
		m.setStatic(true);
		jc.getMethods().add(m);
		return m;
	}
	
	public void addMethodParameterIN(Method m, String paramName, String paramType){
		JavaParameter jp = factory.createJavaParameter();
		jp.setName(paramName);
		jp.setType(paramType);
		jp.setKind(JavaParameterKind.IN);
		m.getParameters().add(jp);
	}
	
	public void addMethodParameterOUT(Method m, String paramType){
		JavaParameter jp = factory.createJavaParameter();
		jp.setType(paramType);
		jp.setKind(JavaParameterKind.OUT);
		m.getParameters().add(jp);
	}
	
	public void addMethodBlock(Method m, String content){
		Block b = factory.createBlock();
		b.setContent(content);
		m.setBlock(b);
	}
	
	
	public JavaClass getClassByName(String className, String packName){
		JavaClass res = null;
		for(JavaClass jc : javaz.getClasses()){
			if(jc.getName().equals(className) && jc.getPackage().getName().equals(packName)){
				res = jc;
			}
		}
		return res;
	}
	
	public EList<JavaParameter> getMethodparameters(Method value){
		if(!(value == null)){
			EList<JavaParameter> res = value.getParameters();
			return res;
		}
		return null;
	}
	public EList<JavaPackageX> getJavazpackages(Javaz value){
		if(!(value == null)){
			EList<JavaPackageX> res = value.getPackages();
			return res;
		}
		return null;
	}
	public EList<JavaClass> getJavazclasses(Javaz value){
		if(!(value == null)){
			EList<JavaClass> res = value.getClasses();
			return res;
		}
		return null;
	}
	public EList<JavaClass> getJavaClassimplements(JavaClass value){
		if(!(value == null)){
			EList<JavaClass> res = value.getImplements();
			return res;
		}
		return null;
	}
	public EList<Field> getJavaClassfields(JavaClass value){
		if(!(value == null)){
			EList<Field> res = value.getFields();
			return res;
		}
		return null;
	}
	public EList<JavaClass> getJavaClassimports(JavaClass value){
		if(!(value == null)){
			EList<JavaClass> res = value.getImports();
			return res;
		}
		return null;
	}
	public EList<Method> getJavaClassmethods(JavaClass value){
		if(!(value == null)){
			EList<Method> res = value.getMethods();
			return res;
		}
		return null;
	}
}