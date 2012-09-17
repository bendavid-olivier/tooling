package kevoreeTools.guiEditor.commands;
import kevoreeTools.guiEditor.graphicComponents.KevoreeTextualEditor;
import kevoree.*;
import kevoreeTools.guiEditor.controllers.KevoreeListener;
import kevoreeTools.generator.Generator;
public class CommandLoadModelExample extends Command{
  public CommandLoadModelExample(KevoreeTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
		Kevoree kevoree = KevoreeFactory.eINSTANCE.createKevoree();
		editor.setKevoree(kevoree);
		editor.kevoreeListener = new KevoreeListener(editor);
		editor.kevoreeListener.listen();
		Generator gen = new Generator(kevoree);
		gen.generateModelExample();

  }
}