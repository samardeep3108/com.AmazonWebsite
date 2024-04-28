package TestCase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObject.*;
import Utilities.ReadExcel;


public class TestCase extends BaseClass {

	@Test (priority = 0)
	public void UserWelcomePage () throws InterruptedException {

		WelcomePage	 Wp = new WelcomePage(driver);
		Thread.sleep(3000);
		Wp.SignInButton();
	}

	@Test (dataProvider = "LoginDataProvider" , priority = 1)
	public void UserLoginPage (String Mobile , String pwds , String UserName) {

		LoginPage Lp = new LoginPage(driver);
	
		Lp.Credentials(Mobile);
		Lp.Next();

	}
	@Test (dataProvider = "LoginDataProvider" ,priority = 2)
	public void UserPassword(String Mobile , String pwds , String UserName) throws InterruptedException {

		PasswordLoginPage PL = new PasswordLoginPage(driver);
		Thread.sleep(3000);
		PL.Passwordcredentials(pwds);
		PL.ClickOnSignIn();

	}
	@DataProvider(name = "LoginDataProvider")
	public Object[][] loginDataProvider() {
	    String fileName = (System.getProperty("user.dir")) + "\\TestData\\AmazonTestData.xlsx";
	    int ttlColumns = ReadExcel.getColCount(fileName, "LoginDetails");
	    System.out.println(ttlColumns);

	    // Assuming there's only one row of data (excluding headers)
	    Object[][] data = new Object[1][ttlColumns];

	    // Fetch data from the second row (index 1)
	    for (int j = 0; j < ttlColumns; j++) {
	        data[0][j] = String.valueOf(ReadExcel.getCellValue(fileName, "LoginDetails", 1, j));

	    
	}
	    
	    return data;
	}

@Test (priority = 3)
public void ProductSearchBar () {
	
	SearchProduct SP = new SearchProduct(driver);
	SP.SearchCategory();
	SP.SearchBox("Apple iPhone 15 (128 GB) - Black");
	
}
@Test (priority = 4)
public void AddtoCart () throws InterruptedException {
	Thread.sleep(3000);
	
	SearchResult SR = new SearchResult(driver);
	SR.AddToCart();
	
}






}







