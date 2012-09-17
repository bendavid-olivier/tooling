package policyTools.generator;
import policy.Policy;
import policy.PolicyFactory;
public class Generator{
  private Policy policy;
  public Generator(Policy x ){
		policy = x;

  }
  public void generateModelExample(){
		policy = PolicyFactory.eINSTANCE.createPolicy();

  }
}