/*******************************************************************************
 * EMF Specific API of the grapho.graphoeditor pattern
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

import signatures.grapho.GraphoeditorSignature;

/**
 * Generated domain-specific pattern matcher API of of the grapho.graphoeditor pattern.
 * Please instantiate using the static field FACTORY.
 */
@SuppressWarnings("unused")
public class GraphoeditorMatcher extends BaseGeneratedMatcher<GraphoeditorSignature> implements IncQueryMatcher<GraphoeditorSignature>{

	public final static IMatcherFactory<GraphoeditorSignature,GraphoeditorMatcher> FACTORY = new Factory();
	public static class Factory extends BaseMatcherFactory<GraphoeditorSignature,GraphoeditorMatcher> {
			@Override
			public GraphoeditorMatcher instantiate(ReteEngine<String> reteEngine) throws IncQueryRuntimeException {
				return new GraphoeditorMatcher(reteEngine);
			}
			@Override
			public String getPatternName() {
				return "grapho.graphoeditor";
			}
		} 
			
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param GRAPHOEDITOR the fixed value of pattern parameter GRAPHOEDITOR, or null if not bound.
	 * @return matches represented as an array containing the values of each parameter.
	 */
	public Collection<Object[]> getAllMatchesAsArray(Object GRAPHOEDITOR) {
		return getAllMatchesAsArray(new Object[] {GRAPHOEDITOR});
	}
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param GRAPHOEDITOR the fixed value of pattern parameter GRAPHOEDITOR, or null if not bound.
	 * @return matches represented as a GraphoeditorSignature object.
	 */
	public Collection<GraphoeditorSignature> getAllMatchesAsSignature(Object GRAPHOEDITOR) {
		return getAllMatchesAsSignature(new Object[] {GRAPHOEDITOR});
	}

	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param GRAPHOEDITOR the fixed value of pattern parameter GRAPHOEDITOR, or null if not bound.
	 * @return a match represented as an array containing the values of each parameter, or null if no match is found.
	 */
	public Object[] getOneMatchAsArray(Object GRAPHOEDITOR) {
		return getOneMatchAsArray(new Object[] {GRAPHOEDITOR});
	}
	
	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param GRAPHOEDITOR the fixed value of pattern parameter GRAPHOEDITOR, or null if not bound.
	 * @return a match represented as a GraphoeditorSignature object, or null if no match is found.
	 */
	public GraphoeditorSignature getOneMatchAsSignature(Object GRAPHOEDITOR) {
		return getOneMatchAsSignature(new Object[] {GRAPHOEDITOR});
	}
	
	/**
	 * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
	 * 	under any possible substitution of the unspecified parameters.
	 * @param GRAPHOEDITOR the fixed value of pattern parameter GRAPHOEDITOR, or null if not bound.
	 * @return true if the input is a valid (partial) match of the pattern.
	 */
	public boolean hasMatch(Object GRAPHOEDITOR) {
		return hasMatch(new Object[] {GRAPHOEDITOR});
	}
	
	/** 
	 * Returns the number of all pattern matches given some fixed parameters.
	 * @param GRAPHOEDITOR the fixed value of pattern parameter GRAPHOEDITOR, or null if not bound.
	 * @return the number of pattern matches found.
	 */	
	public int countMatches(Object GRAPHOEDITOR) {
		return countMatches(new Object[] {GRAPHOEDITOR});
	}
	


	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#getPatternName()
	 */
	@Override
	public String getPatternName() {
		return "grapho.graphoeditor";
	}

	private static final String[] paramNames = new String[] {"GRAPHOEDITOR"};
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
	protected GraphoeditorSignature tupleToSignature(Tuple t) {
		return new GraphoeditorSignature(t.get(0));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#arrayToSignature(java.lang.Object[])
	 */
	@Override
	public GraphoeditorSignature arrayToSignature(Object[] signature) {
		return new GraphoeditorSignature(signature[0]);
	}	
	
	private GraphoeditorMatcher(ReteEngine<String> engine) throws IncQueryRuntimeException {
		super(engine, "grapho.graphoeditor");
	}
		
}
