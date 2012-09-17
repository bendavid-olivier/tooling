package javazTools.guiEditor.controllers;
import javazTools.guiEditor.graphicComponents.JavazTextualEditor;
import javazTools.guiEditor.commands.*;
import javazTools.guiEditor.graphicComponents.*;
import java.awt.*;
import java.awt.event.*;
public class KeyListenerEditor implements KeyListener{
  public JavazTextualEditor editor;
  public KeyListenerEditor(JavazTextualEditor e ){
		editor = e;

  }
  public void keyPressed(KeyEvent e ){
	int code = e.getKeyCode();
	if (e.isControlDown()) {
		editor.getTextPaneEditor().setBackground(Color.lightGray);
		if (code == KeyEvent.VK_SPACE) {
			if (!(editor.getTextPaneEditor().getCaret().getMagicCaretPosition() == null)) {
					editor.popupCompletion.completion();
					editor.popupCompletion.show(editor.getTextPaneEditor(),editor.getTextPaneEditor().getCaret().getMagicCaretPosition().x+5,editor.getTextPaneEditor().getCaret().getMagicCaretPosition().y+13);
			}
		}
	}
	if (code == KeyEvent.VK_ESCAPE) {
		//popupCompletion.setVisible(false);
	}
	if (e.isControlDown()) {
		if (code == KeyEvent.VK_K) {
			//popupCompletion = new PopupCompletion(textPaneEditor);
			//if (!(textPaneEditor.getCaret().getMagicCaretPosition() == null)) {
				//CommandColoration coloration = new CommandColoration(textPaneEditor, "coloration");
				//coloration.execute();
			//}
		}
	}
	if (e.isControlDown()) {
		if (code == KeyEvent.VK_SHIFT) {
			CommandInterpretScript ci = new CommandInterpretScript(editor, "interpret", "interpret");
			ci.execute();
			editor.getTextPaneEditor().setBackground(Color.white);
		}
	}

  }
  public void keyReleased(KeyEvent e ){
	editor.getTextPaneEditor().setBackground(Color.white);

  }
  public void registerMatchers(KeyEvent e ){
	editor.getTextPaneEditor().setBackground(Color.white);

  }
  public void keyTyped(KeyEvent e ){
 

  }
}