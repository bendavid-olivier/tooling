package kevoreeTools.guiEditor.commands;
import javax.swing.Action;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import kevoreeTools.guiEditor.graphicComponents.KevoreeTextualEditor;
public class Command implements ICommand,Action{
  private String name;
  private String description;
  public KevoreeTextualEditor editor;
  public Command(KevoreeTextualEditor e ,String nme ,String desc ){
		editor = e;
		name = nme;
		description= desc;	

  }
  public String getDescription(){
	return description;
  }
  public void setDescription(String description ){
	this.description = description;
  }
  public String getName(){
	return name;
  }
  public void setName(String name ){
	this.name = name;
  }
  public void addPropertyChangeListener(PropertyChangeListener arg0 ){
	
  }
  public Object getValue(){
	return null;
  }
  public boolean isEnabled(){
	return true;
  }
  public void putValue(String arg0 ,Object arg1 ){
	
  }
  public void removePropertyChangeListener(PropertyChangeListener arg0 ){
	
  }
  public void setEnabled(boolean arg0 ){
	
  }
  public void actionPerformed(ActionEvent arg0 ){
	execute();
  }
  public void execute(){
	
  }
  public Object getValue(String key ){
	return null;
  }
}