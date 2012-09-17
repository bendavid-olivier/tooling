package graphoTools.guiEditor.graphicComponents;
import javax.swing.*;
import java.awt.*;
import graphoTools.transformations.*;
import grapho.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import grapho.GraphO;
import graphoTools.transformations.GraphO2DotFile;
import utils.graphStructure.dotThings.DotDisplayer;
public class GraphMonitor extends JFrame{
  public JScrollPane scroll;
  public GraphOTextualEditor editor;
  public GraphMonitor(GraphOTextualEditor x ){
    editor =x;
	GraphO2GraphO transfo2Graph = new GraphO2GraphO(editor.getGraphO());
	 GraphO g = transfo2Graph.transformation();
	 GraphO2DotFile transfo2Dot = new GraphO2DotFile(g);
	 File f = transfo2Dot.transformation("graphs/GraphO.dot");
	 DotDisplayer.createPngFile(f);
    String pngPath = f.getAbsolutePath();
    pngPath = pngPath.substring(0,f.getAbsolutePath().length()-3);
    pngPath = pngPath+"png";
    File pngFile = new File(pngPath);
    scroll = new JScrollPane(new ImageComponent(pngFile));
    add(scroll);
    setTitle("Graph Monitor");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setSize(400, 400);

  }
  public void update(){
	GraphO2GraphO transfo2Graph = new GraphO2GraphO(editor.getGraphO());
	GraphO g = transfo2Graph.transformation();
	GraphO2DotFile transfo2Dot = new GraphO2DotFile(g);
	File f = transfo2Dot.transformation("graphs/GraphO.dot");
	DotDisplayer.createPngFile(f);
    String pngPath = f.getAbsolutePath();
    pngPath = pngPath.substring(0,f.getAbsolutePath().length()-3);
    pngPath = pngPath+"png";
    File pngFile = new File(pngPath);
    setContentPane(new JScrollPane(new ImageComponent(pngFile)));

  }
}