package utils.editorGenerator.generatorGenerator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


import javaz.Block;
import javaz.Field;
import javaz.JavaClass;
import javaz.JavaParameter;
import javaz.JavaParameterKind;
import javaz.JavaVisibilityKind;
import javaz.Javaz;
import javaz.JavazFactory;
import javaz.Method;

import utils.editorGenerator.FileGenerator;
import utils.editorGenerator.MetaModelToolsGenerator;
import utils.editorGenerator.editorGenerator.EditorGenerator;
import utils.writer.FileWriterO;

public class GeneratorGenerator extends FileGenerator{

	private String packName;
	private String containerRoot;
	private MetaModelToolsGenerator mmtg;
	
	public GeneratorGenerator( MetaModelToolsGenerator m, String pack) {
		mmtg =m;
		packName = pack;
		containerRoot = mmtg.name;
	}

	public void addGenerator() {
		JavaClass cls = mmtg.editor.addPublicClass("Generator", packName);
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot, containerRoot.toLowerCase()));
		cls.getImports().add(mmtg.editor.getClassByName(containerRoot.substring(0, 1)+containerRoot.substring(1,containerRoot.length())+"Factory", containerRoot.toLowerCase()));		
		mmtg.editor.addClassPrivateField(cls, containerRoot.toLowerCase(), containerRoot);		
		
		Method m = 	mmtg.editor.addClassPublicConstructor(cls);
		mmtg.editor.addMethodParameterIN(m, "x", containerRoot);
		mmtg.editor.addMethodBlock(m, "		"+containerRoot.toLowerCase()+" = x;" + "\n");
				
		Method m2 = mmtg.editor.addClassPublicMethod(cls, "generateModelExample");
		mmtg.editor.addMethodBlock(m2, "		"+containerRoot.toLowerCase()+" = "+containerRoot.substring(0, 1).toUpperCase()+containerRoot.substring(1,containerRoot.length()).toLowerCase()+"Factory.eINSTANCE.create"+containerRoot+"();"+"\n");
	}
	


	public static void main(String[] args){
//		GeneratorGenerator gen = new GeneratorGenerator("Policy");
//		gen.addGenerator();
	}
}
