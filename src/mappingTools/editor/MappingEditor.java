package mappingTools.editor;
import mapping.Mapping;
import mapping.MappingFactory;
import org.eclipse.emf.common.util.EList;
import mapping.*;

public class MappingEditor{
  private Mapping mapping;
  private MappingFactory factory;
  
  public MappingEditor(Mapping x ){
		mapping = x;
		factory = MappingFactory.eINSTANCE;

  }
  
  public EList<Element> getRelationelements(Relation value ){
		if(!(value == null)){
			EList<Element> res = value.getElements();
			return res;
		}
		return null;

  }
  
  public EList<Relation> getMappingrelations(Mapping value ){
		if(!(value == null)){
			EList<Relation> res = value.getRelations();
			return res;
		}
		return null;
  }
  
  public void addRelation(String name){
	  Relation r = factory.createRelation();
	  r.setName(name);
	  mapping.getRelations().add(r);
  }
  
  public Relation getRelationByName(String name){
	  Relation res = null;
	  for(Object r : mapping.getRelations()) {
		  Relation rel = (Relation) r;
		  if(rel.getName().equals(name)){
			  res = rel;
		  }
	  }
	  return res;
  }
  
  public void setRelationElement(String relationName, String name){
	  Element e = factory.createElement();
	  e.setName(name);
	  getRelationByName(relationName).setElement(e);	  
  }
  
  public void addRelationWithElement(String relationName, String name){
	  Element e = factory.createElement();
	  e.setName(name);
	  ((Relation)getRelationByName(relationName)).getElements().add(e);	  
  }
  
}