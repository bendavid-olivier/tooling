package graphoTools.generator;
import grapho.GraphO;

import grapho.GraphoFactory;
public class Generator{
  private GraphO grapho;
  public Generator(GraphO x ){
		grapho = x;

  }
  public void generateModelExample(){
		grapho = GraphoFactory.eINSTANCE.createGraphO();

  }
}