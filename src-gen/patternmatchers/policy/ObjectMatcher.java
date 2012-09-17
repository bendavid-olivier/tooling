/*******************************************************************************
 * EMF Specific API of the policy.object pattern
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

import signatures.policy.ObjectSignature;

/**
 * Generated domain-specific pattern matcher API of of the policy.object pattern.
 * Please instantiate using the static field FACTORY.
 */
@SuppressWarnings("unused")
public class ObjectMatcher extends BaseGeneratedMatcher<ObjectSignature> implements IncQueryMatcher<ObjectSignature>{

	public final static IMatcherFactory<ObjectSignature,ObjectMatcher> FACTORY = new Factory();
	public static class Factory extends BaseMatcherFactory<ObjectSignature,ObjectMatcher> {
			@Override
			public ObjectMatcher instantiate(ReteEngine<String> reteEngine) throws IncQueryRuntimeException {
				return new ObjectMatcher(reteEngine);
			}
			@Override
			public String getPatternName() {
				return "policy.object";
			}
		} 
			
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param OBJECT the fixed value of pattern parameter OBJECT, or null if not bound.
	 * @return matches represented as an array containing the values of each parameter.
	 */
	public Collection<Object[]> getAllMatchesAsArray(Object OBJECT) {
		return getAllMatchesAsArray(new Object[] {OBJECT});
	}
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param OBJECT the fixed value of pattern parameter OBJECT, or null if not bound.
	 * @return matches represented as a ObjectSignature object.
	 */
	public Collection<ObjectSignature> getAllMatchesAsSignature(Object OBJECT) {
		return getAllMatchesAsSignature(new Object[] {OBJECT});
	}

	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param OBJECT the fixed value of pattern parameter OBJECT, or null if not bound.
	 * @return a match represented as an array containing the values of each parameter, or null if no match is found.
	 */
	public Object[] getOneMatchAsArray(Object OBJECT) {
		return getOneMatchAsArray(new Object[] {OBJECT});
	}
	
	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param OBJECT the fixed value of pattern parameter OBJECT, or null if not bound.
	 * @return a match represented as a ObjectSignature object, or null if no match is found.
	 */
	public ObjectSignature getOneMatchAsSignature(Object OBJECT) {
		return getOneMatchAsSignature(new Object[] {OBJECT});
	}
	
	/**
	 * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
	 * 	under any possible substitution of the unspecified parameters.
	 * @param OBJECT the fixed value of pattern parameter OBJECT, or null if not bound.
	 * @return true if the input is a valid (partial) match of the pattern.
	 */
	public boolean hasMatch(Object OBJECT) {
		return hasMatch(new Object[] {OBJECT});
	}
	
	/** 
	 * Returns the number of all pattern matches given some fixed parameters.
	 * @param OBJECT the fixed value of pattern parameter OBJECT, or null if not bound.
	 * @return the number of pattern matches found.
	 */	
	public int countMatches(Object OBJECT) {
		return countMatches(new Object[] {OBJECT});
	}
	


	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#getPatternName()
	 */
	@Override
	public String getPatternName() {
		return "policy.object";
	}

	private static final String[] paramNames = new String[] {"OBJECT"};
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
	protected ObjectSignature tupleToSignature(Tuple t) {
		return new ObjectSignature(t.get(0));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#arrayToSignature(java.lang.Object[])
	 */
	@Override
	public ObjectSignature arrayToSignature(Object[] signature) {
		return new ObjectSignature(signature[0]);
	}	
	
	private ObjectMatcher(ReteEngine<String> engine) throws IncQueryRuntimeException {
		super(engine, "policy.object");
	}
		
}