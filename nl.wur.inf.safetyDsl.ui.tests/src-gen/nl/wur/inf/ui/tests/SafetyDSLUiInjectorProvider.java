/*
 * generated by Xtext 2.18.0
 */
package nl.wur.inf.ui.tests;

import com.google.inject.Injector;
import nl.wur.inf.safetyDsl.ui.internal.SafetyDslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class SafetyDSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SafetyDslActivator.getInstance().getInjector("nl.wur.inf.SafetyDSL");
	}

}