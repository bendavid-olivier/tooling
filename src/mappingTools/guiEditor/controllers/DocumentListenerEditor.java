package mappingTools.guiEditor.controllers;
import mappingTools.guiEditor.graphicComponents.MappingTextualEditor;
import mappingTools.guiEditor.commands.*;
import mappingTools.guiEditor.graphicComponents.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.util.regex.*;
import javax.swing.event.*;
public class DocumentListenerEditor implements DocumentListener{
  public MappingTextualEditor editor;
  public DocumentListenerEditor(MappingTextualEditor e ){
		editor = e;

  }
  public void changedUpdate(DocumentEvent e ){
	

  }
  public void insertUpdate(DocumentEvent e ){
		Runnable r = new Runnable() {
			@Override
			public void run() {
				coloration();
			}
		};
		SwingUtilities.invokeLater(r);

  }
  public void removeUpdate(DocumentEvent e ){
	

  }
  public void coloration(){
		String text = editor.getTextPaneEditor().getText().replaceAll("\n", " ");
		final StyledDocument doc = editor.getTextPaneEditor().getStyledDocument();
		final MutableAttributeSet normal = new SimpleAttributeSet();
		StyleConstants.setForeground(normal, Color.black);
		StyleConstants.setBold(normal, false);
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				doc.setCharacterAttributes(0, doc.getLength(), normal, true);
			}
		});
		colorationPrimitives(text, doc);
		colorationPolicyScript(text, doc);

  }
  public void colorationPrimitives(String text ,final StyledDocument doc ){
		for (String statements : editor.primitives) {
			Pattern p = Pattern.compile("(" + statements + ")");
			Matcher m = p.matcher(text);
			while (m.find() == true) {
				MutableAttributeSet attri = new SimpleAttributeSet();
				StyleConstants.setForeground(attri, Color.blue);
				StyleConstants.setBold(attri, true);
				final int start = m.start(0);
				final int end = m.end(0);
				final int length = end - start;
				final MutableAttributeSet style = attri;
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						doc.setCharacterAttributes(start, length, style, true);
					}
				});
			}
		}

  }
  public void colorationPolicyScript(String text ,final StyledDocument doc ){
		Pattern p = Pattern.compile("(MappingScript)");
		Matcher m = p.matcher(text);
		while (m.find() == true) {
			MutableAttributeSet attri = new SimpleAttributeSet();
			StyleConstants.setForeground(attri, Color.orange);
			StyleConstants.setBold(attri, true);
			final int start = m.start(0);
			final int end = m.end(0);
			final int length = end - start;
			final MutableAttributeSet style = attri;
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					doc.setCharacterAttributes(start, length, style, true);
				}
			});
		}

  }
}