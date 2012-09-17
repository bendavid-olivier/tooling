package mappingTools.guiEditor.graphicComponents;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.util.List;
import java.lang.reflect.*;
import mapping.*;
import mappingTools.guiEditor.controllers.*;
import mappingTools.guiEditor.commands.*;
import mappingTools.editor.MappingEditor;
public class MappingTextualEditor extends JFrame{
  public TextPaneEditor textPaneEditor;
  public MenuBarEditor menuBar;
  public Mapping mapping;
  public KeyListenerEditor keyListenerEditor;
  public DocumentListenerEditor documentListenerEditor;
  public MappingListener mappingListener;
  public PopupCompletion popupCompletion;
  public GraphMonitor graphMonitor;
  public List<String> primitives;
  public MappingTreeMonitor tree;
  public MappingTextualEditor(){
		mapping = MappingFactory.eINSTANCE.createMapping();
 		setLayout(new BorderLayout());
		initGraphicalComponents();
		initControllers();
       initPrimitives();

  }
  public MappingTextualEditor(Mapping x ){
		mapping = x;
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
		setTitle("MAPPING Editor ");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		popupCompletion =new PopupCompletion(this);
		textPaneEditor = new TextPaneEditor(this);
		JScrollPane scroll = new JScrollPane();
		Dimension d =new Dimension(600, 400);
		scroll.setSize(d);
		scroll.setPreferredSize(d);
		scroll.setMinimumSize(d);
		tree = new MappingTreeMonitor(this);
		add(tree,BorderLayout.LINE_START);
		add(scroll,BorderLayout.CENTER);
		scroll.setViewportView(textPaneEditor);
		menuBar = new MenuBarEditor(this);
		setJMenuBar(menuBar);
		graphMonitor = new GraphMonitor(this);

  }
  public void initControllers(){
		mappingListener = new MappingListener(this);
		keyListenerEditor = new KeyListenerEditor(this);
		documentListenerEditor = new DocumentListenerEditor(this);
		textPaneEditor.addKeyListener(keyListenerEditor);
		textPaneEditor.getDocument().addDocumentListener(documentListenerEditor);

  }
  public void initPrimitives(){
		primitives = new ArrayList<String>();
		for (Method m : MappingEditor.class.getDeclaredMethods()){
			primitives.add(m.getName());
		}

  }
  public Mapping getMapping(){
		return mapping;

  }
  public void setMapping(Mapping x ){
		mapping=x;

  }
  public TextPaneEditor getTextPaneEditor(){
		return textPaneEditor;

  }
  public MappingListener getMappingListener(){
		return mappingListener;

  }
}