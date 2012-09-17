package mappingTools.guiEditor.commands;
import mappingTools.guiEditor.graphicComponents.MappingTextualEditor;
import mappingTools.generator.Generator;
import mapping.*;
import mappingTools.transformations.Mapping2MappingScript;
public class CommandLoadScriptExample extends Command{
  public CommandLoadScriptExample(MappingTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
		Mapping mapping = MappingFactory.eINSTANCE.createMapping();
		Generator gen = new Generator(mapping);
		gen.generateModelExample();
		Mapping2MappingScript t=new Mapping2MappingScript(mapping);
       String script = "MappingScript{\n";
       script = script + t.transformation();
       script = script + "}";
		editor.getTextPaneEditor().setText(script);

  }
}