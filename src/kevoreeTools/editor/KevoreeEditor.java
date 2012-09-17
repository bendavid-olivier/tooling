package kevoreeTools.editor;
import kevoree.Kevoree;
import kevoree.KevoreeFactory;
import org.eclipse.emf.common.util.EList;
import kevoree.*;
public class KevoreeEditor{
  private Kevoree kevoree;
  private KevoreeFactory factory;
  public KevoreeEditor(Kevoree x ){
		kevoree = x;
		factory = KevoreeFactory.eINSTANCE;

  }
  public EList<Component> getNodecomponents(Node value ){
		if(!(value == null)){
			EList<Component> res = value.getComponents();
			return res;
		}
		return null;

  }
  public EList<Channel> getKevoreechannels(Kevoree value ){
		if(!(value == null)){
			EList<Channel> res = value.getChannels();
			return res;
		}
		return null;

  }
  public EList<Node> getKevoreenodes(Kevoree value ){
		if(!(value == null)){
			EList<Node> res = value.getNodes();
			return res;
		}
		return null;

  }
  public EList<Binding> getKevoreebindings(Kevoree value ){
		if(!(value == null)){
			EList<Binding> res = value.getBindings();
			return res;
		}
		return null;

  }
  public EList<Port> getComponentrequired(Component value ){
		if(!(value == null)){
			EList<Port> res = value.getRequired();
			return res;
		}
		return null;

  }
  public EList<Port> getComponentprovided(Component value ){
		if(!(value == null)){
			EList<Port> res = value.getProvided();
			return res;
		}
		return null;

  }
}