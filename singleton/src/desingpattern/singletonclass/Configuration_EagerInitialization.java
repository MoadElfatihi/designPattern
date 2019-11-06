package desingpattern.singletonclass;

/*
 * We use singleton pattern when we want to provide a single instance of a class per JVM 
 * 
 * Example : we use it in configuration for a project
 */

// Eager Initialization method
public class Configuration_EagerInitialization {

	private static final Configuration_EagerInitialization config = new Configuration_EagerInitialization() ;
	
	private Configuration_EagerInitialization() {
		
	}
	
	public static synchronized Configuration_EagerInitialization getInstance() {
		
		return config;
	}
}
