package day15.alerts_Windows_04thMarch24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class alerts_Example3 {

	public static void main(String[] args) {
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//first switch to the frame as Try it button present inside the frame
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//get text from alert pop-up
		String mesg=driver.switchTo().alert().getText();
		System.out.println("Message on Alert is: "+mesg);
		
		//type text in pop-up
		driver.switchTo().alert().sendKeys("Pune");
		
		//accept pop-up
		//driver.switchTo().alert().accept();//for - OK, Yes button
				
	    driver.switchTo().alert().dismiss();// for - Cancel, Close, No
				
				String msg=driver.findElement(By.id("demo")).getText();
				System.out.println("Message after alert: "+msg);
	}

}
