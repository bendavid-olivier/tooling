package javazTools.guiEditor.commands;
import javazTools.guiEditor.graphicComponents.JavazTextualEditor;
import javazTools.generator.Generator;
import javaz.*;
import javazTools.transformations.Javaz2JavazScript;
public class CommandLoadScriptExample extends Command{
  public CommandLoadScriptExample(JavazTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
		Javaz javaz = JavazFactory.eINSTANCE.createJavaz();
		Generator gen = new Generator(javaz);
		gen.generateModelExample();
		Javaz2JavazScript t=new Javaz2JavazScript(javaz);
       String script = "JavazScript{\n";
       script = script + t.transformation();
       script = script + "}";
		editor.getTextPaneEditor().setText(script);

  }
}