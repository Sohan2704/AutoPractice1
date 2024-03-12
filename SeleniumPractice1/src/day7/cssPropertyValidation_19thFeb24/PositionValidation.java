package day7.cssPropertyValidation_19thFeb24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class PositionValidation {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=ReusableFunctions.setUp("chrome","https://online.actitime.com/tcs/login.do");
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("errormsg")));
		
		WebElement errorMsg=driver.findElement(By.className("errormsg"));
		System.out.println("Error Msg color RGBA code: "+errorMsg.getCssValue("color"));
		System.out.println("Error Msg Font Family: "+errorMsg.getCssValue("font-family"));
		System.out.println("Error Msg Font size: "+errorMsg.getCssValue("font-size"));
		
		Point errorCord=errorMsg.getLocation();
		int errorCord_X=errorCord.getX();
		int errorCord_Y=errorCord.getY();
		System.out.println("Error msg x cord: "+errorCord_X);
		System.out.println("Error msg y cord: "+errorCord_Y);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		WebElement usernameInputField=driver.findElement(By.id("username"));
		Point userNameCord=usernameInputField.getLocation();
		int userNameCord_X=userNameCord.getX();
		int userNameCord_Y=userNameCord.getY();
		System.out.println("Username input field x cord: "+userNameCord_X);
		System.out.println("Username input field y cord: "+userNameCord_Y);
		
		System.out.println("is error msg displayed above username input field? "+(errorCord_Y<userNameCord_Y));
	}

}
