package mappingTools.guiEditor.commands;
import mappingTools.guiEditor.graphicComponents.MappingTextualEditor;
import mappingTools.generator.Generator;
import mapping.*;
import mappingTools.transformations.Mapping2MappingScript;
import mappingTools.transformations.MappingScript2Mapping;
import javax.swing.Action;
public class CommandInterpretScript extends Command implements Action{
  public CommandInterpretScript(MappingTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
			MappingScript2Mapping transfo = new MappingScript2Mapping(editor.getTextPaneEditor().getText());
			transfo.transformation(editor.getMapping());
			editor.getTextPaneEditor().setText("MappingScript{\n\n}");

  }
}