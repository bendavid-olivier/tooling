package javazTools.guiEditor.graphicComponents;
import javax.swing.JTextPane;
public class TextPaneEditor extends JTextPane{
  public JavazTextualEditor parent;
  public TextPaneEditor(JavazTextualEditor p ){
		parent = p;
		setText("JavazScript{\n\n}");

  }
}