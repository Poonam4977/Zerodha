package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import pom.ZerodhaSearch;

public class ZerodhaSearchTest {
	WebDriver driver;
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		driver=Browser.chromeBrowser();
	}
	@BeforeMethod
	public void Login()
	{
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		zerodhaLoginPage.enterUserId("LAJ486");
		zerodhaLoginPage.enterPassword("Suraj@123");
		zerodhaLoginPage.clickOnLogin();
		zerodhaLoginPage.enterPin("221998",driver);
		zerodhaLoginPage.clickOnContinue();
	}
	@Test
	public void searchTest()
	{
		ZerodhaSearch zerodhaSearch= new ZerodhaSearch(driver);
		zerodhaSearch.clickOnSearch(driver);
		zerodhaSearch.enterFullStockName("TATAPOWER");
		zerodhaSearch.clickOnAddStock();
		zerodhaSearch.clickOnOrders(driver);
	}

	

}
