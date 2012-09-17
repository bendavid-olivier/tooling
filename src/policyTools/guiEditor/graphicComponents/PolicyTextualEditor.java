package policyTools.guiEditor.graphicComponents;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.util.List;
import java.lang.reflect.*;
import policy.*;
import policyTools.guiEditor.controllers.*;
import policyTools.guiEditor.commands.*;
import policyTools.editor.PolicyEditor;
public class PolicyTextualEditor extends JFrame{
  public TextPaneEditor textPaneEditor;
  public MenuBarEditor menuBar;
  public Policy policy;
  public KeyListenerEditor keyListenerEditor;
  public DocumentListenerEditor documentListenerEditor;
  public PolicyListener policyListener;
  public PopupCompletion popupCompletion;
  public GraphMonitor graphMonitor;
  public List<String> primitives;
  public PolicyTreeMonitor tree;
  public PolicyTextualEditor(){
		policy = PolicyFactory.eINSTANCE.createPolicy();
 		setLayout(new BorderLayout());
		initGraphicalComponents();
		initControllers();
       initPrimitives();

  }
  public PolicyTextualEditor(Policy x ){
		policy = x;
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
		setTitle("POLICY Editor ");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		popupCompletion =new PopupCompletion(this);
		textPaneEditor = new TextPaneEditor(this);
		JScrollPane scroll = new JScrollPane();
		Dimension d =new Dimension(600, 400);
		scroll.setSize(d);
		scroll.setPreferredSize(d);
		scroll.setMinimumSize(d);
		tree = new PolicyTreeMonitor(this);
		add(tree,BorderLayout.LINE_START);
		add(scroll,BorderLayout.CENTER);
		scroll.setViewportView(textPaneEditor);
		menuBar = new MenuBarEditor(this);
		setJMenuBar(menuBar);
		graphMonitor = new GraphMonitor(this);

  }
  public void initControllers(){
		policyListener = new PolicyListener(this);
		keyListenerEditor = new KeyListenerEditor(this);
		documentListenerEditor = new DocumentListenerEditor(this);
		textPaneEditor.addKeyListener(keyListenerEditor);
		textPaneEditor.getDocument().addDocumentListener(documentListenerEditor);

  }
  public void initPrimitives(){
		primitives = new ArrayList<String>();
		for (Method m : PolicyEditor.class.getDeclaredMethods()){
			primitives.add(m.getName());
		}

  }
  public Policy getPolicy(){
		return policy;

  }
  public void setPolicy(Policy x ){
		policy=x;

  }
  public TextPaneEditor getTextPaneEditor(){
		return textPaneEditor;

  }
  public PolicyListener getPolicyListener(){
		return policyListener;

  }
}