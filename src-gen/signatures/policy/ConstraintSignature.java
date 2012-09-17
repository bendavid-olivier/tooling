/*******************************************************************************
 * Pattern signature of the policy.constraint pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.policy;

import java.util.Arrays;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternSignature;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternSignature;

/**
 * Pattern-specific signature object of the policy.constraint pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 */
@SuppressWarnings("unused")
public final class ConstraintSignature extends BasePatternSignature implements IPatternSignature {

	// constructor
	public ConstraintSignature(Object CONSTRAINT) {
		this.fCONSTRAINT = CONSTRAINT;	
	}

	//private attributes
	private Object fCONSTRAINT;
	
	// getter methods
	/** Returns the value of the parameter with the given name, or null if name is invalid. */
	@Override
	public Object get(String parameterName) {
		if ("CONSTRAINT".equals(parameterName)) return fCONSTRAINT;
		return null;
	}	
	
	public Object getValueOfCONSTRAINT(){
		 return fCONSTRAINT;
	}	
	
	// setter methods
	/** 
	 * Sets the parameter with the given name to the given value. 
	 * @returns true if successful, false if parameter name is invalid. May also fail and return false if the value type is incompatible. 
	 */
	@Override
	public boolean set(String parameterName, Object newValue) {
		if ("CONSTRAINT".equals(parameterName)) {
			fCONSTRAINT = newValue;
			return true;
		}
		return false;
	}
	
	public void setValueOfCONSTRAINT(Object CONSTRAINT){
		 this.fCONSTRAINT=CONSTRAINT;
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
		if (!ConstraintSignature.class.equals(obj.getClass()))
			return Arrays.deepEquals(toArray(), otherSig.toArray());
		ConstraintSignature other = (ConstraintSignature) obj;
		if (fCONSTRAINT == null) {if (other.fCONSTRAINT != null) return false;}
		else if (!fCONSTRAINT.equals(other.fCONSTRAINT)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fCONSTRAINT == null) ? 0 : fCONSTRAINT.hashCode());
		return result;
	}

	@Override
	public String prettyPrint() {
		StringBuilder result = new StringBuilder();
		result.append("\"CONSTRAINT\"=" + prettyPrintValue(fCONSTRAINT));
		return result.toString();
	}

	// conversion and reflection
	/** Converts the signature to an array representation, with each pattern parameter at their respective position */
	@Override
	public Object[] toArray() {
		return new Object[] {fCONSTRAINT};
	}
	
	/** Identifies the name of the pattern for which this is a signature. */
	@Override
	public String patternName() {
		return "policy.constraint";
	}
	
	/** Returns the list of symbolic parameter names. */
	@Override
	public String[] parameterNames() {
		return parameterNames;
	}
	private static String[] parameterNames = {"CONSTRAINT"};
	
	
}
