/*******************************************************************************
 * EMF Specific API of the policy.policy pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package patternmatchers.policy;

import java.util.Collection;

import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternSignature;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.matcher.ReteEngine;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;

import signatures.policy.PolicySignature;

/**
 * Generated domain-specific pattern matcher API of of the policy.policy pattern.
 * Please instantiate using the static field FACTORY.
 */
@SuppressWarnings("unused")
public class PolicyMatcher extends BaseGeneratedMatcher<PolicySignature> implements IncQueryMatcher<PolicySignature>{

	public final static IMatcherFactory<PolicySignature,PolicyMatcher> FACTORY = new Factory();
	public static class Factory extends BaseMatcherFactory<PolicySignature,PolicyMatcher> {
			@Override
			public PolicyMatcher instantiate(ReteEngine<String> reteEngine) throws IncQueryRuntimeException {
				return new PolicyMatcher(reteEngine);
			}
			@Override
			public String getPatternName() {
				return "policy.policy";
			}
		} 
			
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param POLICY the fixed value of pattern parameter POLICY, or null if not bound.
	 * @return matches represented as an array containing the values of each parameter.
	 */
	public Collection<Object[]> getAllMatchesAsArray(Object POLICY) {
		return getAllMatchesAsArray(new Object[] {POLICY});
	}
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param POLICY the fixed value of pattern parameter POLICY, or null if not bound.
	 * @return matches represented as a PolicySignature object.
	 */
	public Collection<PolicySignature> getAllMatchesAsSignature(Object POLICY) {
		return getAllMatchesAsSignature(new Object[] {POLICY});
	}

	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param POLICY the fixed value of pattern parameter POLICY, or null if not bound.
	 * @return a match represented as an array containing the values of each parameter, or null if no match is found.
	 */
	public Object[] getOneMatchAsArray(Object POLICY) {
		return getOneMatchAsArray(new Object[] {POLICY});
	}
	
	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param POLICY the fixed value of pattern parameter POLICY, or null if not bound.
	 * @return a match represented as a PolicySignature object, or null if no match is found.
	 */
	public PolicySignature getOneMatchAsSignature(Object POLICY) {
		return getOneMatchAsSignature(new Object[] {POLICY});
	}
	
	/**
	 * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
	 * 	under any possible substitution of the unspecified parameters.
	 * @param POLICY the fixed value of pattern parameter POLICY, or null if not bound.
	 * @return true if the input is a valid (partial) match of the pattern.
	 */
	public boolean hasMatch(Object POLICY) {
		return hasMatch(new Object[] {POLICY});
	}
	
	/** 
	 * Returns the number of all pattern matches given some fixed parameters.
	 * @param POLICY the fixed value of pattern parameter POLICY, or null if not bound.
	 * @return the number of pattern matches found.
	 */	
	public int countMatches(Object POLICY) {
		return countMatches(new Object[] {POLICY});
	}
	


	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#getPatternName()
	 */
	@Override
	public String getPatternName() {
		return "policy.policy";
	}

	private static final String[] paramNames = new String[] {"POLICY"};
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#getParameterNames()
	 */
	@Override
	public String[] getParameterNames() {
		return paramNames;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcher#tupleToSignature(org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple)
	 */
	@Override
	protected PolicySignature tupleToSignature(Tuple t) {
		return new PolicySignature(t.get(0));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#arrayToSignature(java.lang.Object[])
	 */
	@Override
	public PolicySignature arrayToSignature(Object[] signature) {
		return new PolicySignature(signature[0]);
	}	
	
	private PolicyMatcher(ReteEngine<String> engine) throws IncQueryRuntimeException {
		super(engine, "policy.policy");
	}
		
}
