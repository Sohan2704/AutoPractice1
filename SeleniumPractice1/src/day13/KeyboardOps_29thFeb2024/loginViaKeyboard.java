package day13.KeyboardOps_29thFeb2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class loginViaKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=ReusableFunctions.setUp("chrome", "https://online.actitime.com/tcs/login.do");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      
   WebElement userNameInput=driver.findElement(By.id("username"));
   userNameInput.sendKeys("admin01");
   userNameInput.sendKeys((Keys.chord(Keys.CONTROL,"a")));
   userNameInput.sendKeys(Keys.chord(Keys.CONTROL,"c"));
   
   WebElement passwordInput=driver.findElement(By.name("pwd"));
   passwordInput.sendKeys(Keys.chord(Keys.CONTROL,"v"));
   passwordInput.sendKeys(Keys.ENTER);
  
   System.out.println("Logged in without typing with Keyboard"); 
    
	}
}
/*
Open Actitime application 
type user name as admin01
copy user name and paste in password field
press enter key to login
*/