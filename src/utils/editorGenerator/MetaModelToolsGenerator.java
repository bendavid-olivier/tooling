package utils.editorGenerator;

import javaz.*;

import utils.editorGenerator.editorGenerator.EditorGenerator;
import utils.editorGenerator.generatorGenerator.GeneratorGenerator;
import utils.editorGenerator.guiEditorGenerator.CommandGenerator;
import utils.editorGenerator.guiEditorGenerator.GraphicComponentsGenerator;
import utils.editorGenerator.guiEditorGenerator.ControllerGenerator;
import utils.editorGenerator.monitorGenerator.MonitorGenerator;
import utils.editorGenerator.transformationGenerator.TransfoEditorGenerator;
import utils.emfHelpers.GenEcore;

public class MetaModelToolsGenerator {

	public String name;
	public MetaModelToolsGeneratorGUI gui;
	public Javaz java;
	public JavazEditor editor;
	
	public MetaModelToolsGenerator(String s){
		name = s;
//		gui = new MetaModelToolsGeneratorGUI();
		java = JavazFactory.eINSTANCE.createJavaz();
		editor = new JavazEditor(java);
	}
	
	public MetaModelToolsGenerator(String s,Javaz j){
		name = s;
//		gui = new MetaModelToolsGeneratorGUI();
		java = j;
		editor = new JavazEditor(java);
	}
	
	public void generateModel(){
		//
		
		
		addPackages();
		addGenerator();
		addEditor();
		addTransfoEditor();	

		//gui Editor doit etre en premier parce que les autres dependent de name+TextualEditor
		addGuiEditor();
		addMonitorIncQuery();
		addCommands();
		addListeners();

	}
	
	public void generate(){
		//1 generate model code
		GenEcore genEcore = new GenEcore("/home/obendavi/Bureau/coding/workspaceSPECIAL/tooling/metamodels/"+name.toLowerCase()+"/"+name.toLowerCase()+".ecore","/home/obendavi/Bureau/coding/workspaceSPECIAL/tooling/",name);		
		
		//2 generate java code		
		addPackages();
		addGenerator();
		addEditor();
		addTransfoEditor();	
		//gui Editor doit etre en premier parce que les autres dependent de name+TextualEditor
		addGuiEditor();
		addMonitorIncQuery();
		addCommands();
		addListeners();
		Javaz2Files j2f = new Javaz2Files(java);
		j2f.transformation();
		
		
		//3 generate incQuery code
		//there we'll see if it is necessary !
		//go along the model comparison strategy !!!
		//thus no need to use incQuery
		//how to perform it ?
		
		//3 alternative
		//need to generate two editors !
		//need to define the mapping !
		//need to define a special listener ?
		//  each time I change the model I generate a new target one !
		//  I store the primitives applied on the target !
		//  when I generate a new model I notify the listener to apply the comparison
		//  using the comparison results 
		//  I apply the transformation defined in the mapping based on the newly added or removed element !
		//  Normally I can have more or less the same result than I defined in mdsec
		
	}
	
	public void addPackages(){
		JavazFactory factory = JavazFactory.eINSTANCE;
		String pck = name.toLowerCase();
		
		//ajout des packages editors ! 
		editor.addPackageX(pck+"Tools");		
		editor.addPackageX(pck+"Tools.editor");				
		editor.addPackageX(pck+"Tools.generator");		
		editor.addPackageX(pck+"Tools.transformations");				
		editor.addPackageX(pck+"Tools.guiEditor");				
		editor.addPackageX(pck+"Tools.guiEditor.commands");		
		editor.addPackageX(pck+"Tools.guiEditor.controllers");				
		editor.addPackageX(pck+"Tools.guiEditor.graphicComponents");
		
		//ajout des packages à imports !
		editor.addClassForImport(name, name.toLowerCase());
		editor.addClassForImport(name+"Factory", name.toLowerCase());
		editor.addClassForImport(name+"Editor", name.toLowerCase()+"Tools.editor");
		editor.addClassForImport("*", name.toLowerCase()+"Tools.guiEditor.controllers");
		editor.addClassForImport("*", name.toLowerCase()+"Tools.guiEditor.commands");
		editor.addClassForImport("*", name.toLowerCase());
		editor.addClassForImport("*", name.toLowerCase()+"Tools.guiEditor.commands");
		editor.addClassForImport("*", name.toLowerCase()+"Tools.transformations");
		editor.addClassForImport("*", name.toLowerCase()+"Tools.guiEditor.graphicComponents");		
		editor.addClassForImport("*", "patternbuilders."+name.toLowerCase());
		editor.addClassForImport("*", "patternmatchers."+name.toLowerCase());
		editor.addClassForImport("*", "signatures."+name.toLowerCase());
		editor.addClassForImport("*", "grapho");
		editor.addClassForImport("*", "grapho.impl");
		
		editor.addClassForImport("GraphO","grapho");
		editor.addClassForImport("Node","grapho");
		editor.addClassForImport("Edge","grapho");
		editor.addClassForImport("GraphO2DotFile","graphoTools.transformations");
		editor.addClassForImport("DotDisplayer", "utils.graphStructure.dotThings");
		editor.addClassForImport("FileWriterO","utils.writer");
		
		editor.addClassForImport("EList", "org.eclipse.emf.common.util");
		
		editor.addClassForImport("PropertyChangeListener", "java.beans");
		
		editor.addClassForImport("String", "java.lang");
		
		editor.addClassForImport("List", "java.util");
		editor.addClassForImport("ArrayList", "java.util");
		editor.addClassForImport("Collections", "java.util");
		
		editor.addClassForImport("Action", "javax.swing");
		editor.addClassForImport("JFrame", "javax.swing");
		editor.addClassForImport("JMenuBar", "javax.swing");
		editor.addClassForImport("JPopupMenu", "javax.swing");		
		editor.addClassForImport("JMenuItem", "javax.swing");
		editor.addClassForImport("SwingUtilities", "javax.swing");
		editor.addClassForImport("JComponent", "javax.swing");
		editor.addClassForImport("JTextPane", "javax.swing");
		editor.addClassForImport("JScrollPane", "javax.swing");
		editor.addClassForImport("JFileChooser", "javax.swing");
		editor.addClassForImport("JPanel", "javax.swing");
		
		editor.addClassForImport("FileFilter", "javax.swing.filechooser");
		
		editor.addClassForImport("ImageIO", "javax.imageio");
		
		editor.addClassForImport("BadLocationException", "javax.swing.text");
		editor.addClassForImport("BadLocationException", "javax.swing.text");
		editor.addClassForImport("MutableAttributeSet", "javax.swing.text");
		editor.addClassForImport("SimpleAttributeSet", "javax.swing.text");
		editor.addClassForImport("StyleConstants", "javax.swing.text");
		editor.addClassForImport("StyledDocument", "javax.swing.text");
		
		editor.addClassForImport("IOException", "java.io");
		editor.addClassForImport("File", "java.io");
		
		editor.addClassForImport("Color", "java.awt");
		editor.addClassForImport("ActionEvent", "java.awt.event");
		editor.addClassForImport("KeyListener", "java.awt.event");
		editor.addClassForImport("DocumentListener", "java.awt.event");
		
		editor.addClassForImport("BufferedImage", "java.awt.image");
		
		editor.addClassForImport("Method", "java.lang.reflect");
		editor.addClassForImport("InvocationTargetException", "java.lang.reflect");
		
		editor.addClassForImport("URI", "org.eclipse.emf.common.util");
		editor.addClassForImport("Resource", "org.eclipse.emf.ecore.resource");
		editor.addClassForImport("ResourceSet", "org.eclipse.emf.ecore.resource");
		editor.addClassForImport("ResourceSetImpl", "org.eclipse.emf.ecore.resource.impl");
		editor.addClassForImport("XMIResourceFactoryImpl", "org.eclipse.emf.ecore.xmi.impl");
		editor.addClassForImport("IncQueryRuntimeException", "org.eclipse.viatra2.emf.incquery.runtime.exception");
		editor.addClassForImport("BuilderRegistry", "org.eclipse.viatra2.emf.incquery.runtime.extensibility");
		editor.addClassForImport("DeltaMonitor", "org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc");

		editor.addClassForImport("Matcher", "java.util.regex");
		editor.addClassForImport("Pattern", "java.util.regex");
		
		editor.addClassForImport("*", "java.awt");
		editor.addClassForImport("*", "java.awt.event");
		editor.addClassForImport("*", "javax.swing");
		editor.addClassForImport("*", "javax.swing.tree");
		editor.addClassForImport("*", "javax.swing.event");
		editor.addClassForImport("*", "javax.swing.text");
		editor.addClassForImport("*", "java.util");;
		editor.addClassForImport("*", "java.util.regex");
		editor.addClassForImport("*", "java.lang.reflect");
		
	}
	
	public void addGuiEditor(){
		GraphicComponentsGenerator gen = new GraphicComponentsGenerator(this,name.toLowerCase()+"Tools.guiEditor.graphicComponents");
		gen.addTextualEditor();
		gen.addLauncher();		
		gen.addTextPaneEditor();		
		gen.addMenuBarEditor();
		gen.addPopupCompletion();		
		gen.addImageComponent();		
		gen.addGraphMonitor();
		gen.addFileChoser();
		gen.addTreeMonitor();
	}
	
	public void addListeners(){
		ControllerGenerator gen = new ControllerGenerator(this,name.toLowerCase()+"Tools.guiEditor.controllers");
		gen.addKeyListener();
		gen.addDocumentListener();
	}
	
	public void addCommands(){
		CommandGenerator gen = new CommandGenerator(this,name.toLowerCase()+"Tools.guiEditor.commands");
		gen.addICommand();
		gen.addCommand();
		gen.addCommandCompletion();
		gen.addCommandLoadModelExample();
		gen.addCommandLoadScriptExample();
		gen.addCommandInterpretScript();
		gen.addCommandDisplayGraph();
		gen.addCommandModelListener();
		gen.addCommandSave();
		gen.addCommandLoad();
		gen.addCommandColoration();
	}
	
	
	public void addTransfoEditor(){
		TransfoEditorGenerator gen = new TransfoEditorGenerator(this,name.toLowerCase()+"Tools.transformations");
		gen.addModelScript2Model();
		gen.addModel2ModelScript();
		gen.addModel2GraphO();
		gen.addGraphOModel2Dot();
	}
	
	public void addGenerator(){
		GeneratorGenerator gen = new GeneratorGenerator(this,name.toLowerCase()+"Tools.generator");
		gen.addGenerator();
	}
	
	public void addEditor(){
		EditorGenerator gen = new EditorGenerator(this,name.toLowerCase()+"Tools.editor");
		gen.addEditor();
	}
	
	public void addMonitorIncQuery(){
		MonitorGenerator gen = new MonitorGenerator(this,name.toLowerCase()+"Tools.guiEditor.controllers");
		gen.addMachineVTCL();
		gen.addListenerIncQuery();
	}
	
	public void addMonitor(){
		MonitorGenerator gen = new MonitorGenerator(this,name.toLowerCase()+"Tools.guiEditor.controllers");
		gen.addMachineVTCL();
		gen.addListenerIncQuery();
	}
	
	public static void main(String[] args){
//		MetaModelToolsGenerator g = new MetaModelToolsGenerator("GraphO");
//		g.generate();
		MetaModelToolsGenerator g = new MetaModelToolsGenerator("Policy");
		g.generate();
	}
	
}
