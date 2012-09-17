package test;

public class KevoreeMonitor {	
	
	policyTools.editor.PolicyEditor policyEditor;
	
	public void listen(){
		
		kevoree.Node node = null;
//		policy.User user = policyEditor.getUserByName(node.getName()); 
		//is it sufficient to apply a generation ?
		
//		if (user != null){ 
//			connectionUser(node);
//		}
		
		kevoree.Component component = null;
//		policy.Role role = policyEditor.getRoleByName(component.type); 
		
//		if(role != null){
//			
//		}
	}
	
	public void connectionUser(kevoree.Node node){
		//add user session
	}
	
	public void activationRole(){
		//add user session role
	}
}