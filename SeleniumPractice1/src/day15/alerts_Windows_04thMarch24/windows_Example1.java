package day15.alerts_Windows_04thMarch24;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class windows_Example1 {

	public static void main(String[] args) {
		WebDriver driver=ReusableFunctions.setUp("chrome", "https://etrain.info/in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//get current window id
		String currentWindowId=driver.getWindowHandle();
		System.out.println("Current Window Id is: "+currentWindowId);
		
		//Click on linkedln logo
		WebElement linkedinLogo=driver.findElement(By.xpath("//i[@class='icon-linkedin']"));
		linkedinLogo.click();
		System.out.println("Link is opened in new Tab");
		
		//get all window ids opened by WebDriver instance
		Set<String> allWindowIds=driver.getWindowHandles();
		
		//remove current window id so that you will get child window id
		allWindowIds.remove(currentWindowId);
		
		//Iterator interface to iterate all windows
		Iterator<String> itr=allWindowIds.iterator();
		String childwindow=itr.next();
		
		//move to child window
		
		driver.switchTo().window(childwindow);
		
		//get Title
        System.out.println("The URL after Clicked on Linkedil logo is: "+driver.getTitle());
        
        //Close current window
        driver.close();
        
      //to come back to home page
        driver.switchTo().window(currentWindowId);
        
        System.out.println("Current Window Title is : "+driver.getTitle());
        
        //to close all windows instance
        driver.quit();

		
		
	}

}
/*
Open browser and enter  etrain url
click linkedin logo present in connect with us section
get the title and print it
come back to home page print title 
 */