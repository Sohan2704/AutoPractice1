package day5.Sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import day3.BrowserOpening.GenericWayToOpenBrowser;

public class ActitimeLoginLogout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=GenericWayToOpenBrowser.SetUp("chrome", "https://online.actitime.com/tcs/login.do");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("Test@123");
		driver.findElement(By.id("loginButton")).click();
		
		System.out.println("ACTITTIME LOGIN SUCCESSFUL");
		//Validate HomePage
		
		String expectedHomePageTitle="actiTIME - Enter Time-Track";
		
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		
		String actualHomePageTitle=driver.getTitle();
		System.out.println("Title of Home Page is : "+actualHomePageTitle);
		System.out.println("Is Home Page title MAtched : "+actualHomePageTitle.equals(expectedHomePageTitle));
		
		//wait to logout link
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		driver.findElement(By.id("logoutLink")).click();
		System.out.println("Log out Successfull");
		
	}

}
