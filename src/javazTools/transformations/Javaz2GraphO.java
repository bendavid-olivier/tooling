package javazTools.transformations;
import javazTools.editor.JavazEditor;
import javaz.*;
import java.awt.*;
import java.awt.event.*;
import grapho.*;
import graphoTools.editor.GraphOEditor;

import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
public class Javaz2GraphO{
  public Javaz javaz;
  public ArrayList<String> primitives;
  
  public Javaz2GraphO(Javaz x ){
	  javaz = x;
  }
  
  public GraphO transformation(){
		GraphO g = GraphoFactory.eINSTANCE.createGraphO();
		GraphOEditor editor = new GraphOEditor(g);
		
		editor.addNode("Package");
		for(JavaPackageX jp : javaz.getPackages()){
			if(jp.isNeedToGenerate()){
				String pck = jp.getName().replace(".", "O");
				editor.addNode(pck);
				editor.addEdge("Package", pck);
			}
		}
		
		for(JavaClass jc : javaz.getClasses()){
			if(jc.isNeedToGenerate()){
				String pck = jc.getPackage().getName().replace(".", "O");
				String cls = jc.getName();
				editor.addNode(cls);
				editor.addEdge(pck,cls);
			}
		}
	    return g;
  }
}