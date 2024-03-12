package day5.Sync;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import day3.BrowserOpening.GenericWayToOpenBrowser;

public class ActitimeLoginLogout2 {

	
		public static void main(String[] args) {
			WebDriver driver=GenericWayToOpenBrowser.SetUp("chrome", "https://online.actitime.com/tcs/login.do");
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("Test@123");
			driver.findElement(By.id("loginButton")).click();
			//explicit wait-WebDriverWait
			String expectedHomePageTitle="actiTIME - Enter Time-Track";
			
//			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
					//or
			Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(20))    //max time to wait
					.pollingEvery(Duration.ofSeconds(5))  //retry time  
					.ignoring(NoSuchElementException.class);  //exception to ignore
			
			wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
			//validate home page		
			String actualHomePageTitle=driver.getTitle();
			System.out.println("Actual Home page title: "+actualHomePageTitle);
			System.out.println("Is home page title matched? "+expectedHomePageTitle.equals(actualHomePageTitle));
			//wait to logout link
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Log out suceesfull");
			
	}

}
