package day14.mouseOps_Switching_01stMarch24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class mouseOps_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=ReusableFunctions.setUp("chrome", "https://demo.automationtesting.in/Register.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//Perform Double-Click

Actions act=new Actions(driver);

WebElement firstName=driver.findElement(By.xpath("//input[@Placeholder='First Name']"));
firstName.sendKeys("SOHAN");

//firstName.sendKeys(Keys.chord(Keys.CONTROL,"a"));
act.doubleClick(firstName).build().perform();
firstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));

WebElement lastName=driver.findElement(By.xpath("//input[@Placeholder='Last Name']"));
lastName.sendKeys(Keys.chord(Keys.CONTROL,"v"));

System.out.println("Copied contents using Action class and doubleclick method");
	}

}
