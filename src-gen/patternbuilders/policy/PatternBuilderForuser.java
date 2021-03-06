/*******************************************************************************
 * Pattern builder for pattern policy.user
 * Generated by EMF-IncQuery
 * Should contribute a pattern-builder to extension point
 * org.eclipse.viatra2.emf.incquery.codegen.patternmatcher.builder 
 *******************************************************************************/

package patternbuilders.policy;

import java.util.HashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.viatra2.emf.incquery.runtime.IStatelessGeneratedRetePatternBuilder;
import org.eclipse.viatra2.emf.incquery.runtime.term.VPMTermEvaluator;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.boundary.AbstractEvaluator;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.construction.ReteContainerBuildable;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.construction.RetePatternBuildException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.construction.Stub;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.matcher.IPatternMatcherContext;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.network.Receiver;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.network.Supplier;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.remote.Address;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.FlatTuple;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.TupleMask;

/**
 * Generated automatically from pattern policy.user
 */
public class PatternBuilderForuser implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("policy.user".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("policy.user");
		
		final Address<? extends Receiver> var_60 = buildable.patternCollector("policy.user");
		final Stub<Address<? extends Supplier>> var_61 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_62 = EPackage.Registry.INSTANCE.getEPackage("http://policy/1.0").getEClassifier("User");
		final Stub<Address<? extends Supplier>> var_63 = buildable.unaryTypeStub(new FlatTuple(new Object[] {"USER"}), var_62);
		final TupleMask var_64 = new TupleMask(new int[] {}, 0);
		final TupleMask var_65 = new TupleMask(new int[] {}, 1);
		final TupleMask var_66 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_67 = buildable.buildBetaNode(var_61, var_63, var_64, var_65, var_66, false);
		final TupleMask var_68 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_69 = buildable.buildTrimmer(var_67, var_68);
		buildable.buildConnection(var_69, var_60);
		return var_60;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("policy.user".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("USER", 0);

		}
		return posMapping;
	}
}
