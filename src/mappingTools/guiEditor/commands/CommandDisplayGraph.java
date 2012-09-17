package mappingTools.guiEditor.commands;
import mappingTools.guiEditor.graphicComponents.MappingTextualEditor;
import javax.swing.Action;
import mapping.*;
public class CommandDisplayGraph extends Command implements Action{
  public CommandDisplayGraph(MappingTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
			editor.graphMonitor.update();
			editor.graphMonitor.setVisible(true);

  }
}