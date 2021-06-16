package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import utill.BorwserFactory;
import utill.ExcellReader;

public class LoginTest<DashboardPage> {

	WebDriver driver;
	ExcellReader exlread = new ExcellReader("src\\main\\java\\testData\\TF_TestData.xlsx");
	String userName = exlread.getCellData("LoginInfo", "UserName ", 2);
	String password = exlread.getCellData("LoginInfo", "Password", 2);

	@Test

	public void validUserShouldBeAbleToLogIn() {
		driver = BorwserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("userName");
		loginPage.insertPassword("password");
		loginPage.clickSignInButton();

	}
 
	public void clickCustomerButton() { 

		// CONSUMER_BUTTON_ELEMENT.click();
	}
}
