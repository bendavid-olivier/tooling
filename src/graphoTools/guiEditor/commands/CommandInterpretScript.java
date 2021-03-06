package graphoTools.guiEditor.commands;
import graphoTools.guiEditor.graphicComponents.GraphOTextualEditor;
import graphoTools.generator.Generator;
import grapho.*;
import graphoTools.transformations.GraphO2GraphOScript;
import graphoTools.transformations.GraphOScript2GraphO;
import javax.swing.Action;
public class CommandInterpretScript extends Command implements Action{
  public CommandInterpretScript(GraphOTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
			GraphOScript2GraphO transfo = new GraphOScript2GraphO(editor.getTextPaneEditor().getText());
			transfo.transformation(editor.getGraphO());
			editor.getTextPaneEditor().setText("GraphOScript{\n\n}");

  }
}