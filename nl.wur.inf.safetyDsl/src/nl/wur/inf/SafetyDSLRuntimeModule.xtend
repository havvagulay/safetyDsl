/*
 * generated by Xtext 2.18.0
 */
package nl.wur.inf


/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class SafetyDSLRuntimeModule extends AbstractSafetyDSLRuntimeModule {
	override Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		new org.eclipse.xtext.naming.SimpleNameProvider.class;
	}
}
