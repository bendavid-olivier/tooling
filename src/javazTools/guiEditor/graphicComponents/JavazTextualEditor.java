package javazTools.guiEditor.graphicComponents;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.util.List;
import java.lang.reflect.*;
import java.lang.reflect.Method;

import javaz.*;
import javazTools.guiEditor.controllers.*;
import javazTools.guiEditor.commands.*;
import javazTools.editor.JavazEditor;
public class JavazTextualEditor extends JFrame{
  public TextPaneEditor textPaneEditor;
  public MenuBarEditor menuBar;
  public Javaz javaz;
  public KeyListenerEditor keyListenerEditor;
  public DocumentListenerEditor documentListenerEditor;
  public JavazListener javazListener;
  public PopupCompletion popupCompletion;
  public GraphMonitor graphMonitor;
  public List<String> primitives;
  public JavazTreeMonitor tree;
  public JavazTextualEditor(){
		javaz = JavazFactory.eINSTANCE.createJavaz();
 		setLayout(new BorderLayout());
		initGraphicalComponents();
		initControllers();
       initPrimitives();

  }
  public JavazTextualEditor(Javaz x ){
		javaz = x;
 		setLayout(new BorderLayout());
		initGraphicalComponents();
		initControllers();
		initPrimitives();

  }
  public void update(){
		graphMonitor.update();
		CommandColoration c= new CommandColoration(this, "coloration", "coloration");
		c.execute();

  }
  public void initGraphicalComponents(){
		setTitle("JAVAZ Editor ");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		popupCompletion =new PopupCompletion(this);
		textPaneEditor = new TextPaneEditor(this);
		JScrollPane scroll = new JScrollPane();
		Dimension d =new Dimension(600, 400);
		scroll.setSize(d);
		scroll.setPreferredSize(d);
		scroll.setMinimumSize(d);
		tree = new JavazTreeMonitor(this);
		add(tree,BorderLayout.LINE_START);
		add(scroll,BorderLayout.CENTER);
		scroll.setViewportView(textPaneEditor);
		menuBar = new MenuBarEditor(this);
		setJMenuBar(menuBar);
		graphMonitor = new GraphMonitor(this);

  }
  public void initControllers(){
		javazListener = new JavazListener(this);
		keyListenerEditor = new KeyListenerEditor(this);
		documentListenerEditor = new DocumentListenerEditor(this);
		textPaneEditor.addKeyListener(keyListenerEditor);
		textPaneEditor.getDocument().addDocumentListener(documentListenerEditor);

  }
  public void initPrimitives(){
		primitives = new ArrayList<String>();
		for (Method m : JavazEditor.class.getDeclaredMethods()){
			primitives.add(m.getName());
		}

  }
  public Javaz getJavaz(){
		return javaz;

  }
  public void setJavaz(Javaz x ){
		javaz=x;

  }
  public TextPaneEditor getTextPaneEditor(){
		return textPaneEditor;

  }
  public JavazListener getJavazListener(){
		return javazListener;

  }
}