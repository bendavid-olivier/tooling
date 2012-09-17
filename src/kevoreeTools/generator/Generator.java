package kevoreeTools.generator;
import kevoree.Kevoree;
import kevoree.KevoreeFactory;
public class Generator{
  private Kevoree kevoree;
  public Generator(Kevoree x ){
		kevoree = x;

  }
  public void generateModelExample(){
		kevoree = KevoreeFactory.eINSTANCE.createKevoree();

  }
}