package day6.BrowserOpsValidation_16thFeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectValidation {

	public static void main(String[] args) {
		WebDriver driver=new ReusableFunctions().setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement username=driver.findElement(By.id("username"));
		System.out.println("Is username input field visible? "+username.isDisplayed());
		System.out.println("Is username input field functional/editable or not? "+username.isEnabled());
		System.out.println("Default value of username input field: "+username.getAttribute("value"));
		
		WebElement password=driver.findElement(By.id("password"));
		System.out.println("Is Password input field visible? "+password.isDisplayed());
		System.out.println("Is Password input field functional/editable or not? "+password.isEnabled());
		System.out.println("Default value of Password input field: "+password.getAttribute("value"));
		
		WebElement signIn=driver.findElement(By.className("buttonBlue"));
		System.out.println("Is Signin button visible? "+signIn.isDisplayed());
		System.out.println("Is Signin button functional/editable or not? "+signIn.isEnabled());
		System.out.println("Signin button name? "+signIn.getText());
		
	}

}
/*
Validations:
	username field available or not
	username field is editable or not
	username field default value is "admin" or not
	
	password field available or not
	password field is editable or not
	password field default value is "admin" or not
	
	signin button available or not
	signin button is clickable /functional or not
	signin button name is Signin or not
*/