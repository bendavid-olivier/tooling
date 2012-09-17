package graphoTools.guiEditor.graphicComponents;
import javax.swing.JTextPane;
public class TextPaneEditor extends JTextPane{
  public GraphOTextualEditor parent;
  public TextPaneEditor(GraphOTextualEditor p ){
		parent = p;
		setText("GraphOScript{\n\n}");

  }
}