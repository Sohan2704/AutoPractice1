package day5.Sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import day3.BrowserOpening.GenericWayToOpenBrowser;

public class Assignment1VtigerLoginLogout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("VTIGER ASSIGNMENT");
		  
		  WebDriver driver=GenericWayToOpenBrowser.SetUp("chrome",
		  "https://demo.vtiger.com/vtigercrm/index.php");
		  
		  WebElement username=driver.findElement(By.id("username")); username.clear();
		  username.sendKeys("admin");
		  
		  WebElement password=driver.findElement(By.id("password")); password.clear();
		  password.sendKeys("admin");
		  
		  driver.findElement(By.className("buttonBlue")).click();
		  
		  //Get Page Title name and Title length //Print Page Title and Title length on the Eclipse Console. 
		  String title=driver.getTitle();
		  System.out.println("Title of the Page is: "+title);
		  System.out.println("Lentgh of the Page title is : "+title.length());
		  
		  //Get Page URL and verify if it is a correct page opened
		  
		  String expectedURL="https://demo.vtiger.com/vtigercrm/index.php"; 
		  
		  Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
		  String actualURL = driver.getCurrentUrl();
		  System.out.println("Current URL of HomePAge is: "+actualURL);
		  System.out.println("Status of Expected Page is Correct or Not is: "
		  +expectedURL.equals(actualURL));
		  
		  //Get Page Source (HTML Source code) and Page Source length String
		  String PageSource=driver.getPageSource();
		  System.out.println("The lentgh of Page Source is: "+PageSource.length());
		  
		  //For Logout
		  
		  wait.until(ExpectedConditions.elementToBeClickable(By.className("userName dropdown-toggle pull-right")));
		  
		  driver.findElement(By.className("userName dropdown-toggle pull-right")).click();
		  driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		  System.out.println("menubar_item_right_LBL_SIGN_OUT");
		  //Close the Browser
		  //driver.close();
		  System.out.println("Browser is Closed and VTiger Assignment is Passed !!!");
		  System.out.println("******************************");
		 
	}

}
