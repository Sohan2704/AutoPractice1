package day6.BrowserOpsValidation_16thFeb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
public class TC1 {

	public static void main(String[] args) {
		WebDriver driver=new ReusableFunctions().setUp("chrome", "https://online.actitime.com/tcs/login.do");
		
		//maximize browser window
				driver.manage().window().maximize();
				System.out.println("Window Maximized");
				//Set browser window size
				driver.manage().window().setSize(new Dimension(400,600));
				System.out.println("Set Window Size");
				
				//minimize browser window
				driver.manage().window().minimize();
				System.out.println("Window Minimized");
				
				////maximize browser window
				driver.manage().window().maximize();
				
				//click on Login Button
				driver.findElement(By.id("loginButton")).click();
				
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
				
				//Object Validations 
				WebElement username=driver.findElement(By.id("username"));
				System.out.println("Is username input field visible? "+username.isDisplayed());
				System.out.println("Is username input field functional/editable or not? "+username.isEnabled());
				System.out.println("Default value of username input field: "+username.getAttribute("value"));
				
				WebElement password=driver.findElement(By.name("pwd"));
				System.out.println("Is Password input field visible? "+password.isDisplayed());
				System.out.println("Is Password input field functional/editable or not? "+password.isEnabled());
				System.out.println("Default value of Password input field: "+password.getAttribute("value"));
				
				WebElement login=driver.findElement(By.id("loginButton"));
				System.out.println("Is Login button visible? "+login.isDisplayed());
				System.out.println("Is Login button functional/editable or not? "+login.isEnabled());
				System.out.println("Login button name? "+login.getText());
				
				
				
				//Keep ME Logged in Check Box
				WebElement chBox=driver.findElement(By.id("keepLoggedInCheckBox"));
				System.out.println("Is CheckBox visible? "+chBox.isDisplayed());
				System.out.println("Is CheckBox functional/editable or not? "+chBox.isEnabled());
				System.out.println("CheckBox name? "+chBox.getText());
				chBox.click();
				System.out.println("Checkbox is Clicked and TC1 is Passed !!!");
				
				//Implicit wait
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//Explicit wait
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
				
				//to Login
				username.sendKeys("admin");
				password.sendKeys("Test@123");
				login.click();
				System.out.println("Logged in Again");
				
				//to Logout
			     //driver.findElement(By.className("logoutLink"));
				
				//FleuntWait
				/*
				 * //Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
				 * .withTimeout(Duration.ofSeconds(20)) .pollingEvery(Duration.ofSeconds(5))
				 * .ignoring(NoSuchElementException.class);
				 */
				
			WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));
			
				WebElement logoutBtn=driver.findElement(By.className("logout"));
				logoutBtn.click();
				
			      System.out.println("Logged out Successfully");
			      
			      driver.close();
			      System.out.println("Browser Closed and TC1 Passed");
				
	}

}
