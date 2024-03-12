package day7.cssPropertyValidation_19thFeb24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class ColorTextValidation2 {

	public static void main(String[] args) {
		WebDriver driver=ReusableFunctions.setUp("chrome","https://www.w3schools.com/colors/colors_converter.asp");
	
	WebElement signUpButton=driver.findElement(By.className("tnb-signup-btn"));
	
	System.out.println("signUpButton text color RGBA code: "+signUpButton.getCssValue("color"));
	System.out.println("signUpButton color RGBA code: "+signUpButton.getCssValue("background-color"));
	System.out.println("signUpButton Font Family: "+signUpButton.getCssValue("font-family"));
	System.out.println("signUpButton Font size: "+signUpButton.getCssValue("font-size"));
	
	driver.getClass();
	}

}
