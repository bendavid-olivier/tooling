package kevoreeTools.guiEditor.commands;
import kevoreeTools.guiEditor.graphicComponents.KevoreeTextualEditor;
import javax.swing.Action;
import kevoree.*;
public class CommandDisplayGraph extends Command implements Action{
  public CommandDisplayGraph(KevoreeTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
			editor.graphMonitor.update();
			editor.graphMonitor.setVisible(true);

  }
}