package muhannad.com.muhannadtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drobdown {
	static WebDriver drive;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\engin\\eclipse-workspace\\muhannadtraining\\driver\\chromedriver.exe"); 
			drive = new ChromeDriver();
			drive.get("https://www.facebook.com");
			drive.manage().window().maximize();
			WebElement CreatebuttonClick=drive.findElement(By.linkText("Create new account"));
			CreatebuttonClick.click();
			Thread.sleep(6000);
			WebElement birthday_day=drive.findElement(By.name("birthday_day"));
			Select ob=new Select(birthday_day);
			
			
			ob.selectByValue("2");
			
			WebElement birthday_year=drive.findElement(By.name("birthday_year"));
			Thread.sleep(6000);
			WebElement year=drive.findElement(By.id("year"));
			year.click();
			
			WebElement coustomtoggle=drive.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[3]"));
			
			 coustomtoggle.click();
			 WebElement firstname=drive.findElement(By.name("firstname"));
				firstname.sendKeys("muhannad");
				
				
				
				
				WebElement phonee=drive.findElement(By.name("reg_email__"));
				phonee.sendKeys("muhannad");
				
	}

}
