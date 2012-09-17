package utils.editorGenerator.guiEditorGenerator;

import javaz.JavaClass;
import javaz.Method;
import utils.editorGenerator.FileGenerator;
import utils.editorGenerator.MetaModelToolsGenerator;

public class CommandGenerator extends FileGenerator{

	private String packName;
	private String containerRoot;
	private MetaModelToolsGenerator mmtg;

	public CommandGenerator(MetaModelToolsGenerator m, String pack) {
		mmtg =m;
		packName = pack;
		containerRoot = mmtg.name;
	}
	
	public void addICommand(){
		JavaClass cls = mmtg.editor.addPublicInterface("ICommand", packName);		
		mmtg.editor.addClassPublicMethod(cls, "execute");				
	}

	public void addCommand() {
		JavaClass cls = mmtg.editor.addPublicClass("Command", packName);		
		cls.getImports().add(mmtg.editor.getClassByName("Action", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("ActionEvent", "java.awt.event"));
		cls.getImports().add(mmtg.editor.getClassByName("PropertyChangeListener", "java.beans"));
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot
				+ "TextualEditor", containerRoot.toLowerCase()
				+ "Tools.guiEditor.graphicComponents"));		
		cls.getImplements().add(mmtg.editor.getClassByName("ICommand",packName));
		cls.getImplements().add(mmtg.editor.getClassByName("Action","javax.swing"));
		mmtg.editor.addClassPrivateField(cls, "name", "String");
		mmtg.editor.addClassPrivateField(cls, "description", "String");
		mmtg.editor.addClassPublicField(cls, "editor", containerRoot
				+ "TextualEditor");
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "e", containerRoot	+ "TextualEditor");
		mmtg.editor.addMethodParameterIN(m, "nme", "String");
		mmtg.editor.addMethodParameterIN(m, "desc", "String");
		
	
		String block ="		editor = e;"+ "\n"
					+ "		name = nme;"+ "\n"
					+ "		description= desc;	"+ "\n";
		mmtg.editor.addMethodBlock(m, block);
				
		Method m2 = mmtg.editor.addClassPublicMethod(cls, "getDescription");
		mmtg.editor.addMethodParameterOUT(m2, "String");
		block = "	return description;";
		mmtg.editor.addMethodBlock(m2, block);
				
		Method m3 = mmtg.editor.addClassPublicMethod(cls, "setDescription");
		mmtg.editor.addMethodParameterIN(m3, "description","String");
		block = "	this.description = description;";
		mmtg.editor.addMethodBlock(m3, block);

		Method m4 = mmtg.editor.addClassPublicMethod(cls, "getName");
		mmtg.editor.addMethodParameterOUT(m4, "String");
		block = "	return name;";
		mmtg.editor.addMethodBlock(m4, block);

		Method m5 = mmtg.editor.addClassPublicMethod(cls, "setName");
		mmtg.editor.addMethodParameterIN(m5, "name","String");
		block = "	this.name = name;";
		mmtg.editor.addMethodBlock(m5, block);

		//"@Override"
		Method m6 = mmtg.editor.addClassPublicMethod(cls, "addPropertyChangeListener");
		mmtg.editor.addMethodParameterIN(m6, "arg0","PropertyChangeListener");
		block = "	";
		mmtg.editor.addMethodBlock(m6, block);

		Method m7 = mmtg.editor.addClassPublicMethod(cls, "getValue");
		mmtg.editor.addMethodParameterOUT(m7, "Object");
		block = "	return null;";
		mmtg.editor.addMethodBlock(m7, block);

		Method m8 = mmtg.editor.addClassPublicMethod(cls, "isEnabled");
		mmtg.editor.addMethodParameterOUT(m8, "boolean");
		block = "	return true;";
		mmtg.editor.addMethodBlock(m8, block);

		Method m9 = mmtg.editor.addClassPublicMethod(cls, "putValue");
		mmtg.editor.addMethodParameterIN(m9,"arg0" ,"String");
		mmtg.editor.addMethodParameterIN(m9,"arg1" ,"Object");
		block = "	";
		mmtg.editor.addMethodBlock(m9, block);
				
		Method m10 = mmtg.editor.addClassPublicMethod(cls, "removePropertyChangeListener");
		mmtg.editor.addMethodParameterIN(m10,"arg0" ,"PropertyChangeListener");
		block = "	";
		mmtg.editor.addMethodBlock(m10, block);
		
		Method m11 = mmtg.editor.addClassPublicMethod(cls, "setEnabled");
		mmtg.editor.addMethodParameterIN(m11,"arg0" ,"boolean");
		block = "	";
		mmtg.editor.addMethodBlock(m11, block);

		Method m12 = mmtg.editor.addClassPublicMethod(cls, "actionPerformed");
		mmtg.editor.addMethodParameterIN(m12,"arg0" ,"ActionEvent");
		block = "	execute();";
		mmtg.editor.addMethodBlock(m12, block);

		Method m13 = mmtg.editor.addClassPublicMethod(cls, "execute");
		block = "	";
		mmtg.editor.addMethodBlock(m13, block);
		
		Method m14 = mmtg.editor.addClassPublicMethod(cls, "getValue");
		mmtg.editor.addMethodParameterOUT(m14, "Object");
		mmtg.editor.addMethodParameterIN(m14, "key", "String");
		
		block = "	return null;";
		mmtg.editor.addMethodBlock(m14, block);
		

	}

	public void addCommandCompletion() {
		JavaClass cls = mmtg.editor.addPublicClass("CommandCompletion", packName);	
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot
				+ "TextualEditor", containerRoot.toLowerCase()
				+ "Tools.guiEditor.graphicComponents"));	
		cls.getImports().add(mmtg.editor.getClassByName("BadLocationException","javax.swing.text"));
		cls.getImports().add(mmtg.editor.getClassByName("*","java.lang.reflect"));
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot+"Editor",containerRoot.toLowerCase()+"Tools.editor"));
		
		cls.setExtends(mmtg.editor.getClassByName("Command", packName));
				
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "e", containerRoot	+ "TextualEditor");
		mmtg.editor.addMethodParameterIN(m, "nme", "String");
		mmtg.editor.addMethodParameterIN(m, "desc", "String");
		String block ="		super(e, nme, desc);"+ "\n";
		mmtg.editor.addMethodBlock(m, block);				
		
		Method m2 = mmtg.editor.addClassPublicMethod(cls, "execute");
				block = "		//to insert the selected string into the document"+ "\n"
				+ "		int pos =editor.getTextPaneEditor().getCaretPosition() -1;"+ "\n"
				+ "		String content = null;"	+ "\n"
				+ "		try {"+ "\n"
				+ "			content = editor.getTextPaneEditor().getText(0, pos + 1);"+ "\n"
				+ "		} catch (BadLocationException e) {"	+ "\n"
				+ "			e.printStackTrace();"+ "\n"
				+ "		}"+ "\n"
				+ "		int w;"+ "\n"
				+ "		for (w = pos; w >= 0; w--) {"+ "\n"
				+ "			if (!Character.isLetter(content.charAt(w))) {"+ "\n"
				+ "				break;"	+ "\n"
				+ "			}"	+ "\n"
				+ "		}"+ "\n"
				+ "		String prefix = content.substring(w + 1).toLowerCase();"+ "\n"
				+ "		try {	"+ "\n"
				+ "			String toInsert = getName().substring(prefix.length(),getName().length());"	+ "\n"
				+"			String[] args = null;"	+ "\n"
				+ "			for(Method m : "+ containerRoot	+ "Editor.class.getMethods()){"	+ "\n"
				+ "				if (m.getName().equals(getName())){"+ "\n"
				+ "					if(!(m.getParameterTypes().length == 0)){"+ "\n"
				+ "						args = new String[m.getParameterTypes().length];"+ "\n"
				+ "					}"+ "\n"
				+ "					int cpt = 0;"+ "\n"
				+ "					for(Class c : m.getParameterTypes()){"+ "\n"
				+ "						args[cpt]= c.getSimpleName();"+ "\n"
				+ "						cpt = cpt+1;"+ "\n"
				+ "					}"+ "\n"
				+ "				}"+ "\n"
				+ "			}"+ "\n"
				+ "			toInsert = toInsert + \"(\";"+ "\n"
				+ "			if(! (args == null)){"+ "\n"
				+ "				for(int i = 0;i<args.length;i++){"+ "\n"
				+ "					if(i == (args.length - 1)){"+ "\n"
				+ "						toInsert = toInsert + args[i];"	+ "\n"
				+ "					}"+ "\n"
				+ "					else"+ "\n"
				+ "					{"+ "\n"
				+ "						toInsert = toInsert + args[i]+\",\";"+ "\n"
				+ "					}"+ "\n"
				+ "				}"+ "\n"
				+ "			}"+ "\n"
				+ "			toInsert = toInsert + \");\";"+ "\n"
				+"			editor.getTextPaneEditor().getDocument().insertString(pos + 1, toInsert, null);"+ "\n" 
				+ "		} catch (BadLocationException e) {" + "\n"
				+ "			e.printStackTrace();" + "\n" 
				+ "		}";
				mmtg.editor.addMethodBlock(m2, block);
	}

	public void addCommandLoadModelExample() {
		JavaClass cls = mmtg.editor.addPublicClass("CommandLoadModelExample", packName);	
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot
				+ "TextualEditor", containerRoot.toLowerCase()
				+ "Tools.guiEditor.graphicComponents"));	
		cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()));
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot+"Listener",containerRoot.toLowerCase()+"Tools.guiEditor.controllers"));
		cls.getImports().add(mmtg.editor.getClassByName("Generator",containerRoot.toLowerCase()+"Tools.generator"));
		cls.setExtends(mmtg.editor.getClassByName("Command", packName));
				
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "e", containerRoot	+ "TextualEditor");
		mmtg.editor.addMethodParameterIN(m, "nme", "String");
		mmtg.editor.addMethodParameterIN(m, "desc", "String");
		String block ="		super(e, nme, desc);"+ "\n";
		mmtg.editor.addMethodBlock(m, block);				
		
		Method m2 = mmtg.editor.addClassPublicMethod(cls, "execute");
		block = "		" + containerRoot + " "	+ containerRoot.toLowerCase() + " = "+ containerRoot.substring(0, 1).toUpperCase()+ containerRoot.substring(1, containerRoot.length()).toLowerCase()+ "Factory.eINSTANCE.create" + containerRoot + "();" + "\n"
				+ "		editor.set" + containerRoot + "(" + containerRoot.toLowerCase() + ");"+ "\n" 
				+ "		editor."+containerRoot.toLowerCase()+"Listener = new " + containerRoot+"Listener(editor);" + "\n" 
				+ "		editor."+containerRoot.toLowerCase()+"Listener.listen();" + "\n"

				
				+ "		Generator gen = new Generator(" + containerRoot.toLowerCase() + ");"+ "\n" 
				+ "		gen.generateModelExample();" + "\n";
		mmtg.editor.addMethodBlock(m2, block);
	}

	public void addCommandLoadScriptExample() {
		JavaClass cls = mmtg.editor.addPublicClass("CommandLoadScriptExample", packName);	
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot
				+ "TextualEditor", containerRoot.toLowerCase()
				+ "Tools.guiEditor.graphicComponents"));	
		cls.getImports().add(mmtg.editor.getClassByName("Generator",containerRoot.toLowerCase()+"Tools.generator"));
		cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()));
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot + "2" + containerRoot + "Script",containerRoot.toLowerCase()+"Tools.transformations"));
		cls.setExtends(mmtg.editor.getClassByName("Command", packName));
				
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "e", containerRoot	+ "TextualEditor");
		mmtg.editor.addMethodParameterIN(m, "nme", "String");
		mmtg.editor.addMethodParameterIN(m, "desc", "String");
		String block ="		super(e, nme, desc);"+ "\n";
		mmtg.editor.addMethodBlock(m, block);			
		
		Method m2 = mmtg.editor.addClassPublicMethod(cls, "execute");
		block = "		" + containerRoot + " "	+ containerRoot.toLowerCase() + " = "+ containerRoot.substring(0, 1).toUpperCase()+ containerRoot.substring(1, containerRoot.length()).toLowerCase()+ "Factory.eINSTANCE.create" + containerRoot + "();" + "\n" +
				"		Generator gen = new Generator(" + containerRoot.toLowerCase()+ ");" + "\n" + 
				"		gen.generateModelExample();" + "\n"+ 
				"		"+ containerRoot + "2" + containerRoot + "Script t=new " + containerRoot + "2" + containerRoot+ "Script(" + containerRoot.toLowerCase() + ");" + "\n"+
				"       String script = \"" + containerRoot + "Script{\\n\";" + "\n"+
				"       script = script + t.transformation();" + "\n"+
				"       script = script + \"}\";" + "\n"+
				"		editor.getTextPaneEditor().setText(script);" + "\n";
		mmtg.editor.addMethodBlock(m2, block);
	}

	public void addCommandInterpretScript() {
		JavaClass cls = mmtg.editor.addPublicClass("CommandInterpretScript", packName);	
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot
				+ "TextualEditor", containerRoot.toLowerCase()
				+ "Tools.guiEditor.graphicComponents"));	
		cls.getImports().add(mmtg.editor.getClassByName("Generator",containerRoot.toLowerCase()+"Tools.generator"));
		cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()));
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot + "2" + containerRoot + "Script",containerRoot.toLowerCase()+"Tools.transformations"));
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot + "Script"+ "2" + containerRoot ,containerRoot.toLowerCase()+"Tools.transformations"));
		cls.getImports().add(mmtg.editor.getClassByName("Action","javax.swing"));	
		cls.getImplements().add(mmtg.editor.getClassByName("Action","javax.swing"));	
		cls.setExtends(mmtg.editor.getClassByName("Command", packName));
				
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "e", containerRoot	+ "TextualEditor");
		mmtg.editor.addMethodParameterIN(m, "nme", "String");
		mmtg.editor.addMethodParameterIN(m, "desc", "String");
		String block ="		super(e, nme, desc);"+ "\n";
		mmtg.editor.addMethodBlock(m, block);			
		Method m2 = mmtg.editor.addClassPublicMethod(cls, "execute");
		block =	"			" + containerRoot + "Script2" + containerRoot + " transfo = new " + containerRoot + "Script2"+ containerRoot + "(editor.getTextPaneEditor().getText());" + "\n"
				+ "			transfo.transformation(editor.get" + containerRoot + "());" + "\n"
				+ "			editor.getTextPaneEditor().setText(\"" + containerRoot+ "Script{\\n\\n}\");" + "\n" ;
		mmtg.editor.addMethodBlock(m2, block);
	}

	public void addCommandDisplayGraph() {
		JavaClass cls = mmtg.editor.addPublicClass("CommandDisplayGraph", packName);	
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot
				+ "TextualEditor", containerRoot.toLowerCase()
				+ "Tools.guiEditor.graphicComponents"));	
		cls.getImports().add(mmtg.editor.getClassByName("Action","javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()));
		cls.getImplements().add(mmtg.editor.getClassByName("Action","javax.swing"));
		cls.setExtends(mmtg.editor.getClassByName("Command", packName));
		
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "e", containerRoot	+ "TextualEditor");
		mmtg.editor.addMethodParameterIN(m, "nme", "String");
		mmtg.editor.addMethodParameterIN(m, "desc", "String");
		String block ="		super(e, nme, desc);"+ "\n";
		mmtg.editor.addMethodBlock(m, block);
		
		Method m2 = mmtg.editor.addClassPublicMethod(cls, "execute");
		block =	"			editor.graphMonitor.update();" + "\n"
				+ "			editor.graphMonitor.setVisible(true);" + "\n";				
		mmtg.editor.addMethodBlock(m2, block);
	}
	
	
	public void addCommandModelListener() {
		JavaClass cls = mmtg.editor.addPublicClass("CommandModelListener", packName);	
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot
				+ "TextualEditor", containerRoot.toLowerCase()
				+ "Tools.guiEditor.graphicComponents"));	
		cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()));
		cls.getImports().add(mmtg.editor.getClassByName("Action","javax.swing"));
		cls.getImplements().add(mmtg.editor.getClassByName("Action","javax.swing"));
		cls.setExtends(mmtg.editor.getClassByName("Command", packName));
		
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "e", containerRoot	+ "TextualEditor");
		mmtg.editor.addMethodParameterIN(m, "nme", "String");
		mmtg.editor.addMethodParameterIN(m, "desc", "String");
		String block ="		super(e, nme, desc);"+ "\n";
		mmtg.editor.addMethodBlock(m, block);
		
		Method m2 = mmtg.editor.addClassPublicMethod(cls, "execute");
		block =	"			editor.get"+containerRoot+"Listener().listen();" + "\n";				
		mmtg.editor.addMethodBlock(m2, block);		
	}

	public void addCommandLoad(){
		JavaClass cls = mmtg.editor.addPublicClass("CommandLoad", packName);	
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot
				+ "TextualEditor", containerRoot.toLowerCase()
				+ "Tools.guiEditor.graphicComponents"));	
		cls.getImports().add(mmtg.editor.getClassByName("FileChoser",
				containerRoot.toLowerCase()
				+ "Tools.guiEditor.graphicComponents"));
		cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()));	
		cls.getImports().add(mmtg.editor.getClassByName("IOException", "java.io"));
		cls.getImports().add(mmtg.editor.getClassByName("URI", "org.eclipse.emf.common.util"));
		cls.getImports().add(mmtg.editor.getClassByName("Resource", "org.eclipse.emf.ecore.resource"));
		cls.getImports().add(mmtg.editor.getClassByName("ResourceSet", "org.eclipse.emf.ecore.resource"));
		cls.getImports().add(mmtg.editor.getClassByName("ResourceSetImpl", "org.eclipse.emf.ecore.resource.impl"));
		cls.getImports().add(mmtg.editor.getClassByName("XMIResourceFactoryImpl", "org.eclipse.emf.ecore.xmi.impl"));
		
		
		cls.getImports().add(mmtg.editor.getClassByName("Action","javax.swing"));
		cls.getImplements().add(mmtg.editor.getClassByName("Action","javax.swing"));
		cls.setExtends(mmtg.editor.getClassByName("Command", packName));
		
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "e", containerRoot	+ "TextualEditor");
		mmtg.editor.addMethodParameterIN(m, "nme", "String");
		mmtg.editor.addMethodParameterIN(m, "desc", "String");
		String block ="		super(e, nme, desc);"+ "\n";
		mmtg.editor.addMethodBlock(m, block);
		
		Method m2 = mmtg.editor.addClassPublicMethod(cls, "execute");
		block =	"	ResourceSet resourceSetMetamodel;" + "\n" +
		"	Resource resourceModel;" + "\n" +
		"	// REGISTER THE METAMODEL" + "\n" +
		"	resourceSetMetamodel = new ResourceSetImpl();" + "\n" +
		"	resourceSetMetamodel.getPackageRegistry().put("+containerRoot.substring(0,1) + containerRoot.substring(1,containerRoot.length()).toLowerCase()+ "Package.eNS_URI," + "\n" +
		"	"+containerRoot.substring(0,1) + containerRoot.substring(1,containerRoot.length()).toLowerCase()+"Package.eINSTANCE);" + "\n" +
		"	resourceSetMetamodel.getResourceFactoryRegistry()" + "\n" +
		"	.getExtensionToFactoryMap()" + "\n" +
		"	.put(\"xmi\", new XMIResourceFactoryImpl());" + "\n" +
		
		"	FileChoser fc = new FileChoser(editor);" + "\n" +
		"	System.out.println(fc.getChooser().getSelectedFile().getAbsolutePath());" + "\n" +
		"	String path = fc.getChooser().getSelectedFile().getAbsolutePath();" + "\n" +
		"	// LOAD THE MODEL" + "\n" +
		"	resourceModel = resourceSetMetamodel.createResource(URI" + "\n" +
		"	.createFileURI(path));" + "\n" +
		"	try {" + "\n" +
		"	resourceModel.load(null);" + "\n" +
		"	} catch (IOException e) {" + "\n" +
		"	System.out.println(\"error during the model loading step\");" + "\n" +
		"	e.printStackTrace();" + "\n" +
		"	}" + "\n" +
		"	// INSTANTIATE ROOTELEMENT WITH THE CONTAINERROOT OF THE LOADED MODEL" + "\n" +
		"	editor.set"+containerRoot+"(("+containerRoot+") resourceModel.getContents().get(0));" + "\n" +
		"	// getEditor().graphMonitorPolicy.update();" + "\n" ;
		mmtg.editor.addMethodBlock(m2, block);	
	}

	public void addCommandSave(){
		JavaClass cls = mmtg.editor.addPublicClass("CommandSave", packName);	
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot
				+ "TextualEditor", containerRoot.toLowerCase()
				+ "Tools.guiEditor.graphicComponents"));	
		cls.getImports().add(mmtg.editor.getClassByName("FileChoser",
				containerRoot.toLowerCase()
				+ "Tools.guiEditor.graphicComponents"));
		cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()));		
		cls.getImports().add(mmtg.editor.getClassByName("IOException", "java.io"));
		cls.getImports().add(mmtg.editor.getClassByName("URI", "org.eclipse.emf.common.util"));
		cls.getImports().add(mmtg.editor.getClassByName("Resource", "org.eclipse.emf.ecore.resource"));
		cls.getImports().add(mmtg.editor.getClassByName("ResourceSet", "org.eclipse.emf.ecore.resource"));
		cls.getImports().add(mmtg.editor.getClassByName("ResourceSetImpl", "org.eclipse.emf.ecore.resource.impl"));
		cls.getImports().add(mmtg.editor.getClassByName("XMIResourceFactoryImpl", "org.eclipse.emf.ecore.xmi.impl"));
		cls.getImports().add(mmtg.editor.getClassByName("Action","javax.swing"));
		cls.getImplements().add(mmtg.editor.getClassByName("Action","javax.swing"));
		cls.setExtends(mmtg.editor.getClassByName("Command", packName));
		
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "e", containerRoot	+ "TextualEditor");
		mmtg.editor.addMethodParameterIN(m, "nme", "String");
		mmtg.editor.addMethodParameterIN(m, "desc", "String");
		String block ="		super(e, nme, desc);"+ "\n";
		mmtg.editor.addMethodBlock(m, block);
		
		Method m2 = mmtg.editor.addClassPublicMethod(cls, "execute");
		block = "	ResourceSet resourceSetMetamodel;" + "\n" +
		"	Resource resourceModel;" + "\n" +
		"	// REGISTER THE METAMODEL" + "\n" +
		"	resourceSetMetamodel = new ResourceSetImpl();" + "\n" +
		"	resourceSetMetamodel.getPackageRegistry().put("+containerRoot.substring(0,1) + containerRoot.substring(1,containerRoot.length()).toLowerCase()+ "Package.eNS_URI," + "\n" +
		"	"+containerRoot.substring(0,1) + containerRoot.substring(1,containerRoot.length()).toLowerCase()+"Package.eINSTANCE);" + "\n" +
		"	resourceSetMetamodel.getResourceFactoryRegistry()" + "\n" +
		"	.getExtensionToFactoryMap()" + "\n" +
		"	.put(\"xmi\", new XMIResourceFactoryImpl());" + "\n" +
	
		"	FileChoser fc = new FileChoser(editor);" + "\n" +
		"	System.out.println(fc.getChooser().getSelectedFile().getAbsolutePath());" + "\n" +
		"	String path = fc.getChooser().getSelectedFile().getAbsolutePath();" + "\n" +
	
		"	 // SAVE THE MODEL" + "\n" +
		"	 resourceModel = resourceSetMetamodel.createResource(URI" + "\n" +
		"	 .createFileURI(path));" + "\n" +
		"	 resourceModel.getContents().add(editor.get"+containerRoot+"());" + "\n" +
		"	 try {" + "\n" +
		"	 resourceModel.save(null);" + "\n" +
		"	 } catch (IOException e) {" + "\n" +
		"	 System.out.println(\"error during the model saving step\");" + "\n" +
		"	 e.printStackTrace();" + "\n" +
		"	 }" + "\n" ;
		mmtg.editor.addMethodBlock(m2, block);	
		
	}
	
	public void addCommandColoration() {
		JavaClass cls = mmtg.editor.addPublicClass("CommandColoration", packName);	
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot
				+ "TextualEditor", containerRoot.toLowerCase()
				+ "Tools.guiEditor.graphicComponents"));	
		cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()));
		cls.getImports().add(mmtg.editor.getClassByName("Color", "java.awt"));
		cls.getImports().add(mmtg.editor.getClassByName("Matcher", "java.util.regex"));
		cls.getImports().add(mmtg.editor.getClassByName("Pattern", "java.util.regex"));
		cls.getImports().add(mmtg.editor.getClassByName("SwingUtilities", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("MutableAttributeSet", "javax.swing.text"));
		cls.getImports().add(mmtg.editor.getClassByName("SimpleAttributeSet", "javax.swing.text"));
		cls.getImports().add(mmtg.editor.getClassByName("StyleConstants", "javax.swing.text"));
		cls.getImports().add(mmtg.editor.getClassByName("StyledDocument", "javax.swing.text"));
		cls.getImports().add(mmtg.editor.getClassByName("Action","javax.swing"));
		
		cls.getImplements().add(mmtg.editor.getClassByName("Action","javax.swing"));
		cls.setExtends(mmtg.editor.getClassByName("Command", packName));
		
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "e", containerRoot	+ "TextualEditor");
		mmtg.editor.addMethodParameterIN(m, "nme", "String");
		mmtg.editor.addMethodParameterIN(m, "desc", "String");
		String block ="		super(e, nme, desc);"+ "\n";
		mmtg.editor.addMethodBlock(m, block);
		
		Method m2 = mmtg.editor.addClassPublicMethod(cls, "execute");
		block ="		Runnable r = new Runnable() {"+ "\n" +
				"			@Override"+ "\n" +
				"			public void run() {"+ "\n" +
				"				coloration();"+ "\n" +
				"			}"+ "\n" +
				"		};"+ "\n" +
				"		SwingUtilities.invokeLater(r);"+ "\n" ;
		mmtg.editor.addMethodBlock(m2, block);

		Method m3 = mmtg.editor.addClassPublicMethod(cls, "coloration");
		block =	"		String text = editor.getTextPaneEditor().getText().replaceAll(\"\\n\", \" \");"+ "\n" +
				"		final StyledDocument doc = editor.getTextPaneEditor().getStyledDocument();"+ "\n" +
				"		final MutableAttributeSet normal = new SimpleAttributeSet();"+ "\n" +
				"		StyleConstants.setForeground(normal, Color.black);"+ "\n" +
				"		StyleConstants.setBold(normal, false);"+ "\n" +
				"		SwingUtilities.invokeLater(new Runnable() {"+ "\n" +
				"			public void run() {"+ "\n" +
				"				doc.setCharacterAttributes(0, doc.getLength(), normal, true);"+ "\n" +
				"			}"+ "\n" +
				"		});"+ "\n" +
				"		colorationPrimitives(text, doc);"+ "\n" +
				"		colorationPolicyScript(text, doc);"+ "\n" ;
		mmtg.editor.addMethodBlock(m3, block);
		
		Method m4 = mmtg.editor.addClassPublicMethod(cls, "colorationPrimitives");
		mmtg.editor.addMethodParameterIN(m4, "text", "String");
		mmtg.editor.addMethodParameterIN(m4, "doc", "final StyledDocument");
		block =	"		for (String statements : editor.primitives) {"+ "\n" +
				"			Pattern p = Pattern.compile(\"(\" + statements + \")\");"+ "\n" +
				"			Matcher m = p.matcher(text);"+ "\n" +
				"			while (m.find() == true) {"+ "\n" +
				"				MutableAttributeSet attri = new SimpleAttributeSet();"+ "\n" +
				"				StyleConstants.setForeground(attri, Color.blue);"+ "\n" +
				"				StyleConstants.setBold(attri, true);"+ "\n" +
				"				final int start = m.start(0);"+ "\n" +
				"				final int end = m.end(0);"+ "\n" +
				"				final int length = end - start;"+ "\n" +
				"				final MutableAttributeSet style = attri;"+ "\n" +
				"				SwingUtilities.invokeLater(new Runnable() {"+ "\n" +
				"					public void run() {"+ "\n" +
				"						doc.setCharacterAttributes(start, length, style, true);"+ "\n" +
				"					}"+ "\n" +
				"				});"+ "\n" +
				"			}"+ "\n" +
				"		}"+ "\n" ;
		mmtg.editor.addMethodBlock(m4, block);
		
		Method m5 = mmtg.editor.addClassPublicMethod(cls, "colorationPolicyScript");
		mmtg.editor.addMethodParameterIN(m5, "text", "String");
		mmtg.editor.addMethodParameterIN(m5, "doc", "final StyledDocument");
		block =	"		Pattern p = Pattern.compile(\"("+containerRoot+"Script)\");"+ "\n" +
				"		Matcher m = p.matcher(text);"+ "\n" +
				"		while (m.find() == true) {"+ "\n" +
				"			MutableAttributeSet attri = new SimpleAttributeSet();"+ "\n" +
				"			StyleConstants.setForeground(attri, Color.orange);"+ "\n" +
				"			StyleConstants.setBold(attri, true);"+ "\n" +
				"			final int start = m.start(0);"+ "\n" +
				"			final int end = m.end(0);"+ "\n" +
				"			final int length = end - start;"+ "\n" +
				"			final MutableAttributeSet style = attri;"+ "\n" +
				"			SwingUtilities.invokeLater(new Runnable() {"+ "\n" +
				"				public void run() {"+ "\n" +
				"					doc.setCharacterAttributes(start, length, style, true);"+ "\n" +
				"				}"+ "\n" +
				"			});"+ "\n" +
				"		}"+ "\n" ;
		mmtg.editor.addMethodBlock(m5, block);
	}
}