package muhannad.com.muhannadtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class locater {
	
	static WebDriver drive;


	public static void main(String[] args) throws InterruptedException {
		
		
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\engin\\eclipse-workspace\\muhannadtraining\\driver\\chromedriver.exe"); 
			drive = new ChromeDriver();
			
			drive.get("https://www.facebook.com");
			drive.manage().window().maximize();
			WebElement EmailFeild=drive.findElement(By.name("email"));
			EmailFeild.sendKeys("7034169458");
			
			
			WebElement ForgotlK=drive.findElement(By.linkText("Forgot password?"));
			
			Thread.sleep(6000);
			ForgotlK.click();
		
				WebElement SearchFeild=drive.findElement(By.name("did_submit"));
			 SearchFeild.click();
		
			 WebElement phone=drive.findElement(By.id("identify_email"));
			 Thread.sleep(6000);
			 phone.sendKeys("7034169458");
			 
			 WebElement CancelButton=drive.findElement(By.linkText("Cancel"));
			 
			 CancelButton.click();
			 
			
	}

}
