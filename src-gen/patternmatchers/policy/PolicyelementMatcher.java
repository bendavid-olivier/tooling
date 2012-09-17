/*******************************************************************************
 * EMF Specific API of the policy.policyelement pattern
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

import signatures.policy.PolicyelementSignature;

/**
 * Generated domain-specific pattern matcher API of of the policy.policyelement pattern.
 * Please instantiate using the static field FACTORY.
 */
@SuppressWarnings("unused")
public class PolicyelementMatcher extends BaseGeneratedMatcher<PolicyelementSignature> implements IncQueryMatcher<PolicyelementSignature>{

	public final static IMatcherFactory<PolicyelementSignature,PolicyelementMatcher> FACTORY = new Factory();
	public static class Factory extends BaseMatcherFactory<PolicyelementSignature,PolicyelementMatcher> {
			@Override
			public PolicyelementMatcher instantiate(ReteEngine<String> reteEngine) throws IncQueryRuntimeException {
				return new PolicyelementMatcher(reteEngine);
			}
			@Override
			public String getPatternName() {
				return "policy.policyelement";
			}
		} 
			
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param POLICYELEMENT the fixed value of pattern parameter POLICYELEMENT, or null if not bound.
	 * @return matches represented as an array containing the values of each parameter.
	 */
	public Collection<Object[]> getAllMatchesAsArray(Object POLICYELEMENT) {
		return getAllMatchesAsArray(new Object[] {POLICYELEMENT});
	}
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param POLICYELEMENT the fixed value of pattern parameter POLICYELEMENT, or null if not bound.
	 * @return matches represented as a PolicyelementSignature object.
	 */
	public Collection<PolicyelementSignature> getAllMatchesAsSignature(Object POLICYELEMENT) {
		return getAllMatchesAsSignature(new Object[] {POLICYELEMENT});
	}

	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param POLICYELEMENT the fixed value of pattern parameter POLICYELEMENT, or null if not bound.
	 * @return a match represented as an array containing the values of each parameter, or null if no match is found.
	 */
	public Object[] getOneMatchAsArray(Object POLICYELEMENT) {
		return getOneMatchAsArray(new Object[] {POLICYELEMENT});
	}
	
	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param POLICYELEMENT the fixed value of pattern parameter POLICYELEMENT, or null if not bound.
	 * @return a match represented as a PolicyelementSignature object, or null if no match is found.
	 */
	public PolicyelementSignature getOneMatchAsSignature(Object POLICYELEMENT) {
		return getOneMatchAsSignature(new Object[] {POLICYELEMENT});
	}
	
	/**
	 * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
	 * 	under any possible substitution of the unspecified parameters.
	 * @param POLICYELEMENT the fixed value of pattern parameter POLICYELEMENT, or null if not bound.
	 * @return true if the input is a valid (partial) match of the pattern.
	 */
	public boolean hasMatch(Object POLICYELEMENT) {
		return hasMatch(new Object[] {POLICYELEMENT});
	}
	
	/** 
	 * Returns the number of all pattern matches given some fixed parameters.
	 * @param POLICYELEMENT the fixed value of pattern parameter POLICYELEMENT, or null if not bound.
	 * @return the number of pattern matches found.
	 */	
	public int countMatches(Object POLICYELEMENT) {
		return countMatches(new Object[] {POLICYELEMENT});
	}
	


	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#getPatternName()
	 */
	@Override
	public String getPatternName() {
		return "policy.policyelement";
	}

	private static final String[] paramNames = new String[] {"POLICYELEMENT"};
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
	protected PolicyelementSignature tupleToSignature(Tuple t) {
		return new PolicyelementSignature(t.get(0));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#arrayToSignature(java.lang.Object[])
	 */
	@Override
	public PolicyelementSignature arrayToSignature(Object[] signature) {
		return new PolicyelementSignature(signature[0]);
	}	
	
	private PolicyelementMatcher(ReteEngine<String> engine) throws IncQueryRuntimeException {
		super(engine, "policy.policyelement");
	}
		
}