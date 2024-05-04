package muhannad.com.muhannadtraining;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class browser {
	  static WebDriver drive;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\engin\\eclipse-workspace\\muhannadtraining\\driver\\chromedriver.exe"); 
	drive = new ChromeDriver();
	drive.get("https://www.protrainingtech.com");
	
	drive.manage().window().maximize();
	   Thread.sleep(6000);
	   drive.navigate().back();
	   Thread.sleep(6000);
	   drive.navigate().forward();
	   Thread.sleep(6000);
	   
	   drive.close();
	   
	}
	
	

}
