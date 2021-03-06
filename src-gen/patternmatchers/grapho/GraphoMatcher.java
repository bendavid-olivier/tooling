/*******************************************************************************
 * EMF Specific API of the grapho.grapho pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package patternmatchers.grapho;

import java.util.Collection;

import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternSignature;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.matcher.ReteEngine;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;

import signatures.grapho.GraphoSignature;

/**
 * Generated domain-specific pattern matcher API of of the grapho.grapho pattern.
 * Please instantiate using the static field FACTORY.
 */
@SuppressWarnings("unused")
public class GraphoMatcher extends BaseGeneratedMatcher<GraphoSignature> implements IncQueryMatcher<GraphoSignature>{

	public final static IMatcherFactory<GraphoSignature,GraphoMatcher> FACTORY = new Factory();
	public static class Factory extends BaseMatcherFactory<GraphoSignature,GraphoMatcher> {
			@Override
			public GraphoMatcher instantiate(ReteEngine<String> reteEngine) throws IncQueryRuntimeException {
				return new GraphoMatcher(reteEngine);
			}
			@Override
			public String getPatternName() {
				return "grapho.grapho";
			}
		} 
			
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param GRAPHO the fixed value of pattern parameter GRAPHO, or null if not bound.
	 * @return matches represented as an array containing the values of each parameter.
	 */
	public Collection<Object[]> getAllMatchesAsArray(Object GRAPHO) {
		return getAllMatchesAsArray(new Object[] {GRAPHO});
	}
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param GRAPHO the fixed value of pattern parameter GRAPHO, or null if not bound.
	 * @return matches represented as a GraphoSignature object.
	 */
	public Collection<GraphoSignature> getAllMatchesAsSignature(Object GRAPHO) {
		return getAllMatchesAsSignature(new Object[] {GRAPHO});
	}

	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param GRAPHO the fixed value of pattern parameter GRAPHO, or null if not bound.
	 * @return a match represented as an array containing the values of each parameter, or null if no match is found.
	 */
	public Object[] getOneMatchAsArray(Object GRAPHO) {
		return getOneMatchAsArray(new Object[] {GRAPHO});
	}
	
	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param GRAPHO the fixed value of pattern parameter GRAPHO, or null if not bound.
	 * @return a match represented as a GraphoSignature object, or null if no match is found.
	 */
	public GraphoSignature getOneMatchAsSignature(Object GRAPHO) {
		return getOneMatchAsSignature(new Object[] {GRAPHO});
	}
	
	/**
	 * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
	 * 	under any possible substitution of the unspecified parameters.
	 * @param GRAPHO the fixed value of pattern parameter GRAPHO, or null if not bound.
	 * @return true if the input is a valid (partial) match of the pattern.
	 */
	public boolean hasMatch(Object GRAPHO) {
		return hasMatch(new Object[] {GRAPHO});
	}
	
	/** 
	 * Returns the number of all pattern matches given some fixed parameters.
	 * @param GRAPHO the fixed value of pattern parameter GRAPHO, or null if not bound.
	 * @return the number of pattern matches found.
	 */	
	public int countMatches(Object GRAPHO) {
		return countMatches(new Object[] {GRAPHO});
	}
	


	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#getPatternName()
	 */
	@Override
	public String getPatternName() {
		return "grapho.grapho";
	}

	private static final String[] paramNames = new String[] {"GRAPHO"};
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
	protected GraphoSignature tupleToSignature(Tuple t) {
		return new GraphoSignature(t.get(0));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#arrayToSignature(java.lang.Object[])
	 */
	@Override
	public GraphoSignature arrayToSignature(Object[] signature) {
		return new GraphoSignature(signature[0]);
	}	
	
	private GraphoMatcher(ReteEngine<String> engine) throws IncQueryRuntimeException {
		super(engine, "grapho.grapho");
	}
		
}
