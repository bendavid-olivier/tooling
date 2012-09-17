package javazTools.guiEditor.commands;
import javazTools.guiEditor.graphicComponents.JavazTextualEditor;
import javaz.*;
import javazTools.guiEditor.controllers.JavazListener;
import javazTools.generator.Generator;
public class CommandLoadModelExample extends Command{
  public CommandLoadModelExample(JavazTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
		Javaz javaz = JavazFactory.eINSTANCE.createJavaz();
		editor.setJavaz(javaz);
		editor.javazListener = new JavazListener(editor);
		editor.javazListener.listen();
		Generator gen = new Generator(javaz);
		gen.generateModelExample();

  }
}