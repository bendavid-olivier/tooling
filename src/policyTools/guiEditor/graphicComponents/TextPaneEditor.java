package policyTools.guiEditor.graphicComponents;
import javax.swing.JTextPane;
public class TextPaneEditor extends JTextPane{
  public PolicyTextualEditor parent;
  public TextPaneEditor(PolicyTextualEditor p ){
		parent = p;
		setText("PolicyScript{\n\n}");

  }
}