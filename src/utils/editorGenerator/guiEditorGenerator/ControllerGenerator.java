package utils.editorGenerator.guiEditorGenerator;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javaz.JavaClass;
import javaz.Method;

import utils.editorGenerator.FileGenerator;
import utils.editorGenerator.MetaModelToolsGenerator;
import utils.writer.FileWriterO;

public class ControllerGenerator extends FileGenerator{
	
	private String packName;
	private String containerRoot;
	private MetaModelToolsGenerator mmtg;
	
	public ControllerGenerator( MetaModelToolsGenerator m, String pack) {
		mmtg =m;
		packName = pack;
		containerRoot = mmtg.name;
	}

	public void addKeyListener(){
		JavaClass cls = mmtg.editor.addPublicClass("KeyListenerEditor", packName);
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot
				+ "TextualEditor", containerRoot.toLowerCase()
				+ "Tools.guiEditor.graphicComponents"));		
		cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()+"Tools.guiEditor.commands"));
		cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()+"Tools.guiEditor.graphicComponents"));
		cls.getImports().add(mmtg.editor.getClassByName("*","java.awt"));
		cls.getImports().add(mmtg.editor.getClassByName("*","java.awt.event"));
		cls.getImplements().add(mmtg.editor.getClassByName("KeyListener","java.awt.event"));

		
		mmtg.editor.addClassPublicField(cls, "editor", containerRoot+"TextualEditor");
		
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "e", containerRoot+"TextualEditor");
		String block ="		editor = e;"+"\n";
		mmtg.editor.addMethodBlock(m, block);
		
		Method m1 = mmtg.editor.addClassPublicMethod(cls, "keyPressed");
		mmtg.editor.addMethodParameterIN(m1, "e", "KeyEvent");
		block =	"	int code = e.getKeyCode();"+"\n"+
			"	if (e.isControlDown()) {"+"\n"+
			"		editor.getTextPaneEditor().setBackground(Color.lightGray);"+"\n"+
			"		if (code == KeyEvent.VK_SPACE) {"+"\n"+				
			"			if (!(editor.getTextPaneEditor().getCaret().getMagicCaretPosition() == null)) {"+"\n"+
			"					editor.popupCompletion.completion();"+"\n"+
			"					editor.popupCompletion.show(editor.getTextPaneEditor(),editor.getTextPaneEditor().getCaret().getMagicCaretPosition().x+5,editor.getTextPaneEditor().getCaret().getMagicCaretPosition().y+13);"+"\n"+
			"			}"+"\n"+
			"		}"+"\n"+
			"	}"+"\n"+
			"	if (code == KeyEvent.VK_ESCAPE) {"+"\n"+
			"		//popupCompletion.setVisible(false);"+"\n"+
			"	}"+"\n"+
			"	if (e.isControlDown()) {"+"\n"+
			"		if (code == KeyEvent.VK_K) {"+"\n"+
			"			//popupCompletion = new PopupCompletion(textPaneEditor);"+"\n"+
			"			//if (!(textPaneEditor.getCaret().getMagicCaretPosition() == null)) {"+"\n"+
			"				//CommandColoration coloration = new CommandColoration(textPaneEditor, \"coloration\");"+"\n"+
			"				//coloration.execute();"+"\n"+
			"			//}"+"\n"+
			"		}"+"\n"+
			"	}"+"\n"+
			"	if (e.isControlDown()) {"+"\n"+
			"		if (code == KeyEvent.VK_SHIFT) {"+"\n"+
			"			CommandInterpretScript ci = new CommandInterpretScript(editor, \"interpret\", \"interpret\");"+"\n"+
			"			ci.execute();"+"\n"+
			"			editor.getTextPaneEditor().setBackground(Color.white);"+"\n"+
			"		}"+"\n"+
			"	}"+"\n";
			mmtg.editor.addMethodBlock(m1, block);
			
			Method m2 = mmtg.editor.addClassPublicMethod(cls, "keyReleased");
			mmtg.editor.addMethodParameterIN(m2, "e", "KeyEvent");
			block ="	editor.getTextPaneEditor().setBackground(Color.white);"+"\n";
			mmtg.editor.addMethodBlock(m2, block);
			
			Method m3 = mmtg.editor.addClassPublicMethod(cls, "registerMatchers");
			mmtg.editor.addMethodParameterIN(m3, "e", "KeyEvent");
			block = "	editor.getTextPaneEditor().setBackground(Color.white);"+"\n";
			mmtg.editor.addMethodBlock(m3, block);
			
			Method m4 = mmtg.editor.addClassPublicMethod(cls, "keyTyped");
			mmtg.editor.addMethodParameterIN(m4, "e", "KeyEvent");
			block =" "+"\n";
			mmtg.editor.addMethodBlock(m4, block);
	}
	
	public void addDocumentListener(){
		JavaClass cls = mmtg.editor.addPublicClass("DocumentListenerEditor", packName);
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot
				+ "TextualEditor", containerRoot.toLowerCase()
				+ "Tools.guiEditor.graphicComponents"));		
		cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()+"Tools.guiEditor.commands"));
		cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()+"Tools.guiEditor.graphicComponents"));
		cls.getImports().add(mmtg.editor.getClassByName("*","java.awt"));
		cls.getImports().add(mmtg.editor.getClassByName("*","javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("*","javax.swing.text"));
		cls.getImports().add(mmtg.editor.getClassByName("*","java.awt.event"));
		cls.getImports().add(mmtg.editor.getClassByName("*","java.util.regex"));
		cls.getImports().add(mmtg.editor.getClassByName("*","javax.swing.event"));
		cls.getImplements().add(mmtg.editor.getClassByName("DocumentListener","java.awt.event"));
		
		mmtg.editor.addClassPublicField(cls, "editor", containerRoot+"TextualEditor");
		
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "e", containerRoot+"TextualEditor");
		String block ="		editor = e;"+"\n";
		mmtg.editor.addMethodBlock(m, block);
			
		Method m1 = mmtg.editor.addClassPublicMethod(cls, "changedUpdate");
		mmtg.editor.addMethodParameterIN(m1, "e", "DocumentEvent");
		block = "	"+"\n";
		mmtg.editor.addMethodBlock(m1, block);

		Method m2 = mmtg.editor.addClassPublicMethod(cls, "insertUpdate");
		mmtg.editor.addMethodParameterIN(m2, "e", "DocumentEvent");
		block = "		Runnable r = new Runnable() {"+"\n"+
		"			@Override"+"\n"+
		"			public void run() {"+"\n"+
		"				coloration();"+"\n"+
		"			}"+"\n"+
		"		};"+"\n"+
		"		SwingUtilities.invokeLater(r);"+"\n";
		mmtg.editor.addMethodBlock(m2, block);

		
		Method m3 = mmtg.editor.addClassPublicMethod(cls, "removeUpdate");
		mmtg.editor.addMethodParameterIN(m3, "e", "DocumentEvent");
		block = "	"+"\n";
		mmtg.editor.addMethodBlock(m3, block);
		
		Method m4 = mmtg.editor.addClassPublicMethod(cls, "coloration");
		block = "		String text = editor.getTextPaneEditor().getText().replaceAll(\"\\n\", \" \");"+"\n"+
		"		final StyledDocument doc = editor.getTextPaneEditor().getStyledDocument();"+"\n"+
		"		final MutableAttributeSet normal = new SimpleAttributeSet();"+"\n"+
		"		StyleConstants.setForeground(normal, Color.black);"+"\n"+
		"		StyleConstants.setBold(normal, false);"+"\n"+
		"		SwingUtilities.invokeLater(new Runnable() {"+"\n"+
		"			public void run() {"+"\n"+
		"				doc.setCharacterAttributes(0, doc.getLength(), normal, true);"+"\n"+
		"			}"+"\n"+
		"		});"+"\n"+
		"		colorationPrimitives(text, doc);"+"\n"+
		"		colorationPolicyScript(text, doc);"+"\n";
		mmtg.editor.addMethodBlock(m4, block);
		
		Method m5 = mmtg.editor.addClassPublicMethod(cls, "colorationPrimitives");
		mmtg.editor.addMethodParameterIN(m5, "text", "String");
		mmtg.editor.addMethodParameterIN(m5, "doc", "final StyledDocument");
		block = "		for (String statements : editor.primitives) {"+"\n"+
		"			Pattern p = Pattern.compile(\"(\" + statements + \")\");"+"\n"+
		"			Matcher m = p.matcher(text);"+"\n"+
		"			while (m.find() == true) {"+"\n"+
		"				MutableAttributeSet attri = new SimpleAttributeSet();"+"\n"+
		"				StyleConstants.setForeground(attri, Color.blue);"+"\n"+
		"				StyleConstants.setBold(attri, true);"+"\n"+
		"				final int start = m.start(0);"+"\n"+
		"				final int end = m.end(0);"+"\n"+
		"				final int length = end - start;"+"\n"+
		"				final MutableAttributeSet style = attri;"+"\n"+
		"				SwingUtilities.invokeLater(new Runnable() {"+"\n"+
		"					public void run() {"+"\n"+
		"						doc.setCharacterAttributes(start, length, style, true);"+"\n"+
		"					}"+"\n"+
		"				});"+"\n"+
		"			}"+"\n"+
		"		}"+"\n";
		mmtg.editor.addMethodBlock(m5, block);
			
		Method m6 = mmtg.editor.addClassPublicMethod(cls, "colorationPolicyScript");
		mmtg.editor.addMethodParameterIN(m6, "text", "String");
		mmtg.editor.addMethodParameterIN(m6, "doc", "final StyledDocument");
		block = "		Pattern p = Pattern.compile(\"("+containerRoot+"Script)\");"+"\n"+
		"		Matcher m = p.matcher(text);"+"\n"+
		"		while (m.find() == true) {"+"\n"+
		"			MutableAttributeSet attri = new SimpleAttributeSet();"+"\n"+
		"			StyleConstants.setForeground(attri, Color.orange);"+"\n"+
		"			StyleConstants.setBold(attri, true);"+"\n"+
		"			final int start = m.start(0);"+"\n"+
		"			final int end = m.end(0);"+"\n"+
		"			final int length = end - start;"+"\n"+
		"			final MutableAttributeSet style = attri;"+"\n"+
		"			SwingUtilities.invokeLater(new Runnable() {"+"\n"+
		"				public void run() {"+"\n"+
		"					doc.setCharacterAttributes(start, length, style, true);"+"\n"+
		"				}"+"\n"+
		"			});"+"\n"+
		"		}"+"\n";
		mmtg.editor.addMethodBlock(m6, block);
		

	}
}