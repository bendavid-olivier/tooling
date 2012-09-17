package policyTools.guiEditor.commands;
import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;
import javax.swing.Action;
import policy.*;
public class CommandDisplayGraph extends Command implements Action{
  public CommandDisplayGraph(PolicyTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
			editor.graphMonitor.update();
			editor.graphMonitor.setVisible(true);

  }
}