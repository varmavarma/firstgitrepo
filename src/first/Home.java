package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Home {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("aish");
//Thread.sleep(4000);
WebDriverWait wait7 = new WebDriverWait(driver, 10);
WebElement element7 = wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Forgot password?')]")));
element7.click();
//driver.findElement(By.xpath(".//*[contains(text(),'Forgot password')]")).click();
//Thread.sleep(6000);
driver.close();



}

	}


