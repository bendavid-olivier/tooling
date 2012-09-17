package javazTools.guiEditor.controllers;
import javazTools.guiEditor.graphicComponents.JavazTextualEditor;
//import patternbuilders.javaz.*;
//import patternmatchers.javaz.*;
//import signatures.javaz.*;
import javazTools.guiEditor.graphicComponents.*;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.BuilderRegistry;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;
public class JavazListener{
//  public JavazTextualEditor editor;
//  private JavaelementMatcher javaelementMatcher;
//  public DeltaMonitor<JavaelementSignature> monitorJavaElement;
//  private FieldMatcher fieldMatcher;
//  public DeltaMonitor<FieldSignature> monitorField;
//  private MethodMatcher methodMatcher;
//  public DeltaMonitor<MethodSignature> monitorMethod;
//  private JavazMatcher javazMatcher;
//  public DeltaMonitor<JavazSignature> monitorJavaz;
//  private JavapackagexMatcher javapackagexMatcher;
//  public DeltaMonitor<JavapackagexSignature> monitorJavaPackageX;
//  private BlockMatcher blockMatcher;
//  public DeltaMonitor<BlockSignature> monitorBlock;
//  private JavaparameterMatcher javaparameterMatcher;
//  public DeltaMonitor<JavaparameterSignature> monitorJavaParameter;
//  private JavaclassMatcher javaclassMatcher;
//  public DeltaMonitor<JavaclassSignature> monitorJavaClass;
  public JavazListener(JavazTextualEditor e ){
//		editor = e;
//		registerMatchers();
//		initMatchers();
//		monitorJavaElement = javaelementMatcher.newDeltaMonitor(false);
//		monitorField = fieldMatcher.newDeltaMonitor(false);
//		monitorMethod = methodMatcher.newDeltaMonitor(false);
//		monitorJavaz = javazMatcher.newDeltaMonitor(false);
//		monitorJavaPackageX = javapackagexMatcher.newDeltaMonitor(false);
//		monitorBlock = blockMatcher.newDeltaMonitor(false);
//		monitorJavaParameter = javaparameterMatcher.newDeltaMonitor(false);
//		monitorJavaClass = javaclassMatcher.newDeltaMonitor(false);
//
  }
//  public void registerMatchers(){
//
//	BuilderRegistry.getContributedStatelessPatternBuilders().put(
//	     JavaelementMatcher.FACTORY.getPatternName(),
//	     new patternbuilders.javaz.PatternBuilderForjavaelement()); 
//	BuilderRegistry.getContributedStatelessPatternBuilders().put(
//	     FieldMatcher.FACTORY.getPatternName(),
//	     new patternbuilders.javaz.PatternBuilderForfield()); 
//	BuilderRegistry.getContributedStatelessPatternBuilders().put(
//	     MethodMatcher.FACTORY.getPatternName(),
//	     new patternbuilders.javaz.PatternBuilderFormethod()); 
//	BuilderRegistry.getContributedStatelessPatternBuilders().put(
//	     JavazMatcher.FACTORY.getPatternName(),
//	     new patternbuilders.javaz.PatternBuilderForjavaz()); 
//	BuilderRegistry.getContributedStatelessPatternBuilders().put(
//	     JavapackagexMatcher.FACTORY.getPatternName(),
//	     new patternbuilders.javaz.PatternBuilderForjavapackagex()); 
//	BuilderRegistry.getContributedStatelessPatternBuilders().put(
//	     BlockMatcher.FACTORY.getPatternName(),
//	     new patternbuilders.javaz.PatternBuilderForblock()); 
//	BuilderRegistry.getContributedStatelessPatternBuilders().put(
//	     JavaparameterMatcher.FACTORY.getPatternName(),
//	     new patternbuilders.javaz.PatternBuilderForjavaparameter()); 
//	BuilderRegistry.getContributedStatelessPatternBuilders().put(
//	     JavaclassMatcher.FACTORY.getPatternName(),
//	     new patternbuilders.javaz.PatternBuilderForjavaclass()); 
//
//  }
//  public void initMatchers(){
//
//	  try {
//         javaelementMatcher = JavaelementMatcher.FACTORY.getMatcher(editor.getJavaz());
//         fieldMatcher = FieldMatcher.FACTORY.getMatcher(editor.getJavaz());
//         methodMatcher = MethodMatcher.FACTORY.getMatcher(editor.getJavaz());
//         javazMatcher = JavazMatcher.FACTORY.getMatcher(editor.getJavaz());
//         javapackagexMatcher = JavapackagexMatcher.FACTORY.getMatcher(editor.getJavaz());
//         blockMatcher = BlockMatcher.FACTORY.getMatcher(editor.getJavaz());
//         javaparameterMatcher = JavaparameterMatcher.FACTORY.getMatcher(editor.getJavaz());
//         javaclassMatcher = JavaclassMatcher.FACTORY.getMatcher(editor.getJavaz());
//	  } catch (IncQueryRuntimeException e) {
//	  e.printStackTrace();
//      }
//
//  }
  public void listen(){
//
//      javaelementMatcher.addCallbackAfterUpdates(new Runnable() {
//        @Override
//           public void run() {
//      					for (JavaelementSignature sig : monitorJavaElement.matchFoundEvents) {
//      					}				
//      					for (JavaelementSignature sig : monitorJavaElement.matchLostEvents) {
//      					}				
//      					monitorJavaElement.clear();
//      				}
//      			});
//      fieldMatcher.addCallbackAfterUpdates(new Runnable() {
//        @Override
//           public void run() {
//      					for (FieldSignature sig : monitorField.matchFoundEvents) {
//      					}				
//      					for (FieldSignature sig : monitorField.matchLostEvents) {
//      					}				
//      					monitorField.clear();
//      				}
//      			});
//      methodMatcher.addCallbackAfterUpdates(new Runnable() {
//        @Override
//           public void run() {
//      					for (MethodSignature sig : monitorMethod.matchFoundEvents) {
//      					}				
//      					for (MethodSignature sig : monitorMethod.matchLostEvents) {
//      					}				
//      					monitorMethod.clear();
//      				}
//      			});
//      javazMatcher.addCallbackAfterUpdates(new Runnable() {
//        @Override
//           public void run() {
//      					for (JavazSignature sig : monitorJavaz.matchFoundEvents) {
//      					}				
//      					for (JavazSignature sig : monitorJavaz.matchLostEvents) {
//      					}				
//      					monitorJavaz.clear();
//      				}
//      			});
//      javapackagexMatcher.addCallbackAfterUpdates(new Runnable() {
//        @Override
//           public void run() {
//      					for (JavapackagexSignature sig : monitorJavaPackageX.matchFoundEvents) {
//      					}				
//      					for (JavapackagexSignature sig : monitorJavaPackageX.matchLostEvents) {
//      					}				
//      					monitorJavaPackageX.clear();
//      				}
//      			});
//      blockMatcher.addCallbackAfterUpdates(new Runnable() {
//        @Override
//           public void run() {
//      					for (BlockSignature sig : monitorBlock.matchFoundEvents) {
//      					}				
//      					for (BlockSignature sig : monitorBlock.matchLostEvents) {
//      					}				
//      					monitorBlock.clear();
//      				}
//      			});
//      javaparameterMatcher.addCallbackAfterUpdates(new Runnable() {
//        @Override
//           public void run() {
//      					for (JavaparameterSignature sig : monitorJavaParameter.matchFoundEvents) {
//      					}				
//      					for (JavaparameterSignature sig : monitorJavaParameter.matchLostEvents) {
//      					}				
//      					monitorJavaParameter.clear();
//      				}
//      			});
//      javaclassMatcher.addCallbackAfterUpdates(new Runnable() {
//        @Override
//           public void run() {
//      					for (JavaclassSignature sig : monitorJavaClass.matchFoundEvents) {
//      					}				
//      					for (JavaclassSignature sig : monitorJavaClass.matchLostEvents) {
//      					}				
//      					monitorJavaClass.clear();
//      				}
//      			});
//
  }
}