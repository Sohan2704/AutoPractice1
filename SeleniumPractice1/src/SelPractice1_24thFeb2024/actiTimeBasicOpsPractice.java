package SelPractice1_24thFeb2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class actiTimeBasicOpsPractice {

	public static void main(String[] args) {

		WebDriver driver=GenericBrowserOpening.setUp("chrome", "https://online.actitime.com/tcs/login.do");
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      
	      WebElement userName=driver.findElement(By.name("username"));
	    		  userName.sendKeys("admin");
	      WebElement passWord=driver.findElement(By.name("pwd"));
	      passWord.sendKeys("Test@123");
	      
	      WebElement loginBtn=driver.findElement(By.id("loginButton"));
	      loginBtn.click();
	      
	      System.out.println("Logged in successfully");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      
	      String currentHomePageTitle=driver.getTitle();
	      System.out.println("Title of Home Page is: "+currentHomePageTitle);
	      String expectHomePAgeTitle="actiTIME - Login";
	      System.out.println("Status of HomePage title is Matched or not ?: "+expectHomePAgeTitle.equals(currentHomePageTitle));
	      
	      String currentHomePageUrl=driver.getCurrentUrl();
	      System.out.println("URL of Home Page is: "+currentHomePageUrl);
	      String expectedHomePageURL="https://online.actitime.com/tcs/login.do";
	      System.out.println("Status of Home Page URL is Matched or Not? "+expectedHomePageURL.equals(currentHomePageUrl));

	      //to Logout
	      driver.findElement(By.id("logoutLink")).click();
	      System.out.println("Logged out Successfully");
	      
	      driver.close();
	      System.out.println("Browser Closed and TC Passed");
	}
}
