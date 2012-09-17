package javazTools.guiEditor.commands;
import javazTools.guiEditor.graphicComponents.JavazTextualEditor;
import javazTools.generator.Generator;
import javaz.*;
import javazTools.transformations.Javaz2JavazScript;
import javazTools.transformations.JavazScript2Javaz;
import javax.swing.Action;
public class CommandInterpretScript extends Command implements Action{
  public CommandInterpretScript(JavazTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
			JavazScript2Javaz transfo = new JavazScript2Javaz(editor.getTextPaneEditor().getText());
			transfo.transformation(editor.getJavaz());
			editor.getTextPaneEditor().setText("JavazScript{\n\n}");

  }
}