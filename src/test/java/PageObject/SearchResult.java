package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResult {
	
	WebDriver ldriver;

	//constructor
	public SearchResult (WebDriver rdriver)
	{
		ldriver = rdriver;


		PageFactory.initElements(rdriver, this);
	}
@FindBy(id = "a-autoid-1-announce")
WebElement cart ;

public void AddToCart() {
	
	cart.click();
}
	
}
