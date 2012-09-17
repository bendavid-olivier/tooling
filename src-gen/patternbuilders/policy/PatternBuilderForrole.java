/*******************************************************************************
 * Pattern builder for pattern policy.role
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
 * Generated automatically from pattern policy.role
 */
public class PatternBuilderForrole implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("policy.role".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("policy.role");
		
		final Address<? extends Receiver> var_100 = buildable.patternCollector("policy.role");
		final Stub<Address<? extends Supplier>> var_101 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_102 = EPackage.Registry.INSTANCE.getEPackage("http://policy/1.0").getEClassifier("Role");
		final Stub<Address<? extends Supplier>> var_103 = buildable.unaryTypeStub(new FlatTuple(new Object[] {"ROLE"}), var_102);
		final TupleMask var_104 = new TupleMask(new int[] {}, 0);
		final TupleMask var_105 = new TupleMask(new int[] {}, 1);
		final TupleMask var_106 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_107 = buildable.buildBetaNode(var_101, var_103, var_104, var_105, var_106, false);
		final TupleMask var_108 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_109 = buildable.buildTrimmer(var_107, var_108);
		buildable.buildConnection(var_109, var_100);
		return var_100;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("policy.role".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("ROLE", 0);

		}
		return posMapping;
	}
}
