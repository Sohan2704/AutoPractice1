package day10.CSSAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class TC2cricInfo {

	public static void main(String[] args) {
		WebDriver driver=ReusableFunctions.setUp("Chrome", "https://www.espncricinfo.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


		List<WebElement> mainMenus=driver.findElements(By.cssSelector(".ds-bg-fill-navbar>div>div>div>div:nth-of-type(1)>div"));
			
		System.out.println("\nThe Total Number of Main Menu Categories are :  "+mainMenus.size());
		
		System.out.println("\nThe Menu Category Names are : ");
		for(int i=0;i<mainMenus.size();i++) {
			
			String MainMenuText=mainMenus.get(i).getText();
			System.out.println(MainMenuText);
			
			}		
			driver.close();
			System.out.println("\nTest Case 2 Passed and Browser Closed...");

	}

}
