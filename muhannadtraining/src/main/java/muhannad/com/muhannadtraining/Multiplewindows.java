package muhannad.com.muhannadtraining;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.Iterators;

public class Multiplewindows {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\engin\\eclipse-workspace\\muhannadtraining\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement ForgotlK=driver.findElement(By.linkText("Forgot password?"));
		String parentWindowHandle=driver.getWindowHandle();
		String parentWindowHandles = null;
		System.out.println("Window handle parent="+parentWindowHandles);
		
		
			Actions ob=new Actions(driver);
		ob.keyDown(Keys.SHIFT).build().perform();
		ForgotlK.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		Set<String> windowHandles=driver.getWindowHandles();
		Iterator<String> iterator=windowHandles.iterator();
		String Firstwindowhandle=iterators.next();
		String Secondwindowhandle=iterators.next();
		System.out.println("First window handle="+Firstwindowhandle);
		System.out.println("Secondwindowhandle="+Secondwindowhandle);
		driver.switchTo().window(Secondwindowhandle);
		WebElement Namefeilds=driver.findElement(By.id("identify-email"));
		 Namefeilds.sendKeys("https://www.lexus.com");
		
	}

}
