package day10.CSSAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class TC1flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=ReusableFunctions.setUp("Chrome", "https://www.flipkart.com/?affid=admitad&affExtParam1=1560786&affExtParam2=acdb05b36a50f2e639c54675a26a54a5");
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


List<WebElement> mainMenus=driver.findElements(By.cssSelector(".yAlKeh > div._2L0uxW > div > div:nth-child(1) > div > div > div > div > div._3sdu8W.emupdz>._1ch8e_"));
	
	System.out.println("\nThe Total Number of Main Menu Categories are :  "+mainMenus.size());
	
	System.out.println("\nThe Menu Category Names are :");
	for(int i=0;i<mainMenus.size();i++) {
		
		String MainMenuText=mainMenus.get(i).getText();
		System.out.println(MainMenuText);
		
	}
	
	driver.close();
	System.out.println("\n Test Case 1 Passed and Browser Closed...");
	}

}
