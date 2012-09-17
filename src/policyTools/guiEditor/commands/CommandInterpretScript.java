package policyTools.guiEditor.commands;
import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;
import policyTools.generator.Generator;
import policy.*;
import policyTools.transformations.Policy2PolicyScript;
import policyTools.transformations.PolicyScript2Policy;
import javax.swing.Action;
public class CommandInterpretScript extends Command implements Action{
  public CommandInterpretScript(PolicyTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
			PolicyScript2Policy transfo = new PolicyScript2Policy(editor.getTextPaneEditor().getText());
			transfo.transformation(editor.getPolicy());
			editor.getTextPaneEditor().setText("PolicyScript{\n\n}");

  }
}