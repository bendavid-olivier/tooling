package mappingTools.guiEditor.graphicComponents;
import mappingTools.guiEditor.graphicComponents.MappingTextualEditor;
import mapping.*;
public class Launcher{
  public MappingTextualEditor editor;
  public Launcher(Mapping x ){
		editor = new MappingTextualEditor(x);

  }
  public void start(){
		editor.setVisible(true);

  }
  public static  void main(String[] args ){
		MappingTextualEditor editor = new MappingTextualEditor();
		editor.setVisible(true);
		editor.update();

  }
}