package mappingTools.transformations;
import mappingTools.editor.MappingEditor;
import mapping.*;
import java.awt.*;
import java.awt.event.*;
import grapho.*;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
public class Mapping2GraphO{
  public Mapping mapping;
  public ArrayList<String> primitives;
  public Mapping2GraphO(Mapping x ){
mapping = x;

  }
  public GraphO transformation(){
		GraphO g = GraphoFactory.eINSTANCE.createGraphO();
	    return g;

  }
}