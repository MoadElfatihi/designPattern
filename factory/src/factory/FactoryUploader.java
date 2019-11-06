package factory;

public class FactoryUploader {

	public IUploader getUploader(Integer price) {
		if(price == null)
		
			return null;
		
		else if (price < 100) {
			System.out.println("AWSUploader");
			return new AWSUploader();
			
		}
		else {
			System.out.println("FTPUploader");
			return new FTPUploader();
		}
	}
}
