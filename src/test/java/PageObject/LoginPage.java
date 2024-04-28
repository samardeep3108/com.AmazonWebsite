package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


WebDriver ldriver;

//constructor
public LoginPage (WebDriver rdriver)
{
	ldriver = rdriver;


	PageFactory.initElements(rdriver, this);
}

@FindBy(id= "ap_email")
WebElement MobileNumber ;
@FindBy (id = "continue")
WebElement Proceed ;

public void Credentials(String Mobile) {
MobileNumber.clear();
MobileNumber.sendKeys(Mobile);

}
public void Next () {
Proceed.click();

}
}





 //
