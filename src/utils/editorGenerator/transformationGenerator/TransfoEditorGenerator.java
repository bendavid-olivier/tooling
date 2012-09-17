package utils.editorGenerator.transformationGenerator;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javaz.JavaClass;
import javaz.Method;

import utils.editorGenerator.FileGenerator;
import utils.editorGenerator.MetaModelToolsGenerator;
import utils.editorGenerator.monitorGenerator.MonitorGenerator;
import utils.writer.FileWriterO;

public class TransfoEditorGenerator extends FileGenerator{

	private String packName;
	private String containerRoot;
	private MetaModelToolsGenerator mmtg;
	public TransfoEditorGenerator(MetaModelToolsGenerator m, String pack) {
		mmtg =m;
		packName = pack;
		containerRoot = mmtg.name;
	}
	
	public void addModelScript2Model(){
		JavaClass cls = mmtg.editor.addPublicClass(containerRoot+"Script2"+containerRoot, packName);
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot
				+ "Editor", containerRoot.toLowerCase()+"Tools.editor"));		
		cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()));
		cls.getImports().add(mmtg.editor.getClassByName("*","java.awt"));
		cls.getImports().add(mmtg.editor.getClassByName("*","java.awt.event"));
		cls.getImports().add(mmtg.editor.getClassByName("ArrayList","java.util"));
		cls.getImports().add(mmtg.editor.getClassByName("Method","java.lang.reflect"));
		cls.getImports().add(mmtg.editor.getClassByName("InvocationTargetException","java.lang.reflect"));
	
		
		mmtg.editor.addClassPublicField(cls, "script", "String");
		mmtg.editor.addClassPublicField(cls, "primitives", "ArrayList<String>");
		
		String scriptName =  containerRoot+"Script";
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "txt", "String");
		String block ="script = txt.replaceAll(\"\\n\", \" \");"+"\n"+
					"script = script.substring(script.indexOf(\""+scriptName+"{\") + "+scriptName.length()+"+"+1+",script.indexOf(\"}\"));"+"\n"+
					"script = script.replace(\" \", \"\");"+"\n"+
					"primitives = new ArrayList<String>();"+"\n"+
					"initPrimitives();"+"\n";
		mmtg.editor.addMethodBlock(m, block);

		Method m1 = mmtg.editor.addClassPublicMethod(cls, "initPrimitives");
		block =	"for (Method m : "+containerRoot+"Editor.class.getMethods()){"+"\n"+
						"primitives.add(m.getName());"+"\n"+
					"}"+"\n";
		mmtg.editor.addMethodBlock(m1, block);

	
		Method m11 = mmtg.editor.addClassPublicMethod(cls, "transformation");
		mmtg.editor.addMethodParameterOUT(m11, containerRoot);
		block =	"    "+containerRoot+" "+ containerRoot.toLowerCase()+"= "+containerRoot.substring(0, 1).toUpperCase()+containerRoot.substring(1,containerRoot.length()).toLowerCase()+"Factory.eINSTANCE.create"+containerRoot+"();"+"\n"+
				"    "+containerRoot.toLowerCase()+"Tools.editor."+containerRoot+"Editor "+containerRoot.toLowerCase()+"Editor = new "+containerRoot.toLowerCase()+"Tools.editor."+containerRoot+"Editor("+containerRoot.toLowerCase()+");"+"\n"+
				"	 parseExpressions("+containerRoot.toLowerCase()+"Editor);"+"\n"+
				"	return "+containerRoot.toLowerCase()+";"+"\n";
		mmtg.editor.addMethodBlock(m11, block);

		Method m12 = mmtg.editor.addClassPublicMethod(cls, "transformation");
		mmtg.editor.addMethodParameterIN(m12, containerRoot.toLowerCase(), containerRoot);
		block =	"    "+containerRoot.toLowerCase()+"Tools.editor."+containerRoot+"Editor "+containerRoot.toLowerCase()+"Editor = new "+containerRoot.toLowerCase()+"Tools.editor."+containerRoot+"Editor("+containerRoot.toLowerCase()+");"+"\n"+
				"	 parseExpressions("+containerRoot.toLowerCase()+"Editor);"+"\n";
		mmtg.editor.addMethodBlock(m12, block);
				

		Method m13 = mmtg.editor.addClassPublicMethod(cls, "parseExpressions");
		mmtg.editor.addMethodParameterIN(m13, containerRoot.toLowerCase()+"Editor", containerRoot.toLowerCase()+"Tools.editor."+containerRoot+"Editor");
		block =	"for (String expr : script.split(\";\")) {"+"\n"+
						"String exprPrim = expr.substring(0,expr.indexOf(\"(\"));"+"\n"+
						"for (String prim : primitives) {"+"\n"+
							"if (exprPrim.equals(prim)) {"+"\n"+
								"triggerMethod("+containerRoot.toLowerCase()+"Editor, parseExpressionArguments(expr) ,prim);"+"\n"+
							"}"+"\n"+
						"}"+"\n"+
				"}"+"\n";
		mmtg.editor.addMethodBlock(m13, block);
		
		Method m2 = mmtg.editor.addClassPublicMethod(cls, "parseExpressionArguments");
		mmtg.editor.addMethodParameterIN(m2, "expr", "String");
		mmtg.editor.addMethodParameterOUT(m2, "java.lang.Object[]");
		block =	"String txt = expr.substring(expr.indexOf(\"(\") + 1, expr.indexOf(\")\"));"+"\n"+
					"java.lang.Object[] args = new java.lang.Object[txt.split(\",\").length];"+"\n"+
					"int cpt = 0;"+"\n"+
					"for (String arg : txt.split(\",\")) {"+"\n"+
						"args[cpt] = arg;"+"\n"+
						"cpt=cpt+1;"+"\n"+
					"}"+"\n"+
					"return args;"+"\n";
		mmtg.editor.addMethodBlock(m2, block);


		Method m3 = mmtg.editor.addClassPublicMethod(cls, "triggerMethod");
		mmtg.editor.addMethodParameterIN(m3, "o", "java.lang.Object");
		mmtg.editor.addMethodParameterIN(m3, "args", "java.lang.Object[]");
		mmtg.editor.addMethodParameterIN(m3, "nomMethode", "String");
		block =	"Class[] paramTypes = null;"+"\n"+
				"if (args != null) {"+"\n"+
				"		paramTypes = new Class[args.length];"+"\n"+
				"		for (int i = 0; i < args.length; i++) {"+"\n"+
				"			boolean isInt = true;"+"\n"+
				"			for(char c : args[i].toString().toCharArray()){"+"\n"+
				"				if (!((c =='0')||(c =='1')||(c =='2')||(c =='3')||(c =='4')||(c =='5')||(c =='6')||(c =='7')||(c =='8')||(c =='9'))){"+"\n"+
				"					isInt = false;"+"\n"+
				"				}"+"\n"+
				"			}"+"\n"+
				"			if(isInt){"+"\n"+
				"				paramTypes[i] = int.class;"+"\n"+
				"				int arg = Integer.parseInt((String) args[i]);"+"\n"+
				"				args[i] = arg;"+"\n"+
				"			}"+"\n"+
				"			else if(args[i].toString().equals(\"true\")){"+"\n"+
				"				paramTypes[i] = boolean.class;"+"\n"+
				"				boolean arg = true;"+"\n"+
				"				args[i] = arg;"+"\n"+
				"			}"+"\n"+
				"			else if(args[i].toString().equals(\"false\")){"+"\n"+
				"				paramTypes[i] = boolean.class;"+"\n"+
				"				boolean arg = false;"+"\n"+
				"				args[i] = arg;"+"\n"+
				"			}"+"\n"+
				"			else{"+"\n"+
				"			paramTypes[i] = args[i].getClass();"+"\n"+
				"			}"+"\n"+
				"		}"+"\n"+
				"	}"+"\n"+
					"Method m = null;"+"\n"+
					"try {"+"\n"+
						"m = o.getClass().getMethod(nomMethode, paramTypes);"+"\n"+
						"m.setAccessible(true);"+"\n"+
						"m.invoke(o, args);"+"\n"+
					"} catch (SecurityException e) {"+"\n"+
						"// TODO Auto-generated catch block"+"\n"+
						"e.printStackTrace();"+"\n"+
					"} catch (NoSuchMethodException e) {"+"\n"+
						"// TODO Auto-generated catch block"+"\n"+
						"e.printStackTrace();"+"\n"+
					"} catch (IllegalArgumentException e) {"+"\n"+
						"// TODO Auto-generated catch block"+"\n"+
						"e.printStackTrace();"+"\n"+
					"} catch (IllegalAccessException e) {"+"\n"+
						"// TODO Auto-generated catch block"+"\n"+
						"e.printStackTrace();"+"\n"+
					"} catch (InvocationTargetException e) {"+"\n"+
						"// TODO Auto-generated catch block"+"\n"+
						"e.printStackTrace();"+"\n"+
					"}"+"\n";
			mmtg.editor.addMethodBlock(m3, block);
	}
	
	
	public void addModel2GraphO(){ 
		JavaClass cls = mmtg.editor.addPublicClass(containerRoot+"2GraphO", packName);
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot
				+ "Editor", containerRoot.toLowerCase()+"Tools.editor"));		
		cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()));
		cls.getImports().add(mmtg.editor.getClassByName("*","java.awt"));
		cls.getImports().add(mmtg.editor.getClassByName("*","java.awt.event"));
		cls.getImports().add(mmtg.editor.getClassByName("*","grapho"));
		cls.getImports().add(mmtg.editor.getClassByName("ArrayList","java.util"));
		cls.getImports().add(mmtg.editor.getClassByName("Method","java.lang.reflect"));
		cls.getImports().add(mmtg.editor.getClassByName("InvocationTargetException","java.lang.reflect"));
	
		
		mmtg.editor.addClassPublicField(cls, containerRoot.toLowerCase(), containerRoot);
		mmtg.editor.addClassPublicField(cls, "primitives", "ArrayList<String>");
		
		String scriptName =  containerRoot+"Script";
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "x", containerRoot);
		String block =containerRoot.toLowerCase()+" = x;" + "\n";
		mmtg.editor.addMethodBlock(m, block);
		
		Method m1 = mmtg.editor.addClassPublicMethod(cls, "transformation");
		mmtg.editor.addMethodParameterOUT(m1, "GraphO");
		block =	"		GraphO g = GraphoFactory.eINSTANCE.createGraphO();"+"\n"+
				"	    return g;"+ "\n";
		mmtg.editor.addMethodBlock(m1, block);	
	}
	
	
	public void addGraphOModel2Dot(){ 
		if(containerRoot.equals("GraphO")){
			JavaClass cls = mmtg.editor.addPublicClass("GraphO2DotFile", packName);
			cls.getImports().add(mmtg.editor.getClassByName(containerRoot
					+ "Editor", containerRoot.toLowerCase()+"Tools.editor"));		
			cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()));
			cls.getImports().add(mmtg.editor.getClassByName("*","java.awt"));
			cls.getImports().add(mmtg.editor.getClassByName("*","java.awt.event"));
			cls.getImports().add(mmtg.editor.getClassByName("*","grapho"));
			cls.getImports().add(mmtg.editor.getClassByName("*","grapho.impl"));
			cls.getImports().add(mmtg.editor.getClassByName("ArrayList","java.util"));
			cls.getImports().add(mmtg.editor.getClassByName("Method","java.lang.reflect"));
			cls.getImports().add(mmtg.editor.getClassByName("File","java.io"));
			cls.getImports().add(mmtg.editor.getClassByName("IOException","java.io"));
			cls.getImports().add(mmtg.editor.getClassByName("URI","org.eclipse.emf.common.util"));
			cls.getImports().add(mmtg.editor.getClassByName("Resource","org.eclipse.emf.ecore.resource"));
			cls.getImports().add(mmtg.editor.getClassByName("ResourceSet","org.eclipse.emf.ecore.resource"));
			cls.getImports().add(mmtg.editor.getClassByName("ResourceSetImpl","org.eclipse.emf.ecore.resource.impl"));
			cls.getImports().add(mmtg.editor.getClassByName("FileWriterO","utils.writer"));
			
			mmtg.editor.addClassPublicField(cls, "grapho", "GraphO");
			
			Method m = mmtg.editor.addClassPublicConstructor(cls);
			mmtg.editor.addMethodParameterIN(m, "g", "GraphO");
			String block ="		grapho =g;"+"\n";
			mmtg.editor.addMethodBlock(m, block);
			
			Method m1 = mmtg.editor.addClassPublicMethod(cls, "transformation");
			mmtg.editor.addMethodParameterOUT(m1, "File");
			mmtg.editor.addMethodParameterIN(m1, "path", "String");
			block = "		String output = \"\";"+"\n";
			block = block + "		output = output + \"digraph G { \\n\";	"+"\n";
			block = block + "		for (GraphElement e : grapho.getElements()) {"+"\n";
			block = block + "			if (e instanceof NodeImpl){"+"\n";
			block = block + "				output = output + e.getName()+ \" [color=\" + ((Node)e).getColor() + \" shape=\" + ((Node)e).getShape()+\" style=\" + ((Node)e).getStyle() + \" label=\" +((Node)e).getLabel()+\"  ];\\n\";"+"\n";
			block = block + "			}"+"\n";
			block = block + "		}"+"\n";
			block = block + "		for (GraphElement e : grapho.getElements()) {"+"\n";
			block = block + "			if (e instanceof EdgeImpl){"+"\n";
			block = block + "				output = output +  ((Edge)e).getNodeA().getName() + \" -> \" + ((Edge)e).getNodeB().getName() + \"[constraint=\" + ((Edge)e).isConstraintRank() +  \" color=\" + ((Edge)e).getColor()+\" style=\" + ((Edge)e).getStyle() + \"]\" + \";\\n\";"+"\n";
			block = block + "			}"+"\n";
			block = block + "		}"+"\n";
			block = block + "		output = output + \"}\";"+"\n";
					
			block = block + "		FileWriterO fw = new FileWriterO();"+"\n";
			block = block + "		File f = fw.writeStringOnFile(output, path);"+"\n";
			block = block + "		return f;"+"\n";
			mmtg.editor.addMethodBlock(m1, block);
		}			
	}
	
	public void addModel2ModelScript(){ 
		JavaClass cls = mmtg.editor.addPublicClass(containerRoot+"2"+containerRoot+"Script", packName);
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot
				+ "Editor", containerRoot.toLowerCase()+"Tools.editor"));		
		cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()));
		cls.getImports().add(mmtg.editor.getClassByName("*","java.awt"));
		cls.getImports().add(mmtg.editor.getClassByName("*","java.awt.event"));
		cls.getImports().add(mmtg.editor.getClassByName("*","grapho"));
		cls.getImports().add(mmtg.editor.getClassByName("*","grapho.impl"));
		cls.getImports().add(mmtg.editor.getClassByName("ArrayList","java.util"));
		cls.getImports().add(mmtg.editor.getClassByName("Method","java.lang.reflect"));
		cls.getImports().add(mmtg.editor.getClassByName("File","java.io"));
		cls.getImports().add(mmtg.editor.getClassByName("IOException","java.io"));
		cls.getImports().add(mmtg.editor.getClassByName("URI","org.eclipse.emf.common.util"));
		cls.getImports().add(mmtg.editor.getClassByName("Resource","org.eclipse.emf.ecore.resource"));
		cls.getImports().add(mmtg.editor.getClassByName("ResourceSet","org.eclipse.emf.ecore.resource"));
		cls.getImports().add(mmtg.editor.getClassByName("ResourceSetImpl","org.eclipse.emf.ecore.resource.impl"));
		cls.getImports().add(mmtg.editor.getClassByName("FileWriterO","utils.writer"));
		
		mmtg.editor.addClassPublicField(cls, containerRoot.toLowerCase(), containerRoot);
		
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "x", containerRoot);
		String block ="		"+containerRoot.toLowerCase()+" = x;" + "\n";
		mmtg.editor.addMethodBlock(m, block);
		
		Method m1 = mmtg.editor.addClassPublicMethod(cls,"transformation");
		mmtg.editor.addMethodParameterOUT(m1, "String");
		block ="	   return null;"+ "\n";
		mmtg.editor.addMethodBlock(m1, block);
	}
	
	
}
