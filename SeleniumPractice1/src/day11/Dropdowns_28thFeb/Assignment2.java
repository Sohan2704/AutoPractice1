package day11.Dropdowns_28thFeb;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// launch redbus
		WebDriver driver=ReusableFunctions.setUp("chrome", "https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("src")).sendKeys("Pune");
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]/div/text")).click();
		driver.findElement(By.id("dest")).sendKeys("Goa");
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]/div/text")).click();
		System.out.println("Source and Destination is entred as  given");
		
		//to select future date
		driver.findElement(By.cssSelector(".labelCalendarContainer")).click();
		//to select next month click on next button
		driver.findElement(By.xpath("//*[@id=\"Layer_1\"]")).click();
		System.out.println("Next Mo nth is displayed");
		//select 11th Date
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[3]/div[3]/span/div[4]/span")).click();
			
System.out.println(" Date is selected");

//Click on Search Button
driver.findElement(By.id("search_button")).click();

//Departure time should be Before 6 AM
driver.findElement(By.xpath("//*[@id=\"filter-block\"]/div/div[2]/ul[2]/li[1]/label[2]")).click();

//to closed ad
driver.findElement(By.cssSelector(".icon.icon-close"));

//Bus type should be AC

WebElement checkBoxAC=driver.findElement(By.xpath("//label[@title='AC']"));
// By Xpath with Contains-----> //label[contains(@class,'cbox-label') and text()='AC']

	System.out.println("Status of AC Checkbox is: "+checkBoxAC.isEnabled());
	
	WebDriverWait wait=new WebDriverWait (driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(checkBoxAC));
	checkBoxAC.click();
	System.out.println("Checkbox selected");

System.out.println("Filters applied and List of Buses is Displayed");
List<WebElement> busList= driver.findElements(By.xpath("//*[@id=\"result-section\"]/div[1]/ul/div/li"));
System.out.println("Total number of Buses are resulted: "+busList.size());

for(int i=0; i<busList.size();i++) {
	System.out.println("The Bus Names are: "+busList.get(i).getText());
	
}

	}

}
/*
Open Redbus.in
From Pune
To Goa
Date in future
Click on search button
Departure time should be after 6am
Bus type “AC”
Get the bus name along with its price
*/