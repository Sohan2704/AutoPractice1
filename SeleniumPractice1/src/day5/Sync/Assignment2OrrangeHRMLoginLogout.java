package day5.Sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import day3.BrowserOpening.GenericWayToOpenBrowser;

public class Assignment2OrrangeHRMLoginLogout {

	public static void main(String[] args) {
WebDriver driver=GenericWayToOpenBrowser.SetUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		//Validate login page
		 //Get Page Title name and Title length //Print Page Title and Title length on the Eclipse Console. 
		  String title=driver.getTitle();
		  System.out.println("Title of the Page is: "+title);
		  System.out.println("Lentgh of the Login Page title is : "+title.length());
		  
		  //Get Page URL and verify if it is a correct Login page opened
		  
		  String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"; 
		  String actualURL=driver.getCurrentUrl();
		  System.out.println("Current URL of Login Page is: "+actualURL);
		  System.out.println("Status of Expected Login Page is Correct or Not is: "+expectedURL.equals(actualURL));
		  
		  //Get Page Source (HTML Source code) and Page Source length String
		  String PageSource=driver.getPageSource();
		  System.out.println("The lentgh of Page Source is: "+PageSource.length());
		  
		  //implic wait
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  //Do Login Steps
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  driver.findElement(By.className("orangehrm-login-button")).click();
		  
		  System.out.println("Login to Ornage HRM successfull");
		  
//Get Page URL and verify if it is a correct Home page opened
		  
		  String expectedUR1L="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"; 
		  String actualURL1=driver.getCurrentUrl();
		  System.out.println("Current URL of Home Page is: "+actualURL1);
		  System.out.println("Status of Expected Home Page is Correct or Not is: "+actualURL1.equals(expectedUR1L));
		  
		  //Get Page Source (HTML Source code) and Page Source length String
		  String PageSource1=driver.getPageSource();
		  System.out.println("The lentgh of Home Page Source is: "+PageSource1.length());
		  
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		  
		  driver.findElement(By.className("oxd-userdropdown-img")).click();
		  
		  System.out.println("Profile Button is Clicked");
		  driver.findElement(By.partialLinkText("Logout")).click();
		  //driver.findElement(By.className("oxd-userdropdown-link")).click();
		  System.out.println("Profile button clicked");
		  System.out.println("Log Out button clicked");
	}

}
