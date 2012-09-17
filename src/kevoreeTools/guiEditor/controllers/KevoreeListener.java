package kevoreeTools.guiEditor.controllers;
import kevoreeTools.guiEditor.graphicComponents.KevoreeTextualEditor;
//import patternbuilders.kevoree.*;
//import patternmatchers.kevoree.*;
//import signatures.kevoree.*;
import kevoreeTools.guiEditor.graphicComponents.*;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.BuilderRegistry;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;
public class KevoreeListener{
  public KevoreeTextualEditor editor;
//  private PortMatcher portMatcher;
//  public DeltaMonitor<PortSignature> monitorPort;
//  private ChannelMatcher channelMatcher;
//  public DeltaMonitor<ChannelSignature> monitorChannel;
//  private NodeMatcher nodeMatcher;
//  public DeltaMonitor<NodeSignature> monitorNode;
//  private KevoreeMatcher kevoreeMatcher;
//  public DeltaMonitor<KevoreeSignature> monitorKevoree;
//  private KevoreeelementMatcher kevoreeelementMatcher;
//  public DeltaMonitor<KevoreeelementSignature> monitorKevoreeElement;
//  private ComponentMatcher componentMatcher;
//  public DeltaMonitor<ComponentSignature> monitorComponent;
//  private BindingMatcher bindingMatcher;
//  public DeltaMonitor<BindingSignature> monitorBinding;
  public KevoreeListener(KevoreeTextualEditor e ){
		editor = e;
//		registerMatchers();
//		initMatchers();
//		monitorPort = portMatcher.newDeltaMonitor(false);
//		monitorChannel = channelMatcher.newDeltaMonitor(false);
//		monitorNode = nodeMatcher.newDeltaMonitor(false);
//		monitorKevoree = kevoreeMatcher.newDeltaMonitor(false);
//		monitorKevoreeElement = kevoreeelementMatcher.newDeltaMonitor(false);
//		monitorComponent = componentMatcher.newDeltaMonitor(false);
//		monitorBinding = bindingMatcher.newDeltaMonitor(false);

  }
  public void registerMatchers(){

//	BuilderRegistry.getContributedStatelessPatternBuilders().put(
//	     PortMatcher.FACTORY.getPatternName(),
//	     new patternbuilders.kevoree.PatternBuilderForport()); 
//	BuilderRegistry.getContributedStatelessPatternBuilders().put(
//	     ChannelMatcher.FACTORY.getPatternName(),
//	     new patternbuilders.kevoree.PatternBuilderForchannel()); 
//	BuilderRegistry.getContributedStatelessPatternBuilders().put(
//	     NodeMatcher.FACTORY.getPatternName(),
//	     new patternbuilders.kevoree.PatternBuilderFornode()); 
//	BuilderRegistry.getContributedStatelessPatternBuilders().put(
//	     KevoreeMatcher.FACTORY.getPatternName(),
//	     new patternbuilders.kevoree.PatternBuilderForkevoree()); 
//	BuilderRegistry.getContributedStatelessPatternBuilders().put(
//	     KevoreeelementMatcher.FACTORY.getPatternName(),
//	     new patternbuilders.kevoree.PatternBuilderForkevoreeelement()); 
//	BuilderRegistry.getContributedStatelessPatternBuilders().put(
//	     ComponentMatcher.FACTORY.getPatternName(),
//	     new patternbuilders.kevoree.PatternBuilderForcomponent()); 
//	BuilderRegistry.getContributedStatelessPatternBuilders().put(
//	     BindingMatcher.FACTORY.getPatternName(),
//	     new patternbuilders.kevoree.PatternBuilderForbinding()); 

  }
  public void initMatchers(){

//	  try {
//         portMatcher = PortMatcher.FACTORY.getMatcher(editor.getKevoree());
//         channelMatcher = ChannelMatcher.FACTORY.getMatcher(editor.getKevoree());
//         nodeMatcher = NodeMatcher.FACTORY.getMatcher(editor.getKevoree());
//         kevoreeMatcher = KevoreeMatcher.FACTORY.getMatcher(editor.getKevoree());
//         kevoreeelementMatcher = KevoreeelementMatcher.FACTORY.getMatcher(editor.getKevoree());
//         componentMatcher = ComponentMatcher.FACTORY.getMatcher(editor.getKevoree());
//         bindingMatcher = BindingMatcher.FACTORY.getMatcher(editor.getKevoree());
//	  } catch (IncQueryRuntimeException e) {
//	  e.printStackTrace();
//      }

  }
  public void listen(){

//      portMatcher.addCallbackAfterUpdates(new Runnable() {
//        @Override
//           public void run() {
//      					for (PortSignature sig : monitorPort.matchFoundEvents) {
//      					}				
//      					for (PortSignature sig : monitorPort.matchLostEvents) {
//      					}				
//      					monitorPort.clear();
//      				}
//      			});
//      channelMatcher.addCallbackAfterUpdates(new Runnable() {
//        @Override
//           public void run() {
//      					for (ChannelSignature sig : monitorChannel.matchFoundEvents) {
//      					}				
//      					for (ChannelSignature sig : monitorChannel.matchLostEvents) {
//      					}				
//      					monitorChannel.clear();
//      				}
//      			});
//      nodeMatcher.addCallbackAfterUpdates(new Runnable() {
//        @Override
//           public void run() {
//      					for (NodeSignature sig : monitorNode.matchFoundEvents) {
//      					}				
//      					for (NodeSignature sig : monitorNode.matchLostEvents) {
//      					}				
//      					monitorNode.clear();
//      				}
//      			});
//      kevoreeMatcher.addCallbackAfterUpdates(new Runnable() {
//        @Override
//           public void run() {
//      					for (KevoreeSignature sig : monitorKevoree.matchFoundEvents) {
//      					}				
//      					for (KevoreeSignature sig : monitorKevoree.matchLostEvents) {
//      					}				
//      					monitorKevoree.clear();
//      				}
//      			});
//      kevoreeelementMatcher.addCallbackAfterUpdates(new Runnable() {
//        @Override
//           public void run() {
//      					for (KevoreeelementSignature sig : monitorKevoreeElement.matchFoundEvents) {
//      					}				
//      					for (KevoreeelementSignature sig : monitorKevoreeElement.matchLostEvents) {
//      					}				
//      					monitorKevoreeElement.clear();
//      				}
//      			});
//      componentMatcher.addCallbackAfterUpdates(new Runnable() {
//        @Override
//           public void run() {
//      					for (ComponentSignature sig : monitorComponent.matchFoundEvents) {
//      					}				
//      					for (ComponentSignature sig : monitorComponent.matchLostEvents) {
//      					}				
//      					monitorComponent.clear();
//      				}
//      			});
//      bindingMatcher.addCallbackAfterUpdates(new Runnable() {
//        @Override
//           public void run() {
//      					for (BindingSignature sig : monitorBinding.matchFoundEvents) {
//      					}				
//      					for (BindingSignature sig : monitorBinding.matchLostEvents) {
//      					}				
//      					monitorBinding.clear();
//      				}
//      			});

  }
}