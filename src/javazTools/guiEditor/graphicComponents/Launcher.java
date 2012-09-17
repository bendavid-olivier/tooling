package javazTools.guiEditor.graphicComponents;
import javazTools.guiEditor.graphicComponents.JavazTextualEditor;
import javaz.*;
public class Launcher{
  public JavazTextualEditor editor;
  public Launcher(Javaz x ){
		editor = new JavazTextualEditor(x);

  }
  public void start(){
		editor.setVisible(true);

  }
  public static  void main(String[] args ){
		JavazTextualEditor editor = new JavazTextualEditor();
		editor.setVisible(true);
		editor.update();

  }
}