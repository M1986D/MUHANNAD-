package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	//add all the locators according to use for that page,create method for locater according to action
@FindBy (name="email") WebElement emails;
@FindBy (name="pass") WebElement password;
@FindBy (linkText = "Forgot password?") WebElement forgots;
@FindBy (linkText = "Create new account") WebElement Createnewaccount;

//we create two methods one for email and one for password

public Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void emailsfill() {
	emails.sendKeys("mohaned_haitham@yahoo.com");
	
}
public void passwordfill() {
	password.sendKeys("muh1986");
}
//we have to make page structure 

		public void forgotclick() {
			forgots.click();
		}
		public void Createnewaccount(){
			Createnewaccount.click();
		}}







