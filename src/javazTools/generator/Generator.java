package javazTools.generator;
import utils.editorGenerator.MetaModelToolsGenerator;
import javaz.Javaz;
import javaz.JavazFactory;
public class Generator{
  private Javaz javaz;
  public Generator(Javaz x ){
		javaz = x;
  }
  
  
  public void generateModelExample(){
		//javaz = JavazFactory.eINSTANCE.createJavaz();
		MetaModelToolsGenerator mmtg = new MetaModelToolsGenerator("Policy",javaz);
		mmtg.generateModel();
		javaz = mmtg.java;
  }
}