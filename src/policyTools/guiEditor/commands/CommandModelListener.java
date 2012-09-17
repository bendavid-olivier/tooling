package policyTools.guiEditor.commands;
import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;
import policy.*;
import javax.swing.Action;
public class CommandModelListener extends Command implements Action{
  public CommandModelListener(PolicyTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
			editor.getPolicyListener().listen();

  }
}