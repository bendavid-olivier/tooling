package kevoreeTools.guiEditor.graphicComponents;
import javax.swing.JTextPane;
public class TextPaneEditor extends JTextPane{
  public KevoreeTextualEditor parent;
  public TextPaneEditor(KevoreeTextualEditor p ){
		parent = p;
		setText("KevoreeScript{\n\n}");

  }
}