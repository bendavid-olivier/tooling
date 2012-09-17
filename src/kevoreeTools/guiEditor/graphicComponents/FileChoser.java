package kevoreeTools.guiEditor.graphicComponents;
import javax.swing.*;
import java.awt.*;
import kevoreeTools.transformations.*;
import kevoree.*;
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
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
public class FileChoser{
  public JFileChooser chooser;
  public KevoreeTextualEditor editor;
  public FileChoser(JFrame parent ){
        chooser = new JFileChooser();
        chooser.addChoosableFileFilter(new FileFilter() {
@Override
public String getDescription() {
return "models xmi files";
}
@Override
public boolean accept(File arg0) {
return arg0.getName().endsWith(".xmi");
}
});
        int returnVal = chooser.showOpenDialog(parent);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: "
                    + chooser.getSelectedFile().getName());
        }

  }
  public JFileChooser getChooser(){
        return chooser;

  }
  public void setChooser(JFileChooser chooser ){
        this.chooser = chooser;

  }
}