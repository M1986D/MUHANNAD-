package muhannad.com.muhannadtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class righttoclick {
	static WebDriver drive;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\engin\\eclipse-workspace\\muhannadtraining\\driver\\chromedriver.exe");
		drive = new ChromeDriver();
	    drive.get("https://deluxe-menu.com/popup-mode-sample.html");
		drive.manage().window().maximize();
		WebElement righttoclick=drive.findElement(By.xpath("//img[@style=\"cursor: pointer;\"]"));
		Actions ob=new Actions(drive);
		ob.contextClick(righttoclick).build().perform();
		
		
		
		

	}
}
