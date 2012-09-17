package utils.editorGenerator.editorGenerator;

import grapho.Edge;
import grapho.GraphElement;
import grapho.GraphoFactory;
import grapho.Node;
import grapho.impl.EdgeImpl;
import grapho.impl.NodeImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javaz.JavaClass;
import javaz.Method;

import com.sun.tools.javac.util.Pair;


import utils.editorGenerator.FileGenerator;
import utils.editorGenerator.MetaModelToolsGenerator;
import utils.emfHelpers.EmfInfo;
import utils.writer.FileWriterO;

public class EditorGenerator extends FileGenerator{
	private String packName;
	private String containerRoot;
	private MetaModelToolsGenerator mmtg;

	public EditorGenerator( MetaModelToolsGenerator m, String pack) {
		mmtg =m;
		packName = pack;
		containerRoot = mmtg.name;
	}

	public void addEditor() {
		EmfInfo info = new EmfInfo(containerRoot);		
		JavaClass cls = mmtg.editor.addPublicClass(containerRoot+"Editor", packName);	
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot, containerRoot.toLowerCase()));
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot+"Factory", containerRoot.toLowerCase()));	
		cls.getImports().add(mmtg.editor.getClassByName("EList", "org.eclipse.emf.common.util"));
		cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()));		
		mmtg.editor.addClassPrivateField(cls, containerRoot.toLowerCase(), containerRoot);
		mmtg.editor.addClassPrivateField(cls,  "factory",  containerRoot.substring(0, 1)+containerRoot.substring(1,containerRoot.length())+"Factory");			
		Method m = 	mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "x", containerRoot);
		String content = "		"+containerRoot.toLowerCase()+" = x;" + "\n" +
						 "		factory = "+containerRoot+"Factory.eINSTANCE;" + "\n" ;
		mmtg.editor.addMethodBlock(m, content);						
		//generation des getters pour les references
		for(String clsEMF : info.getClassesReferencesStar().keySet()){
			for(Pair<String,String> ref : info.getClassesReferencesStar().get(clsEMF)){
				Method m2 = mmtg.editor.addClassPublicMethod(cls, "get"+clsEMF+ref.fst);
				mmtg.editor.addMethodParameterOUT(m2, "EList<"+ref.snd+">");
				mmtg.editor.addMethodParameterIN(m2, "value", clsEMF);				
				String block = "		if(!(value == null)){"+ "\n" ;
				block = block +"			EList<"+ref.snd+"> res = value.get"+ref.fst.substring(0,1).toUpperCase()+ref.fst.substring(1, ref.fst.length())+"();"+ "\n" ;
				block = block +"			return res;"+ "\n" ;
				block = block +"		}"+ "\n" ;
				block = block +"		return null;"+ "\n" ;								
				mmtg.editor.addMethodBlock(m2, block);
			}
		}
		
		
		if(containerRoot.equals("GraphO")){
			Method m2 = mmtg.editor.addClassPublicMethod(cls, "getNodeByName");
			mmtg.editor.addMethodParameterOUT(m2, "Node");
			mmtg.editor.addMethodParameterIN(m2, "nodeName", "String");	
			String block = "		"+"Node res = null;"+"\n"+
					"		"+"for (GraphElement e : graphO.getElements()) {"+"\n"+
					"		"+"if (e instanceof NodeImpl && e.getName().equals(nodeName)) {"+"\n"+
					"		"+"res = (Node) e;"+"\n"+	
					"		"+"}"+"\n"+
					"		"+"return res;"+"\n";
			mmtg.editor.addMethodBlock(m2, block);
			
			Method m3 = mmtg.editor.addClassPublicMethod(cls, "addNode");
			mmtg.editor.addMethodParameterIN(m3, "e", "String");				
			block = "		"+"if (getNodeByName(e) == null){"+"\n"+
					"		"+"Node n = GraphoFactory.eINSTANCE.createNode();"+"\n"+
					"		"+"n.setColor(\"black\");"+"\n"+
					"		"+"n.setLabel(e);"+"\n"+
					"		"+"n.setName(e);"+"\n"+
					"		"+"n.setShape(\"ellipse\");"+"\n"+
					"		"+"n.setStyle(\"solid\");	"+"\n"+	
					"		"+"graphO.getElements().add(n);"+"\n"+
					"		"+"}"+"\n";
			mmtg.editor.addMethodBlock(m3, block);
			
			Method m4 = mmtg.editor.addClassPublicMethod(cls, "addNode");
			mmtg.editor.addMethodParameterIN(m4, "e", "String");
			mmtg.editor.addMethodParameterIN(m4, "color", "String");	
			block = "		"+"if (getNodeByName(e) == null){"+"\n"+
					"		"+"Node n = GraphoFactory.eINSTANCE.createNode();"+"\n"+
					"		"+"n.setColor(color);"+"\n"+
					"		"+"n.setLabel(e);"+"\n"+
					"		"+"n.setName(e);"+"\n"+
					"		"+"n.setShape(\"ellipse\");"+"\n"+
					"		"+"n.setStyle(\"solid\");	"+"\n"+	
					"		"+"graphO.getElements().add(n);"+"\n"+
					"		"+"}"+"\n";
			mmtg.editor.addMethodBlock(m4, block);
			
			
			Method m5 = mmtg.editor.addClassPublicMethod(cls, "getEdgeByName");
			mmtg.editor.addMethodParameterIN(m5, "edgeName", "String");
			mmtg.editor.addMethodParameterOUT(m5, "Edge");			
			block = "		"+"Edge res = null;"+"\n"+
					"		"+"for (GraphElement e : graphO.getElements()) {"+"\n"+
					"		"+"if (e instanceof EdgeImpl && e.getName().equals(edgeName)) {"+"\n"+
					"		"+"	res = (Edge) e;"+"\n"+
					"		"+"}"+"\n"+
					"		"+"}"+"\n"+
					"		"+"return res;"+"\n";
			mmtg.editor.addMethodBlock(m5, block);
			
			Method m6 = mmtg.editor.addClassPublicMethod(cls, "getEdgeByName");
			mmtg.editor.addMethodParameterIN(m6, "n1", "String");
			mmtg.editor.addMethodParameterIN(m6, "n2", "String");			
			block = "		"+"if (getEdgeByName(n1+n2) == null){"+"\n"+
					"		"+"Edge ed = GraphoFactory.eINSTANCE.createEdge();"+"\n"+
					"		"+"ed.setName(n1+n2);"+"\n"+
					"		"+"ed.setColor(\"black\");"+"\n"+
					"		"+"ed.setStyle(\"solid\");"+"\n"+
					"		"+"ed.setConstraintRank(true);"+"\n"+
					"		"+"ed.setNodeA(getNodeByName(n1));"+"\n"+
					"		"+"ed.setNodeB(getNodeByName(n2));"+"\n"+
					"		"+"graphO.getElements().add(ed);"+"\n"+
					"		"+"}"+"\n";			
			mmtg.editor.addMethodBlock(m6, block);
		}
	}
}

