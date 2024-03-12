package day14.mouseOps_Switching_01stMarch24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class dragAndDrop_Example3 {

	public static void main(String[] args) {
		
		WebDriver driver=ReusableFunctions.setUp("chrome", "https://www.globalsqa.com/demo-site/draganddrop");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//switching to required frame 
				driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame.lazyloaded")));
		Actions act=new Actions(driver);
	
		List<WebElement> srcList=driver.findElements(By.xpath("//ul[@id='gallery']/li/img"));
		WebElement target=driver.findElement(By.id("trash"));
		
		//act.dragAndDrop(srcList.get(0), target).build().perform();
		for(WebElement element:srcList) {
			act.dragAndDrop(element, target).build().perform();
			
		}
		System.out.println("Drag and Drop Demo");
		driver.close();
	}

}
