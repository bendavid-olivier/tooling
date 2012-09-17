package graphoTools.guiEditor.graphicComponents;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.util.List;
import java.lang.reflect.*;
import grapho.*;
import graphoTools.guiEditor.controllers.*;
import graphoTools.guiEditor.commands.*;
import graphoTools.editor.GraphOEditor;
public class GraphOTextualEditor extends JFrame{
  public TextPaneEditor textPaneEditor;
  public MenuBarEditor menuBar;
  public GraphO grapho;
  public KeyListenerEditor keyListenerEditor;
  public DocumentListenerEditor documentListenerEditor;
  public GraphOListener graphoListener;
  public PopupCompletion popupCompletion;
  public GraphMonitor graphMonitor;
  public List<String> primitives;
  public GraphOTreeMonitor tree;
  public GraphOTextualEditor(){
		grapho = GraphoFactory.eINSTANCE.createGraphO();
 		setLayout(new BorderLayout());
		initGraphicalComponents();
		initControllers();
       initPrimitives();

  }
  public GraphOTextualEditor(GraphO x ){
		grapho = x;
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
		setTitle("GRAPHO Editor ");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		popupCompletion =new PopupCompletion(this);
		textPaneEditor = new TextPaneEditor(this);
		JScrollPane scroll = new JScrollPane();
		Dimension d =new Dimension(600, 400);
		scroll.setSize(d);
		scroll.setPreferredSize(d);
		scroll.setMinimumSize(d);
		tree = new GraphOTreeMonitor(this);
		add(tree,BorderLayout.LINE_START);
		add(scroll,BorderLayout.CENTER);
		scroll.setViewportView(textPaneEditor);
		menuBar = new MenuBarEditor(this);
		setJMenuBar(menuBar);
		graphMonitor = new GraphMonitor(this);

  }
  public void initControllers(){
		graphoListener = new GraphOListener(this);
		keyListenerEditor = new KeyListenerEditor(this);
		documentListenerEditor = new DocumentListenerEditor(this);
		textPaneEditor.addKeyListener(keyListenerEditor);
		textPaneEditor.getDocument().addDocumentListener(documentListenerEditor);

  }
  public void initPrimitives(){
		primitives = new ArrayList<String>();
		for (Method m : GraphOEditor.class.getDeclaredMethods()){
			primitives.add(m.getName());
		}

  }
  public GraphO getGraphO(){
		return grapho;

  }
  public void setGraphO(GraphO x ){
		grapho=x;

  }
  public TextPaneEditor getTextPaneEditor(){
		return textPaneEditor;

  }
  public GraphOListener getGraphOListener(){
		return graphoListener;

  }
}