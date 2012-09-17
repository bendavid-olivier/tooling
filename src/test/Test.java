package test;

import java.awt.Dimension;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;


public class Test extends JFrame{
  private  JInternalFrame policyTextualEditor;
  private JInternalFrame javazTextualEditor;
  private JDesktopPane desktopPane;
  
  public Test(){
    super();
    Dimension d = new Dimension(600,600);
    setSize(d);
    setPreferredSize(d);
    
    
    Dimension d2 = new Dimension(100,100);
    policyTextualEditor = new JInternalFrame("policy",true,false,true,true);    
    policyTextualEditor.setSize(d2);
    policyTextualEditor.setVisible(true);    
    
    javazTextualEditor = new JInternalFrame("javaz",true,false,true,true);
    javazTextualEditor.setSize(d2);
    javazTextualEditor.setVisible(true);
    desktopPane = new JDesktopPane();
    
    desktopPane.add(policyTextualEditor);
    desktopPane.add(javazTextualEditor);
    desktopPane.setSelectedFrame(policyTextualEditor);
    desktopPane.setSelectedFrame(javazTextualEditor);
    setContentPane(desktopPane);
    
    setVisible(true);
  }
  
  public static void main(String[] args){
	  Test t = new Test();
  }
  
}