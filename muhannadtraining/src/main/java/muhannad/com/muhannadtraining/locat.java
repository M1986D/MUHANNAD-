package muhannad.com.muhannadtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locat {
	static WebDriver drive;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\engin\\eclipse-workspace\\muhannadtraining\\driver\\chromedriver.exe"); 
		drive = new ChromeDriver();
		
		drive.get("https://www.facebook.com");
		drive.manage().window().maximize();
		
		
		WebElement first_name=drive.findElement(By.name("firstname"));
		
		first_name.sendKeys("Muffffffffffffff");
		
		
		

	}

}
