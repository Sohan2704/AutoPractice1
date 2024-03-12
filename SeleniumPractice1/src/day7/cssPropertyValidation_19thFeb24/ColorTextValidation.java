package day7.cssPropertyValidation_19thFeb24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class ColorTextValidation {

	public static void main(String[] args) {
	WebDriver driver=ReusableFunctions.setUp("chrome", "https://online.actitime.com/tcs/login.do");

	driver.findElement(By.id("loginButton")).click();
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	
	wait.until(ExpectedConditions.presenceOfElementLocated(By.className("errormsg")));
	
	//to avoid stale element execption need to relocate webelement again
	driver.findElement(By.id("loginButton"));
	WebElement errorMeg=driver.findElement(By.className("errormsg"));
	errorMeg.getText();
	
	
	System.out.println("Error Msg Color RGBA Code: "+errorMeg.getCssValue("color"));
	
	System.out.println("Error MSG Font Family : "+errorMeg.getCssValue("font-family"));
	System.out.println("Error MSG Font Size is : "+errorMeg.getCssValue("font-size"));
	
	
	}

}
