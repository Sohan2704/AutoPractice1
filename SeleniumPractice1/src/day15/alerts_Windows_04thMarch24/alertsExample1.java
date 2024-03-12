package day15.alerts_Windows_04thMarch24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class alertsExample1 {

	public static void main(String[] args) {
		//WebDriver driver = ReusableFunctions.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//first switch to the frame as Try it button present inside the frame
		driver.switchTo().frame("iframeResult");
		
		
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			
			//get text from alert pop-up
			String msg=driver.switchTo().alert().getText();
			System.out.println(msg);
			
			//accept pop-up
			driver.switchTo().alert().accept();
			
			System.out.println("Alert Accepted");
	}

}
