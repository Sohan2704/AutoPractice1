package day5.Sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import day3.BrowserOpening.GenericWayToOpenBrowser;

public class Assignment3SwagLabLoginLogOut {

	public static void main(String[] args) {
		WebDriver driver=GenericWayToOpenBrowser.SetUp("chrome", "https://www.saucedemo.com/");
		 
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println("Login Successfull");
		
		         String expectedURL="https://www.saucedemo.com/inventory.html";
		         
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				//validate -title & URL
				
				String actualURL=driver.getCurrentUrl();
				System.out.println("URL validation status: "+actualURL.equals(expectedURL));
				System.out.println("Login URL of Swag Labs is: "+actualURL);
					
				String ExpectedHomepage="Swag Labs";
				String ActualHomepage=driver.getTitle();
				System.out.println("HomePage Validation Status: "+ActualHomepage.equals(ExpectedHomepage));
				System.out.println("Title of Homepage is : "+ActualHomepage);
				System.out.println("The Lengh of HOME Page Title is: "+ActualHomepage.length());
				
				String PageSource=driver.getPageSource();
				System.out.println("The Lengh of Page Source is: "+PageSource.length());
				
				//Logout
				driver.findElement(By.id("react-burger-menu-btn")).click();
				driver.findElement(By.partialLinkText("Logout")).click();
				System.out.println("Log out successful");

	}

}
