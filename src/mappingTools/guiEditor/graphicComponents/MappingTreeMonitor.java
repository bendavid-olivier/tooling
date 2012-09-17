package mappingTools.guiEditor.graphicComponents;
import javax.swing.*;
import java.awt.*;
import mappingTools.transformations.*;
import mapping.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import grapho.GraphO;
import javax.swing.JPanel;
import utils.graphStructure.dotThings.DotDisplayer;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.tree.*;
import javax.swing.event.*;
public class MappingTreeMonitor extends JPanel{
  public MappingTextualEditor editor;
  public MappingTreeMonitor(MappingTextualEditor x ){
    editor =x;

  }
}