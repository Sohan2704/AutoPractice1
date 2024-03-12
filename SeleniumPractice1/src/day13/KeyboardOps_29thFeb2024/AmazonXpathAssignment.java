package day13.KeyboardOps_29thFeb2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class AmazonXpathAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=ReusableFunctions.setUp("chrome", "https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Xpath for Made for Amazon checkbox using Parent Child
		
		driver.findElement(By.xpath("//li[span[a[div[label[i[@class='a-icon a-icon-checkbox']]]]]]/span/a/span[text()='Made for Amazon']")).click();
		System.out.println("Made for Amazon checkbox is Selected");
		
		driver.navigate().back();
		
		//Xpath for Prime check box 
		driver.findElement(By.xpath("//li[span[a[div[label[i[@class='a-icon a-icon-checkbox']]]]]]/span/a/i")).click();
		
		System.out.println("PRIME checkbox is Selected");
		driver.navigate().back();
		
		//Xpath for Get it by Tomorrow checkbox
		
		driver.findElement(By.xpath("//li[span[a[div[label[i[@class='a-icon a-icon-checkbox']]]]]]/span/a/span[text()='Get It by Tomorrow']")).click();
		System.out.println("Get it by Tomorroe Check box is selected");
		driver.navigate().back();
		
		//xpath for Eligible for Pay On Delivery checkbox
		
		driver.findElement(By.xpath("//li[span[a[div[label[i[@class='a-icon a-icon-checkbox']]]]]]/span/a/span[text()='Eligible for Pay On Delivery']")).click();
		System.out.println("Eligible for Pay On Delivery checkbox is Selected");
		
		driver.navigate().back();
		System.out.println("Test Case Passed");
		driver.close();
		

	}

}
