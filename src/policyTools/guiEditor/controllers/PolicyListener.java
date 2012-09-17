package policyTools.guiEditor.controllers;
import policyTools.guiEditor.graphicComponents.PolicyTextualEditor;
import patternbuilders.policy.*;
import patternmatchers.policy.*;
import signatures.policy.*;
import policyTools.guiEditor.graphicComponents.*;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.BuilderRegistry;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;
public class PolicyListener{
  public PolicyTextualEditor editor;
  private UserMatcher userMatcher;
  public DeltaMonitor<UserSignature> monitorUser;
  private OperationMatcher operationMatcher;
  public DeltaMonitor<OperationSignature> monitorOperation;
  private PermissionMatcher permissionMatcher;
  public DeltaMonitor<PermissionSignature> monitorPermission;
  private PolicyMatcher policyMatcher;
  public DeltaMonitor<PolicySignature> monitorPolicy;
  private SessionMatcher sessionMatcher;
  public DeltaMonitor<SessionSignature> monitorSession;
  private RoleMatcher roleMatcher;
  public DeltaMonitor<RoleSignature> monitorRole;
  private ObjectMatcher objectMatcher;
  public DeltaMonitor<ObjectSignature> monitorObject;
  public PolicyListener(PolicyTextualEditor e ){
		editor = e;
		registerMatchers();
		initMatchers();
		monitorUser = userMatcher.newDeltaMonitor(false);
		monitorOperation = operationMatcher.newDeltaMonitor(false);
		monitorPermission = permissionMatcher.newDeltaMonitor(false);
		monitorPolicy = policyMatcher.newDeltaMonitor(false);
		monitorSession = sessionMatcher.newDeltaMonitor(false);
		monitorRole = roleMatcher.newDeltaMonitor(false);
		monitorObject = objectMatcher.newDeltaMonitor(false);

  }
  public void registerMatchers(){

	BuilderRegistry.getContributedStatelessPatternBuilders().put(
	     UserMatcher.FACTORY.getPatternName(),
	     new patternbuilders.policy.PatternBuilderForuser()); 
	BuilderRegistry.getContributedStatelessPatternBuilders().put(
	     OperationMatcher.FACTORY.getPatternName(),
	     new patternbuilders.policy.PatternBuilderForoperation()); 
	BuilderRegistry.getContributedStatelessPatternBuilders().put(
	     PermissionMatcher.FACTORY.getPatternName(),
	     new patternbuilders.policy.PatternBuilderForpermission()); 
	BuilderRegistry.getContributedStatelessPatternBuilders().put(
	     PolicyMatcher.FACTORY.getPatternName(),
	     new patternbuilders.policy.PatternBuilderForpolicy()); 
	BuilderRegistry.getContributedStatelessPatternBuilders().put(
	     SessionMatcher.FACTORY.getPatternName(),
	     new patternbuilders.policy.PatternBuilderForsession()); 
	BuilderRegistry.getContributedStatelessPatternBuilders().put(
	     RoleMatcher.FACTORY.getPatternName(),
	     new patternbuilders.policy.PatternBuilderForrole()); 
	BuilderRegistry.getContributedStatelessPatternBuilders().put(
	     ObjectMatcher.FACTORY.getPatternName(),
	     new patternbuilders.policy.PatternBuilderForobject()); 

  }
  public void initMatchers(){

	  try {
         userMatcher = UserMatcher.FACTORY.getMatcher(editor.getPolicy());
         operationMatcher = OperationMatcher.FACTORY.getMatcher(editor.getPolicy());
         permissionMatcher = PermissionMatcher.FACTORY.getMatcher(editor.getPolicy());
         policyMatcher = PolicyMatcher.FACTORY.getMatcher(editor.getPolicy());
         sessionMatcher = SessionMatcher.FACTORY.getMatcher(editor.getPolicy());
         roleMatcher = RoleMatcher.FACTORY.getMatcher(editor.getPolicy());
         objectMatcher = ObjectMatcher.FACTORY.getMatcher(editor.getPolicy());
	  } catch (IncQueryRuntimeException e) {
	  e.printStackTrace();
      }

  }
  public void listen(){

      userMatcher.addCallbackAfterUpdates(new Runnable() {
        @Override
           public void run() {
      					for (UserSignature sig : monitorUser.matchFoundEvents) {
      					}				
      					for (UserSignature sig : monitorUser.matchLostEvents) {
      					}				
      					monitorUser.clear();
      				}
      			});
      operationMatcher.addCallbackAfterUpdates(new Runnable() {
        @Override
           public void run() {
      					for (OperationSignature sig : monitorOperation.matchFoundEvents) {
      					}				
      					for (OperationSignature sig : monitorOperation.matchLostEvents) {
      					}				
      					monitorOperation.clear();
      				}
      			});
      permissionMatcher.addCallbackAfterUpdates(new Runnable() {
        @Override
           public void run() {
      					for (PermissionSignature sig : monitorPermission.matchFoundEvents) {
      					}				
      					for (PermissionSignature sig : monitorPermission.matchLostEvents) {
      					}				
      					monitorPermission.clear();
      				}
      			});
      policyMatcher.addCallbackAfterUpdates(new Runnable() {
        @Override
           public void run() {
      					for (PolicySignature sig : monitorPolicy.matchFoundEvents) {
      					}				
      					for (PolicySignature sig : monitorPolicy.matchLostEvents) {
      					}				
      					monitorPolicy.clear();
      				}
      			});
      sessionMatcher.addCallbackAfterUpdates(new Runnable() {
        @Override
           public void run() {
      					for (SessionSignature sig : monitorSession.matchFoundEvents) {
      					}				
      					for (SessionSignature sig : monitorSession.matchLostEvents) {
      					}				
      					monitorSession.clear();
      				}
      			});
      roleMatcher.addCallbackAfterUpdates(new Runnable() {
        @Override
           public void run() {
      					for (RoleSignature sig : monitorRole.matchFoundEvents) {
      					}				
      					for (RoleSignature sig : monitorRole.matchLostEvents) {
      					}				
      					monitorRole.clear();
      				}
      			});
      objectMatcher.addCallbackAfterUpdates(new Runnable() {
        @Override
           public void run() {
      					for (ObjectSignature sig : monitorObject.matchFoundEvents) {
      					}				
      					for (ObjectSignature sig : monitorObject.matchLostEvents) {
      					}				
      					monitorObject.clear();
      				}
      			});

  }
}