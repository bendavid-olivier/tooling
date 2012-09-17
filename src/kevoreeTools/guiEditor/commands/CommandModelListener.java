package kevoreeTools.guiEditor.commands;
import kevoreeTools.guiEditor.graphicComponents.KevoreeTextualEditor;
import kevoree.*;
import javax.swing.Action;
public class CommandModelListener extends Command implements Action{
  public CommandModelListener(KevoreeTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
			editor.getKevoreeListener().listen();

  }
}