package utils.emfHelpers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.sun.tools.javac.util.Pair;

public class EmfInfo {

	private String name;
	private EPackage pack = null;
	
	public EmfInfo(String x){
		name = x;
		try {
			Class<?>[] params = null;
			Method m = Class.forName(
					name.toLowerCase() + ".impl."
							+ name.substring(0, 1).toUpperCase()
							+ name.substring(1, name.length()).toLowerCase()
							+ "PackageImpl").getMethod("init", params);
			pack = (EPackage) m.invoke(pack, params);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public HashSet<String> getClasses() {
		HashSet<String> classes = new HashSet<String>();
		for (EClassifier cls : pack.getEClassifiers()) {
			if (cls instanceof EClass) {
				EClass clsX = (EClass) cls;
				if(! clsX.isAbstract()){
					classes.add(clsX.getName());
				}
			}
		}
		return classes;
	}
	
	//get les references avec cardinalité * pour classe non abstraite
	//resultat nom classe collection de pair non ref et type element
	public HashMap<String,HashSet<Pair<String,String>>> getClassesReferencesStar() {
		HashMap<String,HashSet<Pair<String,String>>> classes = new HashMap<String,HashSet<Pair<String,String>>>();
		for (EClassifier cls : pack.getEClassifiers()) {
			if (cls instanceof EClass) {
				EClass clsX = (EClass) cls;
				if(! clsX.isAbstract()){
					classes.put(clsX.getName(), new HashSet<Pair<String,String>>());
					for(EReference ref : clsX.getEAllReferences()){
						if(ref.getUpperBound() == -1){
							Pair p = new Pair<String, String>(ref.getName(), ref.getEType().getName());
							classes.get(clsX.getName()).add(p);
//							System.out.println("ref : "+ref.getName());
						}
					}
				}
			}
		}
		return classes;
	}
	
	public static void main(String[] args){
		
		EmfInfo info = new EmfInfo("Policy");
		System.out.println("classes");
		info.getClasses();
		System.out.println("references");
		info.getClassesReferencesStar();
		
	}
	
	
}
