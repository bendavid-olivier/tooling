package kevoreeTools.guiEditor.commands;
import kevoreeTools.guiEditor.graphicComponents.KevoreeTextualEditor;
import kevoreeTools.generator.Generator;
import kevoree.*;
import kevoreeTools.transformations.Kevoree2KevoreeScript;
import kevoreeTools.transformations.KevoreeScript2Kevoree;
import javax.swing.Action;
public class CommandInterpretScript extends Command implements Action{
  public CommandInterpretScript(KevoreeTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
			KevoreeScript2Kevoree transfo = new KevoreeScript2Kevoree(editor.getTextPaneEditor().getText());
			transfo.transformation(editor.getKevoree());
			editor.getTextPaneEditor().setText("KevoreeScript{\n\n}");

  }
}