package muhannad.com.muhannadtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsoflexus {
	static WebDriver drive;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\engin\\eclipse-workspace\\muhannadtraining\\driver\\chromedriver.exe"); 
		drive = new ChromeDriver();
		drive.get("https://www.lexus.com");
		drive.manage().window().maximize();
		
		// TODO Auto-generated method stub
		
		Thread.sleep(6000);
		WebElement Shop=drive.findElement(By.xpath("//*[text() ='SHOP' and @aria-expanded='false']"));
		
		Actions ob=new Actions(drive);
		
		ob.moveToElement(Shop).build().perform();
		
		
		
		
		Thread.sleep(6000);
		WebElement SHOP=drive.findElement(By.xpath("//a[@aria-label=\"SEARCH L/CERTIFIED\"]"));
			
		
		ob.moveToElement(SHOP).click().build().perform();
		//@aria-expanded='false'
		
		
		
		
		
		
		
		

	}

}
