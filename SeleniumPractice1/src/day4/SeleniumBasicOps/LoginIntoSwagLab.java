package day4.SeleniumBasicOps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day3.BrowserOpening.GenericWayToOpenBrowser;

public class LoginIntoSwagLab {

	private static final String ExpectedURL = null;

	public static void main(String[] args) {
		WebDriver driver=GenericWayToOpenBrowser.SetUp("chrome", "https://www.saucedemo.com/");
 
//TODO: validate login page
		
		
		
		//1st identify username input field before we perform any operation in that
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//validate -title & URL
		String expectedURL="https://www.saucedemo.com/inventory.html";
		String actualURL=driver.getCurrentUrl();
		System.out.println("URL validation status: "+actualURL.equals(expectedURL));
			
		String ExpectedHomepage="Swag Labs";
		String ActualHomepage=driver.getTitle();
		System.out.println("HomePage Validation Status: "+ActualHomepage.equals(ExpectedHomepage));
		
		//Driver.close();
		
		
	}

}
/**
Open browser and enter required application URL
validate:
	login page url
enter username as "standard_user"
enter password as "secret_sauce"
click on login button
validate:
	home page url
*/