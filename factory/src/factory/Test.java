package factory;

// we use factory design pattern when don't know the object needed until execution time not run time (Polymorphism)
public class Test {

	public static void main(String[] args) {
		
		FactoryUploader factoryUploader = new FactoryUploader();
		
		IUploader uploader1 = factoryUploader.getUploader(99);
	
		IUploader uploader2 = factoryUploader.getUploader(101);
	}

}
