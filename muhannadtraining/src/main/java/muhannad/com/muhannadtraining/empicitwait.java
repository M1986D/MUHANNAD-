package muhannad.com.muhannadtraining;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class empicitwait {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\engin\\eclipse-workspace\\muhannadtraining\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement Createanaccount=driver.findElement(By.linkText("Createanaccount"));
		Createanaccount.click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		Wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("lastname")));
		
		
		 WebElement Firstname=driver.findElement(By.name("firstname"));
		Firstname.sendKeys("muhannad");
	}	
	

}
