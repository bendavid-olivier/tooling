package mappingTools.generator;
import mapping.Mapping;
import mapping.MappingFactory;
public class Generator{
  private Mapping mapping;
  public Generator(Mapping x ){
		mapping = x;

  }
  public void generateModelExample(){
		mapping = MappingFactory.eINSTANCE.createMapping();

  }
}