package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordLoginPage {
	WebDriver ldriver;

	//constructor
	public PasswordLoginPage (WebDriver rdriver)
	{
		ldriver = rdriver;


		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id= "ap_password")
	WebElement passo ;

	@FindBy(id="signInSubmit")
	WebElement signInButton ;

public void Passwordcredentials(String Passp) {
	
passo.clear();
passo.sendKeys(Passp);
}
public void ClickOnSignIn() {
signInButton.click();
}
}





