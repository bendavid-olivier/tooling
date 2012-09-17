package policyTools.transformations;
import policyTools.editor.PolicyEditor;
import policy.*;
import java.awt.*;
import java.awt.event.*;
import grapho.*;
import grapho.impl.*;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.io.File;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import utils.writer.FileWriterO;
public class Policy2PolicyScript{
  public Policy policy;
  public Policy2PolicyScript(Policy x ){
		policy = x;

  }
  public String transformation(){
	   return null;

  }
}