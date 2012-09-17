package policyTools.editor;
import policy.Object;
import policy.Policy;
import policy.PolicyFactory;
import org.eclipse.emf.common.util.EList;
import policy.*;
public class PolicyEditor{
  private Policy policy;
  private PolicyFactory factory;
  public PolicyEditor(Policy x ){
		policy = x;
		factory = PolicyFactory.eINSTANCE;

  }
  public EList<User> getUserdelegatees(User value ){
		if(!(value == null)){
			EList<User> res = value.getDelegatees();
			return res;
		}
		return null;

  }
  public EList<User> getUserdelegates(User value ){
		if(!(value == null)){
			EList<User> res = value.getDelegates();
			return res;
		}
		return null;

  }
  public EList<Role> getUserroles(User value ){
		if(!(value == null)){
			EList<Role> res = value.getRoles();
			return res;
		}
		return null;

  }
  public EList<Permission> getOperationpermissions(Operation value ){
		if(!(value == null)){
			EList<Permission> res = value.getPermissions();
			return res;
		}
		return null;

  }
  public EList<Object> getOperationobjects(Operation value ){
		if(!(value == null)){
			EList<Object> res = value.getObjects();
			return res;
		}
		return null;

  }
  public EList<Object> getPermissionobjects(Permission value ){
		if(!(value == null)){
			EList<Object> res = value.getObjects();
			return res;
		}
		return null;

  }
  public EList<Operation> getPermissionoperations(Permission value ){
		if(!(value == null)){
			EList<Operation> res = value.getOperations();
			return res;
		}
		return null;

  }
  public EList<Role> getPermissionroles(Permission value ){
		if(!(value == null)){
			EList<Role> res = value.getRoles();
			return res;
		}
		return null;

  }
  public EList<PolicyElement> getPolicyelements(Policy value ){
		if(!(value == null)){
			EList<PolicyElement> res = value.getElements();
			return res;
		}
		return null;

  }
  public EList<Role> getSessionroles(Session value ){
		if(!(value == null)){
			EList<Role> res = value.getRoles();
			return res;
		}
		return null;

  }
  public EList<Role> getRolessod(Role value ){
		if(!(value == null)){
			EList<Role> res = value.getSsod();
			return res;
		}
		return null;

  }
  public EList<Permission> getRolepermissions(Role value ){
		if(!(value == null)){
			EList<Permission> res = value.getPermissions();
			return res;
		}
		return null;

  }
  public EList<Role> getRolessodOpp(Role value ){
		if(!(value == null)){
			EList<Role> res = value.getSsodOpp();
			return res;
		}
		return null;

  }
  public EList<Session> getRolesessions(Role value ){
		if(!(value == null)){
			EList<Session> res = value.getSessions();
			return res;
		}
		return null;

  }
  public EList<User> getRoleusers(Role value ){
		if(!(value == null)){
			EList<User> res = value.getUsers();
			return res;
		}
		return null;

  }
  public EList<Role> getRolerhOpp(Role value ){
		if(!(value == null)){
			EList<Role> res = value.getRhOpp();
			return res;
		}
		return null;

  }
  public EList<Role> getRolerh(Role value ){
		if(!(value == null)){
			EList<Role> res = value.getRh();
			return res;
		}
		return null;

  }
  public EList<Role> getRoledsodOpp(Role value ){
		if(!(value == null)){
			EList<Role> res = value.getDsodOpp();
			return res;
		}
		return null;

  }
  public EList<Role> getRoledsod(Role value ){
		if(!(value == null)){
			EList<Role> res = value.getDsod();
			return res;
		}
		return null;

  }
  public EList<Permission> getObjectpermissions(Object value ){
		if(!(value == null)){
			EList<Permission> res = value.getPermissions();
			return res;
		}
		return null;

  }
  public EList<Operation> getObjectoperations(Object value ){
		if(!(value == null)){
			EList<Operation> res = value.getOperations();
			return res;
		}
		return null;

  }
}