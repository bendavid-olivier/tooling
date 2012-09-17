package kevoreeTools.guiEditor.commands;
import kevoreeTools.guiEditor.graphicComponents.KevoreeTextualEditor;
import kevoreeTools.generator.Generator;
import kevoree.*;
import kevoreeTools.transformations.Kevoree2KevoreeScript;
public class CommandLoadScriptExample extends Command{
  public CommandLoadScriptExample(KevoreeTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
		Kevoree kevoree = KevoreeFactory.eINSTANCE.createKevoree();
		Generator gen = new Generator(kevoree);
		gen.generateModelExample();
		Kevoree2KevoreeScript t=new Kevoree2KevoreeScript(kevoree);
       String script = "KevoreeScript{\n";
       script = script + t.transformation();
       script = script + "}";
		editor.getTextPaneEditor().setText(script);

  }
}