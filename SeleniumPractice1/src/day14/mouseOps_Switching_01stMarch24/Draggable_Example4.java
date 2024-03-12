package day14.mouseOps_Switching_01stMarch24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class Draggable_Example4 {

	public static void main(String[] args) {

WebDriver driver=ReusableFunctions.setUp("chrome", "https://jqueryui.com/draggable/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));

Actions act=new Actions(driver);

WebElement src=driver.findElement(By.id("draggable"));

act.dragAndDropBy(src, 200, 100).build().perform();
	
System.out.println("Program Ends");
driver.close();
	}
}
