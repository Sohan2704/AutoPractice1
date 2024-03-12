package day6.BrowserOpsValidation_16thFeb;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2 {

	public static void main(String[] args) {
		WebDriver driver = new ReusableFunctions().setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// maximize browser window
		driver.manage().window().maximize();
		System.out.println("Window Maximized");
		
//Set browser window size
		driver.manage().window().setSize(new Dimension(400, 600));
		System.out.println("Set Window Size");

//minimize browser window
		driver.manage().window().minimize();
		System.out.println("Window Minimized");

////maximize browser window
		driver.manage().window().maximize();

//click on Login Button
		driver.findElement(By.className("orangehrm-login-button")).click();

//come back to previous page
		driver.navigate().back();
		System.out.println("Load Previous Page");

//again goto next page
		driver.navigate().forward();
		System.out.println("Load Login Page");

//reload application
		driver.navigate().refresh();
		System.out.println("RELOAD Login Page");

//if you want to move to another URL
		driver.navigate().to("https://www.google.com");

//come back to previous page
		driver.navigate().back();
		System.out.println("Come Back Again to Login Page");

		// Object Validations
		WebElement username = driver.findElement(By.name("username"));
		System.out.println("Is username input field visible? " + username.isDisplayed());
		System.out.println("Is username input field functional/editable or not? " + username.isEnabled());
		System.out.println("Default value of username input field: " + username.getAttribute("value"));

		WebElement password = driver.findElement(By.name("password"));
		System.out.println("Is Password input field visible? " + password.isDisplayed());
		System.out.println("Is Password input field functional/editable or not? " + password.isEnabled());
		System.out.println("Default value of Password input field: " + password.getAttribute("value"));

		WebElement login = driver.findElement(By.className("orangehrm-login-button"));
		System.out.println("Is Login button visible? " + login.isDisplayed());
		System.out.println("Is Login button functional/editable or not? " + login.isEnabled());
		System.out.println("Login button name? " + login.getText());

		System.out.println(" TC2 is Passed !!!");

	}

}
