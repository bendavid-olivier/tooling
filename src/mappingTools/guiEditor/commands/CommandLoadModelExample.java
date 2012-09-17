package mappingTools.guiEditor.commands;
import mappingTools.guiEditor.graphicComponents.MappingTextualEditor;
import mapping.*;
import mappingTools.guiEditor.controllers.MappingListener;
import mappingTools.generator.Generator;
public class CommandLoadModelExample extends Command{
  public CommandLoadModelExample(MappingTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
		Mapping mapping = MappingFactory.eINSTANCE.createMapping();
		editor.setMapping(mapping);
		editor.mappingListener = new MappingListener(editor);
		editor.mappingListener.listen();
		Generator gen = new Generator(mapping);
		gen.generateModelExample();

  }
}