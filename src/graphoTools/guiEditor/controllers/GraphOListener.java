package graphoTools.guiEditor.controllers;
import graphoTools.guiEditor.graphicComponents.GraphOTextualEditor;
import patternbuilders.grapho.*;
import patternmatchers.grapho.*;
import signatures.grapho.*;
import graphoTools.guiEditor.graphicComponents.*;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.BuilderRegistry;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;
public class GraphOListener{
  public GraphOTextualEditor editor;
  private GraphoeditorMatcher graphoeditorMatcher;
  public DeltaMonitor<GraphoeditorSignature> monitorGraphOEditor;
  private NodeMatcher nodeMatcher;
  public DeltaMonitor<NodeSignature> monitorNode;
  private GraphoMatcher graphoMatcher;
  public DeltaMonitor<GraphoSignature> monitorGraphO;
  private EdgeMatcher edgeMatcher;
  public DeltaMonitor<EdgeSignature> monitorEdge;
  public GraphOListener(GraphOTextualEditor e ){
		editor = e;
		registerMatchers();
		initMatchers();
		monitorGraphOEditor = graphoeditorMatcher.newDeltaMonitor(false);
		monitorNode = nodeMatcher.newDeltaMonitor(false);
		monitorGraphO = graphoMatcher.newDeltaMonitor(false);
		monitorEdge = edgeMatcher.newDeltaMonitor(false);

  }
  public void registerMatchers(){

	BuilderRegistry.getContributedStatelessPatternBuilders().put(
	     GraphoeditorMatcher.FACTORY.getPatternName(),
	     new patternbuilders.grapho.PatternBuilderForgraphoeditor()); 
	BuilderRegistry.getContributedStatelessPatternBuilders().put(
	     NodeMatcher.FACTORY.getPatternName(),
	     new patternbuilders.grapho.PatternBuilderFornode()); 
	BuilderRegistry.getContributedStatelessPatternBuilders().put(
	     GraphoMatcher.FACTORY.getPatternName(),
	     new patternbuilders.grapho.PatternBuilderForgrapho()); 
	BuilderRegistry.getContributedStatelessPatternBuilders().put(
	     EdgeMatcher.FACTORY.getPatternName(),
	     new patternbuilders.grapho.PatternBuilderForedge()); 

  }
  public void initMatchers(){

	  try {
         graphoeditorMatcher = GraphoeditorMatcher.FACTORY.getMatcher(editor.getGraphO());
         nodeMatcher = NodeMatcher.FACTORY.getMatcher(editor.getGraphO());
         graphoMatcher = GraphoMatcher.FACTORY.getMatcher(editor.getGraphO());
         edgeMatcher = EdgeMatcher.FACTORY.getMatcher(editor.getGraphO());
	  } catch (IncQueryRuntimeException e) {
	  e.printStackTrace();
      }

  }
  public void listen(){

      graphoeditorMatcher.addCallbackAfterUpdates(new Runnable() {
        @Override
           public void run() {
      					for (GraphoeditorSignature sig : monitorGraphOEditor.matchFoundEvents) {
      					}				
      					for (GraphoeditorSignature sig : monitorGraphOEditor.matchLostEvents) {
      					}				
      					monitorGraphOEditor.clear();
      				}
      			});
      nodeMatcher.addCallbackAfterUpdates(new Runnable() {
        @Override
           public void run() {
      					for (NodeSignature sig : monitorNode.matchFoundEvents) {
      					}				
      					for (NodeSignature sig : monitorNode.matchLostEvents) {
      					}				
      					monitorNode.clear();
      				}
      			});
      graphoMatcher.addCallbackAfterUpdates(new Runnable() {
        @Override
           public void run() {
      					for (GraphoSignature sig : monitorGraphO.matchFoundEvents) {
      					}				
      					for (GraphoSignature sig : monitorGraphO.matchLostEvents) {
      					}				
      					monitorGraphO.clear();
      				}
      			});
      edgeMatcher.addCallbackAfterUpdates(new Runnable() {
        @Override
           public void run() {
      					for (EdgeSignature sig : monitorEdge.matchFoundEvents) {
      					}				
      					for (EdgeSignature sig : monitorEdge.matchLostEvents) {
      					}				
      					monitorEdge.clear();
      				}
      			});

  }
}