package day14.mouseOps_Switching_01stMarch24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v116.domstorage.model.Item;
import org.openqa.selenium.interactions.Actions;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class DescndingORderDraggable_Assignment1 {

	public static void main(String[] args) {
WebDriver driver = ReusableFunctions.setUp("chrome", "https://jqueryui.com/sortable/");
		
		//switching to required frame 
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		List<WebElement> Items=driver.findElements(By.xpath("//ul[@class='ui-sortable']/li"));
		System.out.println("The Total no of Items are: "+Items.size());
		
		for(int i=1;i<Items.size();i++)
			
		{
			WebElement element=driver.findElement(By.xpath("((//ul[@class='ui-sortable']/li)["+i+"])"));
			
			//all Destination Locations
			WebElement destination1=driver.findElement(By.xpath("((//ul[@class='ui-sortable']/li)[1])"));
			WebElement destination2=driver.findElement(By.xpath("((//ul[@class='ui-sortable']/li)[2])"));
			WebElement destination3=driver.findElement(By.xpath("((//ul[@class='ui-sortable']/li)[3])"));
			WebElement destination4=driver.findElement(By.xpath("((//ul[@class='ui-sortable']/li)[4])"));
			WebElement destination5=driver.findElement(By.xpath("((//ul[@class='ui-sortable']/li)[5])"));
			WebElement destination6=driver.findElement(By.xpath("((//ul[@class='ui-sortable']/li)[6])"));
			WebElement destination7=driver.findElement(By.xpath("((//ul[@class='ui-sortable']/li)[7])"));
			
			Actions act=new Actions(driver);
			
			if(element!=null) {
				act.dragAndDrop(destination7, element).build().perform();
				act.dragAndDrop(destination6, element).build().perform();
				act.dragAndDrop(destination5, element).build().perform();
				act.dragAndDrop(destination4, element).build().perform();
				act.dragAndDrop(destination3, element).build().perform();
				act.dragAndDrop(destination2, element).build().perform();
				act.dragAndDrop(destination1, element).build().perform();
				
				break;
			}
		}
		System.out.println("All Items arranged in Descneding Order");
		driver.close();
	}

}
/*
 * place the item from 1 to 7 ---> 7 to 1
 * 
 */