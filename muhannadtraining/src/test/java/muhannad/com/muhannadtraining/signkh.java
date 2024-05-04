package muhannad.com.muhannadtraining;

import org.testng.annotations.Test;

import pages.Home;
import pages.forgot;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

@Test
public class signkh {
	WebDriver driver;
  public void f() throws IOException {
	Home ob=new Home(driver);
	ob.emailsfill();
	ob.passwordfill();
	shots();
	ob.forgotclick();
	shots();
	forgot fb=new forgot(driver);
	fb.forgotfill();
	fb.searchbuttonclick();
	String  forgottext=fb.Google();
	assertEquals(forgottext, "Use your google account");
	
  }
  
  @BeforeMethod
  public void beforeMethod() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\engin\\eclipse-workspace\\muhannadtraining\\driver\\chromedriver.exe"); 
		//driver = new ChromeDriver();
	  System.setProperty("webdriver.Edge.driver","C:\\Users\\engin\\eclipse-workspace\\muhannadtraining\\driver\\msedgedriver.exe");
		driver=new EdgeDriver();
	  driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
  }
  public void Ibrowsers(String browser) {
	  if (browser.equalsIgnoreCase("chrome")) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\engin\\eclipse-workspace\\muhannadtraining\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
	  }else if (browser.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.Edge.driver","C:\\Users\\engin\\eclipse-workspace\\muhannadtraining\\driver\\msedgedriver.exe");
		  driver=new EdgeDriver();
	  }else {
		  System.out.println("name of browser didnt exist");
	  }
	 
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.quit();
  }


public void Createnewaccount() {
	Home ob =new Home(driver);
	ob.Createnewaccount();
}
	
	public void shots() throws IOException {
	Date sessio=new Date();
	System.out.println(sessio);
	String kj=sessio.toString().replace("", "_").replace(":", "_");
			
	System.out.println(kj);
	//File output= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File output= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(output, new File("C:\\Users\\engin\\eclipse-workspace\\muhannadtraining\\picures//picures.png"));
		
	}



		
	
}