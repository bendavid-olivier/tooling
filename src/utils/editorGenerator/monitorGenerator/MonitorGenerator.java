package utils.editorGenerator.monitorGenerator;

import java.io.File;
import java.util.ArrayList;

import javaz.JavaClass;
import javaz.Method;
import utils.editorGenerator.FileGenerator;
import utils.editorGenerator.MetaModelToolsGenerator;
import utils.emfHelpers.EmfInfo;

public class MonitorGenerator extends FileGenerator{

	private String packName;
	private String containerRoot;
	private MetaModelToolsGenerator mmtg;
	public MonitorGenerator( MetaModelToolsGenerator m, String pack) {
		mmtg =m;
		packName = pack;
		containerRoot = mmtg.name;
	}
	
	public void addMachineVTCL() {
		File f = new File("models/vtcl/" + containerRoot.toLowerCase() + ".vtcl");
		String content = "import nemf.packages."+containerRoot.toLowerCase()+";" + "\n"
				+ "import nemf.ecore.datatypes;" + "\n" + "import datatypes;"
				+ "\n" + "machine " + containerRoot.toLowerCase() + " { " + "\n";
		EmfInfo info = new EmfInfo(containerRoot);
		for (String s : info.getClasses()) {
			content = content + " pattern " + s.toLowerCase() + "("
					+ s.toUpperCase() + ") = {" + "\n";
			content = content + "   " + s + "(" + s.toUpperCase() + ");" + "\n";
			content = content + " }\n";
		}
		content = content + "}\n";

		writeFileIfNotExist(f, content);
	}

	public void addListenerIncQuery() {
		EmfInfo info = new EmfInfo(containerRoot);
		
		JavaClass cls = mmtg.editor.addPublicClass(containerRoot+"Listener", packName);
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot
				+ "TextualEditor", containerRoot.toLowerCase()
				+ "Tools.guiEditor.graphicComponents"));		
		cls.getImports().add(mmtg.editor.getClassByName("*","patternbuilders."+containerRoot.toLowerCase()));
		cls.getImports().add(mmtg.editor.getClassByName("*","patternmatchers."+containerRoot.toLowerCase()));
		cls.getImports().add(mmtg.editor.getClassByName("*","signatures."+containerRoot.toLowerCase()));
		cls.getImports().add(mmtg.editor.getClassByName("*",containerRoot.toLowerCase()+"Tools.guiEditor.graphicComponents"));
		cls.getImports().add(mmtg.editor.getClassByName("IncQueryRuntimeException","org.eclipse.viatra2.emf.incquery.runtime.exception"));
		cls.getImports().add(mmtg.editor.getClassByName("BuilderRegistry","org.eclipse.viatra2.emf.incquery.runtime.extensibility"));
		cls.getImports().add(mmtg.editor.getClassByName("DeltaMonitor","org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc"));
		
		mmtg.editor.addClassPublicField(cls, "editor", containerRoot+"TextualEditor");
		for (String s : info.getClasses()) {
			String sx = s.substring(0, 1) + s.substring(1, s.length()).toLowerCase();
			mmtg.editor.addClassPrivateField(cls, s.toLowerCase()+"Matcher",sx+"Matcher");
			mmtg.editor.addClassFinalField(cls, "monitor"+s, "DeltaMonitor<"+sx+"Signature>");
		}
	
		Method m = mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "e", containerRoot+"TextualEditor");
		String block ="		editor = e;"+"\n"+
				"		registerMatchers();"+"\n"+
				"		initMatchers();"+"\n";
		for (String s : info.getClasses()) {	
			String sx = s.substring(0, 1) + s.substring(1, s.length()).toLowerCase();
			block = block + "		monitor"+s+" = "+s.toLowerCase()+"Matcher.newDeltaMonitor(false);"+"\n";
		}
		mmtg.editor.addMethodBlock(m, block);
		
			
		Method m1 = mmtg.editor.addClassPublicMethod(cls, "registerMatchers");
		block ="\n";
		for (String s : info.getClasses()) {
			String sx = s.substring(0, 1) + s.substring(1, s.length()).toLowerCase();
			block = block +"	BuilderRegistry.getContributedStatelessPatternBuilders().put("+"\n";
			block = block +"	     "+sx+"Matcher.FACTORY.getPatternName(),"+"\n";
			block = block +"	     "+"new patternbuilders."+containerRoot.toLowerCase()+".PatternBuilderFor"+sx.toLowerCase()+"()); "+"\n";
		}
		mmtg.editor.addMethodBlock(m1, block);
		
		Method m2 = mmtg.editor.addClassPublicMethod(cls, "initMatchers");
		block ="\n";
		block = block +"	  try {"+"\n";
		for (String s : info.getClasses()) {	
			String sx = s.substring(0, 1) + s.substring(1, s.length()).toLowerCase();
			block = block +"         "+ s.toLowerCase()+"Matcher = " + sx + "Matcher.FACTORY.getMatcher(editor.get"+containerRoot+"());"+"\n";
		}
		block = block +"	  } catch (IncQueryRuntimeException e) {"+"\n";	
		block = block +"	  e.printStackTrace();"+"\n";		
		block = block +"      }"+"\n";							
		mmtg.editor.addMethodBlock(m2, block);

		Method m3 = mmtg.editor.addClassPublicMethod(cls, "listen");
		block ="\n";
		for (String s : info.getClasses()) {	
			String sx = s.substring(0, 1) + s.substring(1, s.length()).toLowerCase();
			block = block +"      "+s.toLowerCase()+"Matcher.addCallbackAfterUpdates(new Runnable() {" + "\n";			
			block = block +"      "+"  "+"@Override" + "\n" ;
			block = block +"      "+"     public void run() {" + "\n" ;
			block = block +"      "+"					for ("+sx+"Signature sig : monitor"+s+".matchFoundEvents) {"+"\n";
			block = block +"      "+"					}				"+"\n";
					
			block = block +"      "+"					for ("+sx+"Signature sig : monitor"+s+".matchLostEvents) {"+"\n";
			block = block +"      "+"					}				"+"\n";
			block = block +"      "+"					monitor"+s+".clear();"+"\n";
			block = block +"      "+"				}"+"\n";
			block = block +"      "+"			});"+"\n";
		}
		mmtg.editor.addMethodBlock(m3, block);
	}

}
