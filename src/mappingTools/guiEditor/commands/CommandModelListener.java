package mappingTools.guiEditor.commands;
import mappingTools.guiEditor.graphicComponents.MappingTextualEditor;
import mapping.*;
import javax.swing.Action;
public class CommandModelListener extends Command implements Action{
  public CommandModelListener(MappingTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
			editor.getMappingListener().listen();

  }
}