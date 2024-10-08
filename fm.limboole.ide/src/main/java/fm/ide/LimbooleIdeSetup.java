/*
 * generated by Xtext 2.36.0
 */
package fm.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fm.LimbooleRuntimeModule;
import fm.LimbooleStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class LimbooleIdeSetup extends LimbooleStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new LimbooleRuntimeModule(), new LimbooleIdeModule()));
	}
	
}
