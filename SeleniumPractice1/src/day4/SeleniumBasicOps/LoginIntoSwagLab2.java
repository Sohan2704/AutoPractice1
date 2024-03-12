package day4.SeleniumBasicOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day3.BrowserOpening.GenericWayToOpenBrowser;

public class LoginIntoSwagLab2 {

	public static void main(String[] args) {
		WebDriver driver=GenericWayToOpenBrowser.SetUp("firefox", "https://www.saucedemo.com/");
		 
		//TODO: validate login page	
				
		/*
		 * //1st identify username input field before we perform any operation in that
		 * WebElement username=driver.findElement(By.id("user-name"));
		 * username.sendKeys("standard_user");
		 * 
		 * WebElement password=driver.findElement(By.id("password"));
		 * password.sendKeys("secret_sauce");
		 * 
		 * WebElement login=driver.findElement(By.id("login-button")); login.click();
		 */
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				//validate -title & URL
				String expectedURL="https://www.saucedemo.com/inventory.html";
				String actualURL=driver.getCurrentUrl();
				System.out.println("URL validation status: "+actualURL.equals(expectedURL));
					
				String ExpectedHomepage="Swag Labs";
				String ActualHomepage=driver.getTitle();
				System.out.println("HomePage Validation Status: "+ActualHomepage.equals(ExpectedHomepage));
				
	}

}
