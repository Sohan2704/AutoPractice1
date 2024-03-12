package day14.mouseOps_Switching_01stMarch24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class Switching_Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ReusableFunctions.setUp("chrome", "https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement autoCompleteLink=driver.findElement(By.xpath("//a[text()='Autocomplete']"));
			autoCompleteLink.click();
			Thread.sleep(4000);
			//Switch to Frame
			//driver.switchTo().frame("frame");	
		//	or
		    driver.switchTo().frame(0);
		    
			//type as Ja in Autocomplete Tag
			driver.findElement(By.xpath("//input[@class='ui-autocomplete-input']")).sendKeys("Ja",Keys.ARROW_DOWN,Keys.ENTER);
			//to perform operation on element present in main page, then switch your control back to main page
			driver.switchTo().defaultContent();
			
			//to Click on JQuery Logo
			driver.findElement(By.xpath("//h2[a[@title='jQuery UI']]")).click();
			
			System.out.println("TestCase Passed");
		
	}
	}
/**
Open any browser and enter https://jqueryui.com/
click on Autocomplete
type Ja and select 1st suggestion
click on JQueryUI logo.
*/