package mappingTools.guiEditor.controllers;
import mappingTools.guiEditor.graphicComponents.MappingTextualEditor;

import mappingTools.guiEditor.graphicComponents.*;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.BuilderRegistry;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;
public class MappingListener{
  public MappingTextualEditor editor;
 
  public MappingListener(MappingTextualEditor e ){
		editor = e;
		registerMatchers();
		initMatchers();
	

  }
  public void registerMatchers(){


  }
  public void initMatchers(){

	
  }
  public void listen(){


  }
}