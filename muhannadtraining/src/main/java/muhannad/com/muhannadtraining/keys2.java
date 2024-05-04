package muhannad.com.muhannadtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keys2 {
	static WebDriver drive;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\engin\\eclipse-workspace\\muhannadtraining\\driver\\chromedriver.exe");
		drive=new ChromeDriver();
		drive.get("https://www.facebook.com/login/");
		WebElement name=drive.findElement(By.name("email"));
		name.sendKeys("mohaned_haitham@yahoo.com");
		Actions ob=new Actions(drive);
		Thread.sleep(2000);
		ob.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		ob.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		ob.keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(2000);
		
		ob.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		
		ob.keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(2000);
		
		
		
		

	}

	private static Exception sleep(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
