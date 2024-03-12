package day10.CSSAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class TC3gsmArena {

	public static void main(String[] args) {
		WebDriver driver=ReusableFunctions.setUp("Chrome", "https://www.gsmarena.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		List<WebElement> mainMenus=driver.findElements(By.cssSelector(".brandmenu-v2>ul:nth-of-type(1)>li"));
			
			System.out.println("\nThe Total Number of Mobile Company Names are : "+mainMenus.size());
			
			System.out.println("\nThe Mobile Company Names are : ");
			for(int i=0;i<mainMenus.size();i++) {
				
				String MainMenuText=mainMenus.get(i).getText();
				System.out.println(MainMenuText);			
				}			
			driver.close();
			System.out.println("\nTest Case 3 Passed and Browser Closed...");
	}

}
