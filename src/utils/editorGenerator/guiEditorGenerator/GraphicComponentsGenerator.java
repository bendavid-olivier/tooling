package utils.editorGenerator.guiEditorGenerator;

import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javaz.JavaClass;
import javaz.Method;


import utils.editorGenerator.FileGenerator;
import utils.editorGenerator.MetaModelToolsGenerator;
import utils.writer.FileWriterO;

public class GraphicComponentsGenerator extends FileGenerator{

	private String packName;
	private String containerRoot;
	private MetaModelToolsGenerator mmtg;
	
	public GraphicComponentsGenerator( MetaModelToolsGenerator m, String pack) {
		mmtg =m;
		packName = pack;
		containerRoot = mmtg.name;
	}
	
	public void addLauncher(){
		JavaClass cls = mmtg.editor.addPublicClass("Launcher", packName);
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot
				+ "TextualEditor", containerRoot.toLowerCase()
				+ "Tools.guiEditor.graphicComponents"));		
		cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()));
		
		mmtg.editor.addClassPublicField(cls, "editor", containerRoot+"TextualEditor");
		
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "x", containerRoot);
		String block ="		editor = new "+containerRoot+"TextualEditor(x);"+"\n";
		mmtg.editor.addMethodBlock(m, block);
		
		Method m1 = mmtg.editor.addClassPublicMethod(cls, "start");
		block ="		editor.setVisible(true);"+"\n";
		mmtg.editor.addMethodBlock(m1, block);
	
		Method m2 = mmtg.editor.addClassPublicStaticMethod(cls, "main");
		mmtg.editor.addMethodParameterIN(m2, "args", "String[]");
		block =	"		"+	containerRoot+ "TextualEditor"+ " editor = new "+containerRoot+ "TextualEditor"+"();"+"\n"+
				"		"+"editor.setVisible(true);"+"\n"+
				"		"+"editor.update();"+"\n";
		mmtg.editor.addMethodBlock(m2, block);
	}
	
	public void addTextualEditor(){		
		JavaClass cls = mmtg.editor.addPublicClass(containerRoot+"TextualEditor", packName);
		cls.getImports().add(mmtg.editor.getClassByName("*", "java.awt"));
		cls.getImports().add(mmtg.editor.getClassByName("*", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("*", "java.util"));
		cls.getImports().add(mmtg.editor.getClassByName("List", "java.util"));
		cls.getImports().add(mmtg.editor.getClassByName("*", "java.lang.reflect"));		
		cls.getImports().add(mmtg.editor.getClassByName("*", containerRoot.toLowerCase()));
		cls.getImports().add(mmtg.editor.getClassByName("*", containerRoot.toLowerCase()+"Tools.guiEditor.controllers"));
		cls.getImports().add(mmtg.editor.getClassByName("*", containerRoot.toLowerCase()+"Tools.guiEditor.commands"));
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot+"Editor", containerRoot.toLowerCase()+"Tools.editor"));		
		cls.setExtends(mmtg.editor.getClassByName("JFrame", "javax.swing"));
		
		mmtg.editor.addClassPublicField(cls, "textPaneEditor", "TextPaneEditor");
		mmtg.editor.addClassPublicField(cls, "menuBar", "MenuBarEditor");
		mmtg.editor.addClassPublicField(cls, containerRoot.toLowerCase(), containerRoot);
		mmtg.editor.addClassPublicField(cls, "keyListenerEditor", "KeyListenerEditor");
		mmtg.editor.addClassPublicField(cls, "documentListenerEditor", "DocumentListenerEditor");
		mmtg.editor.addClassPublicField(cls, containerRoot.toLowerCase()+ "Listener", containerRoot+"Listener");
		mmtg.editor.addClassPublicField(cls, "popupCompletion", "PopupCompletion");
		mmtg.editor.addClassPublicField(cls, "graphMonitor", "GraphMonitor");
		mmtg.editor.addClassPublicField(cls, "primitives", "List<String>");
		mmtg.editor.addClassPublicField(cls, "tree", containerRoot+"TreeMonitor");
		
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		String block ="		"+containerRoot.toLowerCase()+" = "+containerRoot.substring(0, 1).toUpperCase()+containerRoot.substring(1, containerRoot.length()).toLowerCase()+"Factory.eINSTANCE.create"+containerRoot+"();"+"\n"+
			" 		setLayout(new BorderLayout());"+"\n"+
			"		initGraphicalComponents();"+"\n"+
			"		initControllers();"+"\n"+		
			"       initPrimitives();"+"\n";
		mmtg.editor.addMethodBlock(m, block);
				
		Method m2 = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m2, "x", containerRoot);		
		block = "		"+containerRoot.toLowerCase()+" = x;"+"\n"+
			" 		setLayout(new BorderLayout());"+"\n"+
			"		initGraphicalComponents();"+"\n"+
			"		initControllers();"+"\n"+
			"		initPrimitives();"+"\n";
		mmtg.editor.addMethodBlock(m2, block);
		
		Method m3 = mmtg.editor.addClassPublicMethod(cls, "update");		
		block = "		graphMonitor.update();"+"\n"+
			"		CommandColoration c= new CommandColoration(this, \"coloration\", \"coloration\");"+"\n"+
			"		c.execute();"+"\n";
		mmtg.editor.addMethodBlock(m3, block);

		Method m4 = mmtg.editor.addClassPublicMethod(cls, "initGraphicalComponents");	
		block= 	"		setTitle(\""+containerRoot.toUpperCase()+" Editor \");"+"\n"+
			"		setSize(600, 400);"+"\n"+
			"		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);"+"\n"+
			"		popupCompletion =new PopupCompletion(this);"+"\n"+
			"		textPaneEditor = new TextPaneEditor(this);"+"\n"+
			"		JScrollPane scroll = new JScrollPane();"+"\n"+
			"		Dimension d =new Dimension(600, 400);"+"\n"+
			"		scroll.setSize(d);"+"\n"+
			"		scroll.setPreferredSize(d);"+"\n"+
			"		scroll.setMinimumSize(d);"+"\n"+
			
			"		tree = new "+containerRoot+"TreeMonitor(this);"+"\n"+
			"		add(tree,BorderLayout.LINE_START);"+"\n"+
			"		add(scroll,BorderLayout.CENTER);"+"\n"+
			
			"		scroll.setViewportView(textPaneEditor);"+"\n"+
			"		menuBar = new MenuBarEditor(this);"+"\n"+
			"		setJMenuBar(menuBar);"+"\n"+
			"		graphMonitor = new GraphMonitor(this);"+"\n";
		mmtg.editor.addMethodBlock(m4, block);
				
		Method m5 = mmtg.editor.addClassPublicMethod(cls, "initControllers");	
		block =	"		"+containerRoot.toLowerCase()+"Listener = new "+containerRoot+"Listener(this);"+"\n"+
			"		keyListenerEditor = new KeyListenerEditor(this);"+"\n"+
			"		documentListenerEditor = new DocumentListenerEditor(this);"+"\n"+
			"		textPaneEditor.addKeyListener(keyListenerEditor);"+"\n"+
			"		textPaneEditor.getDocument().addDocumentListener(documentListenerEditor);"+"\n";
		mmtg.editor.addMethodBlock(m5, block);
			
			
		Method m6 = mmtg.editor.addClassPublicMethod(cls, "initPrimitives");	
		block ="		primitives = new ArrayList<String>();"+"\n"+
			"		for (Method m : "+containerRoot+"Editor.class.getDeclaredMethods()){"+"\n"+
			"			primitives.add(m.getName());"+"\n"+
			"		}"+"\n";
		mmtg.editor.addMethodBlock(m6, block);
			
		Method m7 = mmtg.editor.addClassPublicMethod(cls, "get"+containerRoot);
		mmtg.editor.addMethodParameterOUT(m7, containerRoot);	
		block ="		return "+containerRoot.toLowerCase()+";"+"\n";
		mmtg.editor.addMethodBlock(m7, block);
			
		Method m8 = mmtg.editor.addClassPublicMethod(cls, "set"+containerRoot);
		mmtg.editor.addMethodParameterIN(m8, "x", containerRoot);
		block ="		"+containerRoot.toLowerCase()+"=x;"+"\n";
		mmtg.editor.addMethodBlock(m8, block);
		
		Method m9 = mmtg.editor.addClassPublicMethod(cls, "getTextPaneEditor");
		mmtg.editor.addMethodParameterOUT(m9, "TextPaneEditor");	
		block ="		return textPaneEditor;"+"\n";
		mmtg.editor.addMethodBlock(m9, block);
	
		Method m10 = mmtg.editor.addClassPublicMethod(cls, "get"+containerRoot+"Listener");
		mmtg.editor.addMethodParameterOUT(m10, containerRoot+"Listener");
		block="		return "+containerRoot.toLowerCase()+"Listener;"+"\n";
		mmtg.editor.addMethodBlock(m10, block);
	}
	
	public void addTextPaneEditor(){
		JavaClass cls = mmtg.editor.addPublicClass("TextPaneEditor", packName);
		cls.getImports().add(mmtg.editor.getClassByName("JTextPane", "javax.swing"));
		cls.setExtends(mmtg.editor.getClassByName("JTextPane", "javax.swing"));
		mmtg.editor.addClassPublicField(cls, "parent", containerRoot+"TextualEditor");
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "p", containerRoot+"TextualEditor");
		String block = 	"		"+"parent = p;"+"\n"+			
				"		"+"setText(\""+containerRoot+"Script{\\n\\n}\");"+"\n";
		mmtg.editor.addMethodBlock(m, block);
	}
	
	public void addMenuBarEditor(){
		JavaClass cls = mmtg.editor.addPublicClass("MenuBarEditor", packName);
		cls.getImports().add(mmtg.editor.getClassByName("*", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("JMenuBar", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("*", containerRoot.toLowerCase()+"Tools.guiEditor.commands"));		
		cls.setExtends(mmtg.editor.getClassByName("JMenuBar", "javax.swing"));
		
		mmtg.editor.addClassPublicField(cls, "parent", containerRoot+"TextualEditor");		
		mmtg.editor.addClassPublicField(cls, "menuFile", "JMenu");
		mmtg.editor.addClassPublicField(cls, "menuRun", "JMenu");
		mmtg.editor.addClassPublicField(cls, "menuTools", "JMenu");
		mmtg.editor.addClassPublicField(cls, "menuViews", "JMenu");
		mmtg.editor.addClassPublicField(cls, "menuHelp", "JMenu");
		mmtg.editor.addClassPublicField(cls, "editor", containerRoot+"TextualEditor");
	
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "e", containerRoot+"TextualEditor");
		String block = 	"		"+"editor = e;"+"\n"+
				"		"+"menuFile = new JMenu(\"File\");"+"\n"+
				"		"+"menuRun = new JMenu(\"Run\");"+"\n"+
				"		"+"menuTools = new JMenu(\"Tools\");"+"\n"+
				"		"+"menuViews = new JMenu(\"Views\");"+"\n"+
				"		"+"menuHelp = new JMenu(\"Help\");"+"\n"+
				
				//MENUFILE
				"		"+"JMenuItem ml = new JMenuItem(\"load\");"+"\n"+
				"		"+	"ml.setAction(new CommandLoad(editor, \"load\", \"load\"));"+"\n"+	
				"		"+	"ml.setText(\"load\");"+"\n"+
				"		"+	"ml.setName(\"load\");"+"\n"+
				"		"+	"ml.setVisible(true);"+"\n"+										
				"		"+	"menuFile.add(ml);"+"\n"+
				
				"		"+"JMenuItem ms = new JMenuItem(\"save\");"+"\n"+
				"		"+"ms.setAction(new CommandSave(editor, \"save\", \"save\"));"+"\n"+	
				"		"+	"ms.setText(\"save\");"+"\n"+
				"		"+	"ms.setName(\"save\");"+"\n"+
				"		"+	"ms.setVisible(true);"+"\n"+										
				"		"+	"menuFile.add(ms);"+"\n"+
				
				
				//MENURUN
				"		"+	"\n"+
				"		"+	"JMenuItem m2 = new JMenuItem(\"interpret\");"+"\n"+
				"		"+	"m2.setAction(new CommandInterpretScript(editor, \"interpret\", \"interpret\"));"+"\n"+	
				"		"+	"m2.setText(\"interpret\");"+"\n"+
				"		"+	"m2.setName(\"interpret\");"+"\n"+
				"		"+	"m2.setVisible(true);"+"\n"+										
				"		"+	"menuRun.add(m2);"+"\n"+
				"		"+	"\n"+
				
				//MENUTOOLS
				"		"+	"\n"+
				"		"+	"JMenuItem m = new JMenuItem(\"loadModelExample\");"+"\n"+
				"		"+	"m.setAction(new CommandLoadModelExample(editor, \"loadModelExample\", \"loadModelExample\"));"+"\n"+	
				"		"+	"m.setText(\"loadModelExample\");"+"\n"+
				"		"+	"m.setName(\"loadModelExample\");"+"\n"+
				"		"+	"m.setVisible(true);"+"\n"+										
				"		"+	"menuTools.add(m);"+"\n"+
				"		"+	"\n"+
				"		"+	"\n"+
				"		"+	"JMenuItem m1 = new JMenuItem(\"loadScriptExample\");"+"\n"+
				"		"+	"m1.setAction(new CommandLoadScriptExample(editor, \"loadScriptExample\", \"loadScriptExample\"));"+"\n"+	
				"		"+	"m1.setText(\"loadScriptExample\");"+"\n"+
				"		"+	"m1.setName(\"loadScriptExample\");"+"\n"+
				"		"+	"m1.setVisible(true);"+"\n"+										
				"		"+	"menuTools.add(m1);"+"\n"+
				"		"+	"\n"+
				"		"+	"JMenuItem menuMl = new JMenuItem(\"listenModel\");"+"\n"+
				"		"+	"menuMl.setAction(new CommandModelListener(editor, \"listenModel\", \"listenModel\"));"+"\n"+
				"		"+	"menuMl.setText(\"listenModel\");"+"\n"+
				"		"+	"menuMl.setName(\"listenModel\");"+"\n"+
				"		"+	"menuMl.setVisible(true);"+"\n"+
				"		"+	"menuTools.add(menuMl);"+"\n"+
				
				
				//MENUVIEWS
				"		"+	"\n"+
				"		"+	"JMenuItem m3 = new JMenuItem(\"displayGraph\");"+"\n"+
				"		"+	"m3.setAction(new CommandDisplayGraph(editor, \"displayGraph\", \"displayGraph\"));"+"\n"+	
				"		"+	"m3.setText(\"displayGraph\");"+"\n"+
				"		"+	"m3.setName(\"displayGraph\");"+"\n"+
				"		"+	"m3.setVisible(true);"+"\n"+
				"		"+		"menuViews.add(m3);"+"\n"+
				"		"+	"\n"+
				
				//MENUHELP				
				
				"		"+	"add(menuFile);"+"\n"+
				"		"+	"add(menuRun);"+"\n"+
				"		"+"add(menuTools);"+"\n"+
				"		"+	"add(menuViews);"+"\n"+
				"		"+	"add(menuHelp);"+"\n";
		mmtg.editor.addMethodBlock(m, block);
	}
	
	public void addPopupCompletion(){
		JavaClass cls = mmtg.editor.addPublicClass("PopupCompletion", packName);
		cls.getImports().add(mmtg.editor.getClassByName("*", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("ArrayList", "java.util"));
		cls.getImports().add(mmtg.editor.getClassByName("Collections", "java.util"));
		cls.getImports().add(mmtg.editor.getClassByName("BadLocationException", "javax.swing.text"));
		cls.getImports().add(mmtg.editor.getClassByName("JPopupMenu", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("*", containerRoot.toLowerCase()+"Tools.guiEditor.commands"));		
		cls.setExtends(mmtg.editor.getClassByName("JPopupMenu", "javax.swing"));
		
		mmtg.editor.addClassPublicField(cls, "editor", containerRoot+"TextualEditor");	
		mmtg.editor.addClassPublicField(cls, "propositions", "ArrayList<String>");
		
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "e", containerRoot+"TextualEditor");
		String block ="		super();"+"\n"+
		"		editor = e;"+"\n"+
		"		propositions =new ArrayList<String>();"+"\n";
		mmtg.editor.addMethodBlock(m, block);
		
		Method m2 = mmtg.editor.addClassPublicMethod(cls, "updateItems");
		block =	"		removeAll();"+"\n"+
		"		for(String s : propositions){"+"\n"+
		"			JMenuItem menu = new JMenuItem(s);"+"\n"+
		"			CommandCompletion c = new CommandCompletion(editor, s, s);"+"\n"+
		"			menu.setAction(c);"+"\n"+
		"			menu.setText(s);"+"\n"+
		"			menu.setName(s);"+"\n"+
		"			menu.setVisible(true);"+"\n"+
		"			add(menu);"+"\n"+
		"		}"+"\n";
		mmtg.editor.addMethodBlock(m2, block);
		
		Method m3 = mmtg.editor.addClassPublicMethod(cls, "completion");
		block =	"		int pos = editor.getTextPaneEditor().getCaretPosition() - 1;"+"\n"+
		"		String content = null;"+"\n"+
		"		try {"+"\n"+
		"			content = editor.getTextPaneEditor().getText(0, pos + 1);"+"\n"+
		"		} catch (BadLocationException e) {"+"\n"+
		"			e.printStackTrace();"+"\n"+
		"		}"+"\n"+
		"		int w;"+"\n"+
		"		for (w = pos; w >= 0; w--) {"+"\n"+
		"			if (!Character.isLetter(content.charAt(w))) {"+"\n"+
		"				break;"+"\n"+
		"			}"+"\n"+
		"		}"+"\n"+
		"		if (pos - w < 1) {"+"\n"+
		"			propositions.clear();"+"\n"+
		"			for (String val : editor.primitives) {"+"\n"+
		"				propositions.add(val);"+"\n"+
		"			}"+"\n"+
		"			updateItems();"+"\n"+
		"			return;"+"\n"+
		"		}"+"\n"+
		"		String prefix = content.substring(w + 1);"+"\n"+
		"		int n = Collections.binarySearch(editor.primitives, prefix);"+"\n"+
		"		if (n < 0 && -n <= editor.primitives.size()) {"+"\n"+
		"			propositions.clear();"+"\n"+
		"			for (String val : editor.primitives) {"+"\n"+
		"				if (val.startsWith(prefix)) {"+"\n"+
		"					propositions.add(val);"+"\n"+
		"				}"+"\n"+
		"			}"+"\n"+
		"		}"+"\n"+
		"		updateItems();"+"\n";		
		mmtg.editor.addMethodBlock(m3, block);
	}
	
	public void addImageComponent(){
		JavaClass cls = mmtg.editor.addPublicClass("ImageComponent", packName);
		cls.getImports().add(mmtg.editor.getClassByName("*", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("*", "java.awt"));
		cls.getImports().add(mmtg.editor.getClassByName("BufferedImage", "java.awt.image"));
		
		cls.getImports().add(mmtg.editor.getClassByName("File", "java.io"));
		cls.getImports().add(mmtg.editor.getClassByName("IOException", "java.io"));
		cls.getImports().add(mmtg.editor.getClassByName("BufferedImage", "java.awt.image"));
		cls.getImports().add(mmtg.editor.getClassByName("ImageIO", "javax.imageio"));
		cls.getImports().add(mmtg.editor.getClassByName("JComponent", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("JFrame", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("JScrollPane", "javax.swing"));		
		cls.setExtends(mmtg.editor.getClassByName("JComponent", "javax.swing"));
		
		mmtg.editor.addClassPublicField(cls, "bufferedImage", "BufferedImage");	
	
		
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		String block ="        setBackground(Color.white);"+"\n"+
				"        try {"+"\n"+
				"            bufferedImage = ImageIO.read(new File(\"Graph.png\"));"+"\n"+
				"        } catch (IOException e) {"+"\n"+
				"        }"+"\n";
		mmtg.editor.addMethodBlock(m, block);
		    
		Method m1 = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m1, "f", "File");
	    block ="        try {"+"\n"+
	    		"            bufferedImage = ImageIO.read(f);"+"\n"+
	    		"        } catch (IOException e) {"+"\n"+
	    		"        }"+"\n";
		mmtg.editor.addMethodBlock(m1, block);
	
		Method m2 = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m2, "bi","BufferedImage");
		block ="        bufferedImage = bi;"+"\n";
		mmtg.editor.addMethodBlock(m2, block);
		
		Method m3 = mmtg.editor.addClassPublicMethod(cls,"paint");
		mmtg.editor.addMethodParameterIN(m3, "g","Graphics");
		block ="        g.drawImage(getBufferedImage(), 0, 0, null);"+"\n";
		mmtg.editor.addMethodBlock(m3, block);
		
		Method m4 = mmtg.editor.addClassPublicMethod(cls,"scale");
		mmtg.editor.addMethodParameterOUT(m4, "BufferedImage");
		mmtg.editor.addMethodParameterIN(m4, "source","BufferedImage");
		mmtg.editor.addMethodParameterIN(m4, "width","int");
		mmtg.editor.addMethodParameterIN(m4, "height","int");
		block ="        BufferedImage buf = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);"+"\n"+
				"        Graphics2D g = buf.createGraphics();"+"\n"+
				"        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);"+"\n"+
				"        g.drawImage(source, 0, 0, width, height, null);"+"\n"+
				"        g.dispose();"+"\n"+
				"        return buf;"+"\n";
		mmtg.editor.addMethodBlock(m4, block);
	
		Method m5 = mmtg.editor.addClassPublicMethod(cls,"getPreferredSize");
		mmtg.editor.addMethodParameterOUT(m5, "Dimension");
		mmtg.editor.addMethodParameterIN(m5, "g","Graphics");
		block ="        if (getBufferedImage() == null) {"+"\n"+
				"            return new Dimension(100, 100);"+"\n"+
				"        } else {"+"\n"+
				"            return new Dimension(getBufferedImage().getWidth(null), getBufferedImage().getHeight(null));"+"\n"+
				"        }"+"\n";
		mmtg.editor.addMethodBlock(m5, block);
	
	
		Method m6 = mmtg.editor.addClassPublicMethod(cls,"getBufferedImage");
		mmtg.editor.addMethodParameterOUT(m6, "BufferedImage");
		block ="        return bufferedImage;"+"\n";
		mmtg.editor.addMethodBlock(m6, block);
		
		Method m7 = mmtg.editor.addClassPublicMethod(cls,"setBufferedImage");
		mmtg.editor.addMethodParameterIN(m7, "img","BufferedImage");
		block ="        this.bufferedImage = img;"+"\n";
		mmtg.editor.addMethodBlock(m7, block);

		Method m8 = mmtg.editor.addClassPublicStaticMethod(cls,"main");
		mmtg.editor.addMethodParameterIN(m8, "args","String[]");
		block ="        JFrame f = new JFrame(\"Load Image Sample\");"+"\n"+
				"        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);"+"\n"+
				"        f.setSize(400, 400);"+"\n"+
				"        JScrollPane jsp = new JScrollPane(new ImageComponent(new File(\"/home/obendavi/Bureau/coding/workspaceKEVOREE/kevoree-experiment/org.kevoree.experiment.kevoreeAndIncQuery/graphs/ola.png\")));"+"\n"+
				"        f.add(jsp);"+"\n"+
				"        f.setVisible(true);"+"\n";
		mmtg.editor.addMethodBlock(m8, block);
	}
	
	public void addGraphMonitor(){
		JavaClass cls = mmtg.editor.addPublicClass("GraphMonitor", packName);
		
		cls.getImports().add(mmtg.editor.getClassByName("*", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("*", "java.awt"));
		cls.getImports().add(mmtg.editor.getClassByName("*", containerRoot.toLowerCase()+"Tools.transformations"));
		cls.getImports().add(mmtg.editor.getClassByName("*", containerRoot.toLowerCase()));
		cls.getImports().add(mmtg.editor.getClassByName("BufferedImage", "java.awt.image"));		
		cls.getImports().add(mmtg.editor.getClassByName("File", "java.io"));
		cls.getImports().add(mmtg.editor.getClassByName("IOException", "java.io"));
		cls.getImports().add(mmtg.editor.getClassByName("BufferedImage", "java.awt.image"));
		cls.getImports().add(mmtg.editor.getClassByName("ImageIO", "javax.imageio"));
		cls.getImports().add(mmtg.editor.getClassByName("JComponent", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("JFrame", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("JScrollPane", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("GraphO", "grapho"));	
		cls.getImports().add(mmtg.editor.getClassByName("GraphO2DotFile", "graphoTools.transformations"));	
		cls.getImports().add(mmtg.editor.getClassByName("JScrollPane", "javax.swing"));	
		cls.getImports().add(mmtg.editor.getClassByName("DotDisplayer", "utils.graphStructure.dotThings"));
		cls.setExtends(mmtg.editor.getClassByName("JFrame", "javax.swing"));
		
		mmtg.editor.addClassPublicField(cls, "scroll", "JScrollPane");
		mmtg.editor.addClassPublicField(cls, "editor", containerRoot	+"TextualEditor");	
	
		
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "x",containerRoot+"TextualEditor");
		String block ="    editor =x;"+"\n"+
				"	"+containerRoot+"2GraphO transfo2Graph = new "+containerRoot+"2GraphO(editor.get"+containerRoot+"());"+"\n"+
				"	 GraphO g = transfo2Graph.transformation();"+"\n"+
				"	 GraphO2DotFile transfo2Dot = new GraphO2DotFile(g);"+"\n"+
				"	 File f = transfo2Dot.transformation(\"graphs/"+containerRoot+".dot\");"+"\n"+
				"	 DotDisplayer.createPngFile(f);"+"\n"+
					        
			    "    String pngPath = f.getAbsolutePath();"+"\n"+
			    "    pngPath = pngPath.substring(0,f.getAbsolutePath().length()-3);"+"\n"+
			    "    pngPath = pngPath+\"png\";"+"\n"+
			        
			    "    File pngFile = new File(pngPath);"+"\n"+ 
			    "    scroll = new JScrollPane(new ImageComponent(pngFile));"+"\n"+
			    "    add(scroll);"+"\n"+
			        
			    "    setTitle(\"Graph Monitor\");"+"\n"+
			    "    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);"+"\n"+
			    "    setSize(400, 400);"+"\n";
		mmtg.editor.addMethodBlock(m, block);
		
		Method m1 = mmtg.editor.addClassPublicMethod(cls,"update");
		block ="	"+containerRoot+"2GraphO transfo2Graph = new "+containerRoot+"2GraphO(editor.get"+containerRoot+"());"+"\n"+
				"	GraphO g = transfo2Graph.transformation();"+"\n"+
				"	GraphO2DotFile transfo2Dot = new GraphO2DotFile(g);"+"\n"+
				"	File f = transfo2Dot.transformation(\"graphs/"+containerRoot+".dot\");"+"\n"+
				"	DotDisplayer.createPngFile(f);"+"\n"+
					        
			    "    String pngPath = f.getAbsolutePath();"+"\n"+
			    "    pngPath = pngPath.substring(0,f.getAbsolutePath().length()-3);"+"\n"+
			    "    pngPath = pngPath+\"png\";"+"\n"+
			    "    File pngFile = new File(pngPath);"+"\n"+ 
			        
			    "    setContentPane(new JScrollPane(new ImageComponent(pngFile)));"+"\n";
		mmtg.editor.addMethodBlock(m1, block);
	}
	
	
	public void addFileChoser(){
		JavaClass cls = mmtg.editor.addPublicClass("FileChoser", packName);
		
		cls.getImports().add(mmtg.editor.getClassByName("*", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("*", "java.awt"));
		cls.getImports().add(mmtg.editor.getClassByName("*", containerRoot.toLowerCase()+"Tools.transformations"));
		cls.getImports().add(mmtg.editor.getClassByName("*", containerRoot.toLowerCase()));
		cls.getImports().add(mmtg.editor.getClassByName("BufferedImage", "java.awt.image"));		
		cls.getImports().add(mmtg.editor.getClassByName("File", "java.io"));
		cls.getImports().add(mmtg.editor.getClassByName("IOException", "java.io"));
		cls.getImports().add(mmtg.editor.getClassByName("BufferedImage", "java.awt.image"));
		cls.getImports().add(mmtg.editor.getClassByName("ImageIO", "javax.imageio"));
		cls.getImports().add(mmtg.editor.getClassByName("JComponent", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("JFrame", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("JScrollPane", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("GraphO", "grapho"));	
		cls.getImports().add(mmtg.editor.getClassByName("GraphO2DotFile", "graphoTools.transformations"));	
		cls.getImports().add(mmtg.editor.getClassByName("JScrollPane", "javax.swing"));	
		cls.getImports().add(mmtg.editor.getClassByName("DotDisplayer", "utils.graphStructure.dotThings"));
		cls.getImports().add(mmtg.editor.getClassByName("JFileChooser", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("FileFilter", "javax.swing.filechooser"));
		
		mmtg.editor.addClassPublicField(cls, "chooser", "JFileChooser");
		mmtg.editor.addClassPublicField(cls, "editor", containerRoot	+"TextualEditor");	
	
		
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "parent","JFrame");
		String block ="        chooser = new JFileChooser();"+"\n"+
				"        chooser.addChoosableFileFilter(new FileFilter() {"+"\n"+
				"@Override"+"\n"+
				"public String getDescription() {"+"\n"+
				"return \"models xmi files\";"+"\n"+
				"}"+"\n"+

				"@Override"+"\n"+
				"public boolean accept(File arg0) {"+"\n"+
				"return arg0.getName().endsWith(\".xmi\");"+"\n"+
				"}"+"\n"+
				"});"+"\n"+
				"        int returnVal = chooser.showOpenDialog(parent);"+"\n"+
				"        if (returnVal == JFileChooser.APPROVE_OPTION) {"+"\n"+
				"            System.out.println(\"You chose to open this file: \""+"\n"+
				"                    + chooser.getSelectedFile().getName());"+"\n"+
				"        }"+"\n";
		mmtg.editor.addMethodBlock(m, block);

		Method m1 = mmtg.editor.addClassPublicMethod(cls,"getChooser");
		mmtg.editor.addMethodParameterOUT(m1, "JFileChooser");
		block ="        return chooser;"+"\n";
		mmtg.editor.addMethodBlock(m1, block);
		
		Method m2 = mmtg.editor.addClassPublicMethod(cls,"setChooser");
		mmtg.editor.addMethodParameterIN(m2,"chooser", "JFileChooser");
		block ="        this.chooser = chooser;"+"\n";
		mmtg.editor.addMethodBlock(m2, block);
	}
	
	public void addTreeMonitor(){
		JavaClass cls = mmtg.editor.addPublicClass(containerRoot+"TreeMonitor", packName);
		
		cls.getImports().add(mmtg.editor.getClassByName("*", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("*", "java.awt"));
		cls.getImports().add(mmtg.editor.getClassByName("*", containerRoot.toLowerCase()+"Tools.transformations"));
		cls.getImports().add(mmtg.editor.getClassByName("*", containerRoot.toLowerCase()));
		cls.getImports().add(mmtg.editor.getClassByName("BufferedImage", "java.awt.image"));		
		cls.getImports().add(mmtg.editor.getClassByName("File", "java.io"));
		cls.getImports().add(mmtg.editor.getClassByName("IOException", "java.io"));
		cls.getImports().add(mmtg.editor.getClassByName("BufferedImage", "java.awt.image"));
		cls.getImports().add(mmtg.editor.getClassByName("ImageIO", "javax.imageio"));
		cls.getImports().add(mmtg.editor.getClassByName("JComponent", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("JFrame", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("JScrollPane", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("GraphO", "grapho"));	
		cls.getImports().add(mmtg.editor.getClassByName("JPanel", "javax.swing"));	
		cls.getImports().add(mmtg.editor.getClassByName("JScrollPane", "javax.swing"));	
		cls.getImports().add(mmtg.editor.getClassByName("DotDisplayer", "utils.graphStructure.dotThings"));
		cls.getImports().add(mmtg.editor.getClassByName("JFileChooser", "javax.swing"));
		cls.getImports().add(mmtg.editor.getClassByName("FileFilter", "javax.swing.filechooser"));
		cls.getImports().add(mmtg.editor.getClassByName("*", "javax.swing.tree"));
		cls.getImports().add(mmtg.editor.getClassByName("*", "javax.swing.event"));
		cls.setExtends(mmtg.editor.getClassByName("JPanel", "javax.swing"));
		
		mmtg.editor.addClassPublicField(cls, "editor", containerRoot	+"TextualEditor");	
	
		
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "x",containerRoot+"TextualEditor");
		String block ="    editor =x;"+"\n";
		mmtg.editor.addMethodBlock(m, block);
	}
}