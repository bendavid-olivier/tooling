package policyTools.transformations;
import policyTools.editor.PolicyEditor;
import policy.*;
import java.awt.*;
import java.awt.event.*;
import grapho.*;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
public class Policy2GraphO{
  public Policy policy;
  public ArrayList<String> primitives;
  public Policy2GraphO(Policy x ){
policy = x;

  }
  public GraphO transformation(){
		GraphO g = GraphoFactory.eINSTANCE.createGraphO();
	    return g;

  }
}