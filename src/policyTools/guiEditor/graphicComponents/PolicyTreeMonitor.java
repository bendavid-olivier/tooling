package policyTools.guiEditor.graphicComponents;
import javax.swing.*;
import java.awt.*;
import policyTools.transformations.*;
import policy.*;
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
public class PolicyTreeMonitor extends JPanel{
  public PolicyTextualEditor editor;
  public PolicyTreeMonitor(PolicyTextualEditor x ){
    editor =x;

  }
}