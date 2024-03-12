package day4.SeleniumBasicOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day3.BrowserOpening.GenericWayToOpenBrowser;

public class Assignment1 {

	public static void main(String[] args) {
		
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
		  
		  String expectedURL="https://demo.vtiger.com/vtigercrm/index.php"; String
		  actualURL=driver.getCurrentUrl();
		  System.out.println("Current URL of HomePAge is: "+actualURL);
		  System.out.println("Status of Expected Page is Correct or Not is: "
		  +expectedURL.equals(actualURL));
		  
		  //Get Page Source (HTML Source code) and Page Source length String
		  String PageSource=driver.getPageSource();
		  System.out.println("The lentgh of PAge Source is: "+PageSource.length());
		  
		  //Close the Browser
		 
		
		  driver.close();
		  System.out.println("Browser is Closed and VTiger Assignment is Passed !!!");
		  System.out.println("******************************");
		 
System.out.println("FACEBOOK ASSIGNMENT");

WebDriver driver1=GenericWayToOpenBrowser.SetUp("chrome", "https://facebook.com/");

driver1.findElement(By.id("email")).sendKeys("vicks2704@gmail.com");
driver1.findElement(By.id("pass")).sendKeys("Siya@2023");
driver1.findElement(By.name("login")).click();
System.out.println("Logged in to Facebook");

//Fetching home page title.
String actualTitle=driver1.getTitle();
System.out.println("Title of Facebook is: "+actualTitle);

//Verify actual title of the home page with the expected title.
String expectedTitle="Facebook";
System.out.println("Actual title Validation of Facebook Home Page is: "+actualTitle.equals(expectedTitle));

driver1.close();
System.out.println("Facebook Assignment Passed");
	}

}

/**
Scenario to Automate:
Launch a new Chrome browser.
Open https://crmaccess.vtiger.com/log-in/?mode=continue
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Get Page Source (HTML Source code) and Page Source length
Close the Browser.

Scenario to Automate:
1. Launch the web browser.
 2. Open the URL?https://www.facebook.com?in the current browser.
 3. Fetching home page title.
 4. Verify actual tile of the home page with the expected title.
 5. Print home page title on the console.
 6. Close the browser.
*/