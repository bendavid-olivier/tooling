package javazTools.guiEditor.commands;
import javazTools.guiEditor.graphicComponents.JavazTextualEditor;
import javax.swing.Action;
import javaz.*;
public class CommandDisplayGraph extends Command implements Action{
  public CommandDisplayGraph(JavazTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
			editor.graphMonitor.update();
			editor.graphMonitor.setVisible(true);

  }
}