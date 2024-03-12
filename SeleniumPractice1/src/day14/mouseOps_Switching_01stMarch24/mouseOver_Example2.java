package day14.mouseOps_Switching_01stMarch24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class mouseOver_Example2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ReusableFunctions.setUp("chrome"," https://demo.automationtesting.in/Register.html");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	      List<WebElement> menuList=driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li"));
	      System.out.println("Main Menu Count  :"+menuList.size());
	      
	      //to mouse hover on first menu
	      Actions act=new Actions(driver);
	      act.moveToElement(menuList.get(1)).perform();
	      
	      //to mouse over on WebTable Link
	      act.moveToElement(menuList.get(2)).perform();
	      
	    //perform hover next menu present right side of WebTable
	      act.moveToElement(menuList.get(2), 200, 0).perform();
	      
	      //To perform mouse over on all menu list
	      for(int i=0;i<menuList.size();i++) {
	    	  Thread.sleep(2000);
	    	  act.moveToElement(menuList.get(i)).perform();
	      }
	     System.out.println("TestCase Passed"); 
	     driver.close();
	}

}
