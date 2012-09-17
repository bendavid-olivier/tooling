package javazTools.guiEditor.commands;
import javazTools.guiEditor.graphicComponents.JavazTextualEditor;
import javaz.*;
import javax.swing.Action;
public class CommandModelListener extends Command implements Action{
  public CommandModelListener(JavazTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
			editor.getJavazListener().listen();

  }
}