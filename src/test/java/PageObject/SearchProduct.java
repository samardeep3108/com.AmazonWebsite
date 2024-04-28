package PageObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchProduct {
	


WebDriver ldriver;

//constructor
public SearchProduct (WebDriver rdriver)
{
	ldriver = rdriver;


	PageFactory.initElements(rdriver, this);
}
@FindBy(id="searchDropdownBox")
WebElement searchcategory ;

@FindBy (id = "twotabsearchtextbox")
WebElement SearchBox ;

public void SearchCategory () {
	searchcategory.click();
	Select sl = new Select (searchcategory);
	sl.selectByVisibleText("Electronics");

}
public void SearchBox (String Search) {
	SearchBox.click();
	SearchBox.sendKeys(Search);
}


}

	


