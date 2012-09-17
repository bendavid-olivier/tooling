package graphoTools.transformations;
import graphoTools.editor.GraphOEditor;
import grapho.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
public class GraphO2GraphO{
  public GraphO grapho;
  public ArrayList<String> primitives;
  public GraphO2GraphO(GraphO x ){
grapho = x;

  }
  public GraphO transformation(){
		GraphO g = GraphoFactory.eINSTANCE.createGraphO();
	    return g;

  }
}