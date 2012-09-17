/*******************************************************************************
 * EMF Specific API of the policy.role pattern
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

import signatures.policy.RoleSignature;

/**
 * Generated domain-specific pattern matcher API of of the policy.role pattern.
 * Please instantiate using the static field FACTORY.
 */
@SuppressWarnings("unused")
public class RoleMatcher extends BaseGeneratedMatcher<RoleSignature> implements IncQueryMatcher<RoleSignature>{

	public final static IMatcherFactory<RoleSignature,RoleMatcher> FACTORY = new Factory();
	public static class Factory extends BaseMatcherFactory<RoleSignature,RoleMatcher> {
			@Override
			public RoleMatcher instantiate(ReteEngine<String> reteEngine) throws IncQueryRuntimeException {
				return new RoleMatcher(reteEngine);
			}
			@Override
			public String getPatternName() {
				return "policy.role";
			}
		} 
			
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param ROLE the fixed value of pattern parameter ROLE, or null if not bound.
	 * @return matches represented as an array containing the values of each parameter.
	 */
	public Collection<Object[]> getAllMatchesAsArray(Object ROLE) {
		return getAllMatchesAsArray(new Object[] {ROLE});
	}
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param ROLE the fixed value of pattern parameter ROLE, or null if not bound.
	 * @return matches represented as a RoleSignature object.
	 */
	public Collection<RoleSignature> getAllMatchesAsSignature(Object ROLE) {
		return getAllMatchesAsSignature(new Object[] {ROLE});
	}

	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param ROLE the fixed value of pattern parameter ROLE, or null if not bound.
	 * @return a match represented as an array containing the values of each parameter, or null if no match is found.
	 */
	public Object[] getOneMatchAsArray(Object ROLE) {
		return getOneMatchAsArray(new Object[] {ROLE});
	}
	
	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param ROLE the fixed value of pattern parameter ROLE, or null if not bound.
	 * @return a match represented as a RoleSignature object, or null if no match is found.
	 */
	public RoleSignature getOneMatchAsSignature(Object ROLE) {
		return getOneMatchAsSignature(new Object[] {ROLE});
	}
	
	/**
	 * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
	 * 	under any possible substitution of the unspecified parameters.
	 * @param ROLE the fixed value of pattern parameter ROLE, or null if not bound.
	 * @return true if the input is a valid (partial) match of the pattern.
	 */
	public boolean hasMatch(Object ROLE) {
		return hasMatch(new Object[] {ROLE});
	}
	
	/** 
	 * Returns the number of all pattern matches given some fixed parameters.
	 * @param ROLE the fixed value of pattern parameter ROLE, or null if not bound.
	 * @return the number of pattern matches found.
	 */	
	public int countMatches(Object ROLE) {
		return countMatches(new Object[] {ROLE});
	}
	


	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#getPatternName()
	 */
	@Override
	public String getPatternName() {
		return "policy.role";
	}

	private static final String[] paramNames = new String[] {"ROLE"};
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
	protected RoleSignature tupleToSignature(Tuple t) {
		return new RoleSignature(t.get(0));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#arrayToSignature(java.lang.Object[])
	 */
	@Override
	public RoleSignature arrayToSignature(Object[] signature) {
		return new RoleSignature(signature[0]);
	}	
	
	private RoleMatcher(ReteEngine<String> engine) throws IncQueryRuntimeException {
		super(engine, "policy.role");
	}
		
}