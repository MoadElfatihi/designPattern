package factory;

public class Test {

	public static void main(String[] args) {
		
		FactoryUploader factoryUploader = new FactoryUploader();
		
		IUploader uploader1 = factoryUploader.getUploader(99);
	
		IUploader uploader2 = factoryUploader.getUploader(101);
	}

}
