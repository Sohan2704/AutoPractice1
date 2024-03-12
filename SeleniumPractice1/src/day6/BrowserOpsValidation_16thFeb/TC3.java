package day6.BrowserOpsValidation_16thFeb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC3 {

	public static void main(String[] args) {
		WebDriver driver = new ReusableFunctions().setUp("chrome", "https://demo.automationtesting.in/Register.html");

//maximize browser window
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

//click on Home Button
		driver.findElement(By.linkText("Home")).click();
		System.out.println("Clicked on Home Page Tab");

//come back to previous page
		driver.navigate().back();
		System.out.println("Load Previous Page");

//again goto next page
		driver.navigate().forward();
		System.out.println("Load Registration Page");

//reload application
		driver.navigate().refresh();
		System.out.println("RELOAD Registration Page");

//if you want to move to another URL
		driver.navigate().to("https://www.google.com");

//come back to previous page
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		System.out.println("Come Back Again to Registration Page");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Object Validations
		WebElement FirstName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		System.out.println("Is First Name input field visible? " + FirstName.isDisplayed());
		System.out.println("Is First Name input field functional/editable or not? " + FirstName.isEnabled());
		System.out.println("Default value of First Name input field: " + FirstName.getAttribute("value"));

		WebElement password = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		System.out.println("Is Last Name input field visible? " + password.isDisplayed());
		System.out.println("Is Last  Name input field functional/editable or not? " + password.isEnabled());
		System.out.println("Default value of Last Name input field: " + password.getAttribute("value"));

		WebElement MaleRadioBtn = driver.findElement(By.cssSelector("input[value='Male']"));
		System.out.println("Is Male radio button visible? " + MaleRadioBtn.isDisplayed());
		System.out.println("Is Male radio button functional/editable or not? " + MaleRadioBtn.isEnabled());
		System.out.println("Button name? " + MaleRadioBtn.getAttribute("value"));
		MaleRadioBtn.click();
		System.out.println("Male Radio Button is Selected");

		WebElement MoviesChBox = driver.findElement(By.id("checkbox2"));
		System.out.println("Is Movies CheckBox visible? " + MoviesChBox.isDisplayed());
		System.out.println("Is Movies CheckBox functional/editable or not? " + MoviesChBox.isEnabled());
		System.out.println("CheckBox name? " + MoviesChBox.getAttribute("value"));
		MoviesChBox.click();
		System.out.println("Movies CheckBox is Selected");

		System.out.println(" TC3 is Passed !!!");
         driver.close();
	}

}

/*
 * 
 * TC3:https://demo.automationtesting.in/Register.html validation on FirstName
 * ---> visible/functional/default value LastName --->
 * visible/functional/default value Male radio button --->
 * visible/functional/default selection/select and again check Submit button--->
 * visible/functional/default name
 */
