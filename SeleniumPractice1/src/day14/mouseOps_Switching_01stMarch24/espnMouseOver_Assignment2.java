package day14.mouseOps_Switching_01stMarch24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class espnMouseOver_Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://www.espncricinfo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	List<WebElement> menuList=driver.findElements(By.xpath("//div[@class='ds-flex ds-items-center ds-justify-between ds-flex-1']/div/div"));
	System.out.println("Total number of Menus on Home Page: "+menuList.size());
		Actions act=new Actions(driver);
		for(int i=0;i<menuList.size();i++) {
			
			Thread.sleep(5000);
			act.moveToElement(menuList.get(i));
			
		}
		System.out.println("Mouse Over performed on Menus");
		driver.close();
	}
}
/*
 * perform mouse hover in main menu
 * 
 */