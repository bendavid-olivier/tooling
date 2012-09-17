/*******************************************************************************
 * Pattern signature of the grapho.grapho pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.grapho;

import java.util.Arrays;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternSignature;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternSignature;

/**
 * Pattern-specific signature object of the grapho.grapho pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 */
@SuppressWarnings("unused")
public final class GraphoSignature extends BasePatternSignature implements IPatternSignature {

	// constructor
	public GraphoSignature(Object GRAPHO) {
		this.fGRAPHO = GRAPHO;	
	}

	//private attributes
	private Object fGRAPHO;
	
	// getter methods
	/** Returns the value of the parameter with the given name, or null if name is invalid. */
	@Override
	public Object get(String parameterName) {
		if ("GRAPHO".equals(parameterName)) return fGRAPHO;
		return null;
	}	
	
	public Object getValueOfGRAPHO(){
		 return fGRAPHO;
	}	
	
	// setter methods
	/** 
	 * Sets the parameter with the given name to the given value. 
	 * @returns true if successful, false if parameter name is invalid. May also fail and return false if the value type is incompatible. 
	 */
	@Override
	public boolean set(String parameterName, Object newValue) {
		if ("GRAPHO".equals(parameterName)) {
			fGRAPHO = newValue;
			return true;
		}
		return false;
	}
	
	public void setValueOfGRAPHO(Object GRAPHO){
		 this.fGRAPHO=GRAPHO;
	}

	// overridden prettyPrint(), hashCode(), equals() with Tuple-semantics
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (! (obj instanceof IPatternSignature))
			return false;
		IPatternSignature otherSig = (IPatternSignature) obj;
		if (!patternName().equals(otherSig.patternName()))
			return false;
		if (!GraphoSignature.class.equals(obj.getClass()))
			return Arrays.deepEquals(toArray(), otherSig.toArray());
		GraphoSignature other = (GraphoSignature) obj;
		if (fGRAPHO == null) {if (other.fGRAPHO != null) return false;}
		else if (!fGRAPHO.equals(other.fGRAPHO)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fGRAPHO == null) ? 0 : fGRAPHO.hashCode());
		return result;
	}

	@Override
	public String prettyPrint() {
		StringBuilder result = new StringBuilder();
		result.append("\"GRAPHO\"=" + prettyPrintValue(fGRAPHO));
		return result.toString();
	}

	// conversion and reflection
	/** Converts the signature to an array representation, with each pattern parameter at their respective position */
	@Override
	public Object[] toArray() {
		return new Object[] {fGRAPHO};
	}
	
	/** Identifies the name of the pattern for which this is a signature. */
	@Override
	public String patternName() {
		return "grapho.grapho";
	}
	
	/** Returns the list of symbolic parameter names. */
	@Override
	public String[] parameterNames() {
		return parameterNames;
	}
	private static String[] parameterNames = {"GRAPHO"};
	
	
}