package policyTools.guiEditor.graphicComponents;
import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;
import policy.*;
public class Launcher{
  public PolicyTextualEditor editor;
  public Launcher(Policy x ){
		editor = new PolicyTextualEditor(x);

  }
  public void start(){
		editor.setVisible(true);

  }
  public static  void main(String[] args ){
		PolicyTextualEditor editor = new PolicyTextualEditor();
		editor.setVisible(true);
		editor.update();

  }
}