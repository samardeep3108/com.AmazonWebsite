package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class WelcomePage {

	

		//1. create object of webdriver
		WebDriver ldriver;

		//constructor
		public WelcomePage(WebDriver rdriver)
		{
			ldriver = rdriver;


			PageFactory.initElements(rdriver, this);
		}

@FindBy(xpath ="//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][normalize-space()='Sign in']")
WebElement SignIn ;


public void SignInButton ( ) {

	SignIn.click();
}
}
	

	

