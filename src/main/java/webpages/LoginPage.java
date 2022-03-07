package webpages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.TestBase;

public class LoginPage extends TestBase {

	
	   @FindBy(name="username")
	   WebElement username;
	   
	   @FindBy(name="password")
	   WebElement password;
	   
	   @FindBy(xpath="//input(@value='Login')")
	   WebElement login;
	   
		
		
		public LoginPage() {
			PageFactory.initElements(driver,this);
		}
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public HomePage loginClick(String user, String pass) {
			username.sendKeys(user);
			password.sendKeys(pass);
			login.click();
			return new HomePage();
			
			
			
		}
		
		
		
		
		


		



}

	
