package desingpattern.singletonclass;

/*
 * We use singleton pattern when we want to provide a single instance of a class per JVM 
 * 
 * Example : we use it in configuration for a project
 */

//Lazy Initialization method
public class Configuration_LazyInitialization {

	private static final Configuration_LazyInitialization config = null;
	
	private Configuration_LazyInitialization() {
		
	}
	
	public static synchronized Configuration_LazyInitialization getInstance() {
		
		if(config == null)
			return new Configuration_LazyInitialization();
		
		return config;
	}
}
