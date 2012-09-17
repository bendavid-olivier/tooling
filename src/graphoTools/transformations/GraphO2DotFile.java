package graphoTools.transformations;
import graphoTools.editor.GraphOEditor;
import grapho.*;
import java.awt.*;
import java.awt.event.*;
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
public class GraphO2DotFile{
  public GraphO grapho;
  public GraphO2DotFile(GraphO g ){
		grapho =g;

  }
  public File transformation(String path ){
		String output = "";
		output = output + "digraph G { \n";	
		for (GraphElement e : grapho.getElements()) {
			if (e instanceof NodeImpl){
				output = output + e.getName()+ " [color=" + ((Node)e).getColor() + " shape=" + ((Node)e).getShape()+" style=" + ((Node)e).getStyle() + " label=" +((Node)e).getLabel()+"  ];\n";
			}
		}
		for (GraphElement e : grapho.getElements()) {
			if (e instanceof EdgeImpl){
				output = output +  ((Edge)e).getNodeA().getName() + " -> " + ((Edge)e).getNodeB().getName() + "[constraint=" + ((Edge)e).isConstraintRank() +  " color=" + ((Edge)e).getColor()+" style=" + ((Edge)e).getStyle() + "]" + ";\n";
			}
		}
		output = output + "}";
		FileWriterO fw = new FileWriterO();
		File f = fw.writeStringOnFile(output, path);
		return f;

  }
}