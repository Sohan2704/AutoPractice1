package day4.SeleniumBasicOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import day3.BrowserOpening.GenericWayToOpenBrowser;

public class Assignment2 {

	public static void main(String[] args) {
		//OrrangeHRM Assignment
		WebDriver driver=GenericWayToOpenBrowser.SetUp("firefox", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//Validate login page
		 //Get Page Title name and Title length //Print Page Title and Title length on the Eclipse Console. 
		  String title=driver.getTitle();
		  System.out.println("Title of the Page is: "+title);
		  System.out.println("Lentgh of the Login Page title is : "+title.length());
		  
		  //Get Page URL and verify if it is a correct page opened
		  
		  String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"; 
		  String actualURL=driver.getCurrentUrl();
		  System.out.println("Current URL of Login Page is: "+actualURL);
		  System.out.println("Status of Expected Login Page is Correct or Not is: "+expectedURL.equals(actualURL));
		  
		  //Get Page Source (HTML Source code) and Page Source length String
		  String PageSource=driver.getPageSource();
		  System.out.println("The lentgh of Page Source is: "+PageSource.length());
		  
		  //Do Login Steps
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  driver.findElement(By.className("orangehrm-login-button")).click();
		  
		  System.out.println("Login to Ornage HRM successfull");
	
	}

}
/**
Assignment2: 
	open a chrome browser
	enter vtiger application url- https://demo.vtiger.com/vtigercrm/index.php
	validation login page open or not
	remove existing text from username field
	type username as 'admin'
	remove existing text from password field
	type password as admin'
	click on login button
	validate home page
Assignment3:
	Open chrome browser
	Enter App url as https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	Validate login page
	Enter user name as Admin
	Password as admin123
	Click on login button
	Validate home page
*/