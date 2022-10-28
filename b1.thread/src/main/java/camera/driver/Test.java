package camera.driver;

import camera.model.BackCam;
import camera.model.FrontCam;
import camera.service.camService;

public class Test {

	public static void main(String[] args) {
		
	final camService cs=new camService();
	
	
	
	FrontCam fc=new FrontCam(cs);
	BackCam bc=new BackCam(cs);
	Thread unknown =new Thread() {
		public void run() {
			camService.timer(10);
		}
	};
	
	fc.start();	
	bc.start();
	unknown.start();

	}

}
