package kevoreeTools.transformations;
import kevoreeTools.editor.KevoreeEditor;
import kevoree.*;
import java.awt.*;
import java.awt.event.*;
import grapho.*;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
public class Kevoree2GraphO{
  public Kevoree kevoree;
  public ArrayList<String> primitives;
  public Kevoree2GraphO(Kevoree x ){
kevoree = x;

  }
  public GraphO transformation(){
		GraphO g = GraphoFactory.eINSTANCE.createGraphO();
	    return g;

  }
}