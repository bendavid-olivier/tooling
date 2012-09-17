package utils.mapperGenerator;

import javaz.JavaClass;
import javaz.Javaz;
import javaz.JavazFactory;
import javaz.Method;
import utils.editorGenerator.JavazEditor;
import utils.editorGenerator.MetaModelToolsGeneratorGUI;
import mapping.Mapping;
import mapping.MappingFactory;
import mappingTools.editor.MappingEditor;

public class MapperGenerator {
	
	private Mapping mapping;
	private MappingFactory factory;
	private MappingEditor mappingEditor;
	
	public String name;
	public MetaModelToolsGeneratorGUI gui;
	public Javaz java;
	public JavazEditor javazEditor;
	
	public MapperGenerator(){
		factory = MappingFactory.eINSTANCE;
		mapping = factory.createMapping();		
		mappingEditor = new MappingEditor(mapping);
		
		java = JavazFactory.eINSTANCE.createJavaz();
		javazEditor = new JavazEditor(java);
	}
	
	public void generateTest(){
		mapping.setName("PolicyKevoree");
		//connection user (new node) 
		//pre-condition : node.name == A user name
		
		// node user is associated with a session
		// adding session user 
		// pe.getUserByName(node.name).addSession(node.Name);
		
		mappingEditor.addRelation("connectionUser");
		mappingEditor.setRelationElement("connectionUser", "Node"); // ca pour la detection		
		mappingEditor.addRelationWithElement("connectionUser", "User.session"); //ca pour la regle de transfo encore pas clair !
		
		
		mappingEditor.addRelation("activationRole");
		mappingEditor.setRelationElement("activationRole", "Component.type");
		mappingEditor.addRelationWithElement("activationRole", "User.session.roles");
		
	}
	
	
	public void addMonitorModelA(){
		JavaClass cls = javazEditor.addPublicClass("ModelA", "test");	
		javazEditor.addClassPrivateField(cls, "ModelA".toLowerCase(), "ModelA");
		javazEditor.addClassPrivateField(cls,  "factory",  "ModelA".substring(0, 1)+"ModelA".substring(1,"ModelA".length())+"Factory");			
		
		
		Method m = 	javazEditor.addClassPublicConstructor(cls);
		javazEditor.addMethodParameterIN(m, "x", "ModelA");
		String content = "		"+"ModelA".toLowerCase()+" = x;" + "\n" +
						 "		factory = "+"ModelA"+"Factory.eINSTANCE;" + "\n" ;
		javazEditor.addMethodBlock(m, content);		
	}
	
	public void addMonitorModelB(){
		
	}
	
	
	public static void main(String[] args){
		System.out.println("start");
		MapperGenerator mg = new MapperGenerator();
		mg.generateTest();
		System.out.println("end");
	}
}