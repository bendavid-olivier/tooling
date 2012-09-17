package policyTools.guiEditor.commands;
import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;
import policy.*;
import policyTools.guiEditor.controllers.PolicyListener;
import policyTools.generator.Generator;
public class CommandLoadModelExample extends Command{
  public CommandLoadModelExample(PolicyTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
		Policy policy = PolicyFactory.eINSTANCE.createPolicy();
		editor.setPolicy(policy);
		editor.policyListener = new PolicyListener(editor);
		editor.policyListener.listen();
		Generator gen = new Generator(policy);
		gen.generateModelExample();

  }
}