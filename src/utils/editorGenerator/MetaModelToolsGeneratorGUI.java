package utils.editorGenerator;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MetaModelToolsGeneratorGUI extends JFrame{

	private JPanel toolBar;
	
	
	
	public MetaModelToolsGeneratorGUI(){
		super();
		setLayout(new BorderLayout());
		Dimension d = new Dimension(600,400);
		setSize(d);
		setPreferredSize(d);
		setTitle("MetaModel Tool generator");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		initToolBar();
		
		setVisible(true);
		
	}
	
	
	public void initToolBar(){
		toolBar = new JPanel();
		Dimension d = new Dimension(100,400);
		toolBar.setSize(d);
		toolBar.setPreferredSize(d);
		
		JButton genMetamodel = new JButton("1 genMetaModel");
		
		JButton genPatternMatchers = new JButton("2 genMetaModel");
		
		toolBar.add(genMetamodel);
		toolBar.add(genPatternMatchers);
		
		add(toolBar, BorderLayout.PAGE_START);
	}
	
	
	
	
}
