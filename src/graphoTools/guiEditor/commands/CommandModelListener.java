package graphoTools.guiEditor.commands;
import graphoTools.guiEditor.graphicComponents.GraphOTextualEditor;
import grapho.*;
import javax.swing.Action;
public class CommandModelListener extends Command implements Action{
  public CommandModelListener(GraphOTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
			editor.getGraphOListener().listen();

  }
}