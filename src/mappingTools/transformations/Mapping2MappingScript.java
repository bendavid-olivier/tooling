package mappingTools.transformations;
import mappingTools.editor.MappingEditor;
import mapping.*;
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
public class Mapping2MappingScript{
  public Mapping mapping;
  public Mapping2MappingScript(Mapping x ){
		mapping = x;

  }
  public String transformation(){
	   return null;

  }
}