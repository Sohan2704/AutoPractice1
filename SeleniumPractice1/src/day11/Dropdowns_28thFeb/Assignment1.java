package day11.Dropdowns_28thFeb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=ReusableFunctions.setUp("chrome", "https://www.saucedemo.com/");
		
		String login_UserNames= driver.findElement(By.id("login_credentials")).getText();
		String[] userNamesList=login_UserNames.split("\n");
		
		String login_Password=driver.findElement(By.className("login_password")).getText();
		String[] passwordList=login_Password.split("\n");
		
		for(int i=1;i<userNamesList.length;i++)
		{
			System.out.println("User Used for Login : "+userNamesList[i]);
			
			driver.findElement(By.id("user-name")).sendKeys(userNamesList[i]);
			
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys(passwordList[1]);
			
		driver.findElement(By.id("login-button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		if(driver.getCurrentUrl().contains("/inventory.html")) 
		{
			driver.findElement(By.id("react-burger-menu-btn")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			
		}
		else {
			driver.findElement(By.id("user-name")).clear();
			driver.findElement(By.id("password")).clear();
			
		} 
		
		}
		
		System.out.println("Testcase Passed");

	}
	
}

/*
open browser 
read url from property file(https://www.saucedemo.com/)
read username from screen(one by one)
read password from screen
click on login button
*/