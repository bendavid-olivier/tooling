package kevoreeTools.guiEditor.graphicComponents;
import kevoreeTools.guiEditor.graphicComponents.KevoreeTextualEditor;
import kevoree.*;
public class Launcher{
  public KevoreeTextualEditor editor;
  public Launcher(Kevoree x ){
		editor = new KevoreeTextualEditor(x);

  }
  public void start(){
		editor.setVisible(true);

  }
  public static  void main(String[] args ){
		KevoreeTextualEditor editor = new KevoreeTextualEditor();
		editor.setVisible(true);
		editor.update();

  }
}