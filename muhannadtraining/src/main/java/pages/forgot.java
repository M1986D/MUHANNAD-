package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forgot {
WebDriver driver;
@FindBy(xpath = "//*@aria-Label=Email or mobile number']") WebElement forgotfill;
@FindBy(name="did_submit") WebElement searchbutton;
@FindBy(xpath = "(//*{text()='Use your Google account'])[2]")WebElement verifies;
public forgot(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this)
	;
}
public void forgotfill() {
	forgotfill.sendKeys("mohaned_haitham@yahoo.com");
}
public void searchbuttonclick() {
	searchbutton.click();
}
public String Google() {
	String forgottexts= verifies.getText();
	return forgottexts;
	
}
}
