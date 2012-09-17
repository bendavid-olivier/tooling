package graphoTools.guiEditor.commands;
import graphoTools.guiEditor.graphicComponents.GraphOTextualEditor;
import javax.swing.Action;
import grapho.*;
public class CommandDisplayGraph extends Command implements Action{
  public CommandDisplayGraph(GraphOTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
			editor.graphMonitor.update();
			editor.graphMonitor.setVisible(true);

  }
}