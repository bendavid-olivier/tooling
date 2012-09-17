package mappingTools.guiEditor.graphicComponents;
import javax.swing.JTextPane;
public class TextPaneEditor extends JTextPane{
  public MappingTextualEditor parent;
  public TextPaneEditor(MappingTextualEditor p ){
		parent = p;
		setText("MappingScript{\n\n}");

  }
}