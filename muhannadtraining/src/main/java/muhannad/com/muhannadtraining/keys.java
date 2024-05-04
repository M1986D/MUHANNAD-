package muhannad.com.muhannadtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.tools.javac.util.Names;

public class keys {
	static WebDriver drive;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\engin\\eclipse-workspace\\muhannadtraining\\driver\\chromedriver.exe");
		drive = new ChromeDriver();
	    drive.get("https://www.facebook.com");
		drive.manage().window().maximize();
		WebElement name=drive.findElement(By.name("email"));
		name.sendKeys("saleem@gmail.com");
		Actions ob=new Actions(drive);
		Thread.sleep(6000);
		ob.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		ob.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		ob.keyUp(Keys.CONTROL).build().perform();
		name.clear();
		Thread.sleep(6000);
		name.click();
		ob.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		ob.keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(6000);
	}

}
