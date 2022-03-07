package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.TestBase;
import webpages.HomePage;
import webpages.LoginPage;

public class TestMethod extends TestBase {
	LoginPage loginp;
	HomePage homePage;
	
	public TestMethod()
	{
		super();
	}


@BeforeMethod
public void setUp(){
	LoginPage.intialization();
	
	loginp = new LoginPage();
	
	
}
@Test(priority=1)
public void loginPageTitleTest(){
	String title = loginp.validateLoginPageTitle();
	Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
}
@Test(priority=2)	
public void loginTest() {
	homePage= loginp.loginClick(prop.getProperty("username"),prop.getProperty("password"));
	  
	 
	
}
@AfterMethod
public void tearDown() {
	driver.quit();
}
}

