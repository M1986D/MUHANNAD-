package muhannad.com.muhannadtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {
	static WebDriver Drive;
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\engin\\eclipse-workspace\\muhannadtraining\\driver\\chromedriver.exe");
		Drive = new ChromeDriver();
		
	    Drive.get("https://deluxe-menu.com/popup-mode-sample.html");
	    
		Drive.manage().window().maximize();
		WebElement righttoclick=Drive.findElement(By.xpath("//img[@style=\"cursor: pointer;\"]"));
		Actions ob=new Actions(Drive);
		ob.contextClick(righttoclick).build().perform();
		

		
	}

}
