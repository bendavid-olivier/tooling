/*******************************************************************************
 * Pattern builder for pattern grapho.grapho
 * Generated by EMF-IncQuery
 * Should contribute a pattern-builder to extension point
 * org.eclipse.viatra2.emf.incquery.codegen.patternmatcher.builder 
 *******************************************************************************/

package patternbuilders.grapho;

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
 * Generated automatically from pattern grapho.grapho
 */
public class PatternBuilderForgrapho implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("grapho.grapho".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("grapho.grapho");
		
		final Address<? extends Receiver> var_40 = buildable.patternCollector("grapho.grapho");
		final Stub<Address<? extends Supplier>> var_41 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_42 = EPackage.Registry.INSTANCE.getEPackage("http://grapho/1.0").getEClassifier("GraphO");
		final Stub<Address<? extends Supplier>> var_43 = buildable.unaryTypeStub(new FlatTuple(new Object[] {"GRAPHO"}), var_42);
		final TupleMask var_44 = new TupleMask(new int[] {}, 0);
		final TupleMask var_45 = new TupleMask(new int[] {}, 1);
		final TupleMask var_46 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_47 = buildable.buildBetaNode(var_41, var_43, var_44, var_45, var_46, false);
		final TupleMask var_48 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_49 = buildable.buildTrimmer(var_47, var_48);
		buildable.buildConnection(var_49, var_40);
		return var_40;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("grapho.grapho".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("GRAPHO", 0);

		}
		return posMapping;
	}
}
