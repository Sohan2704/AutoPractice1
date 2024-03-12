package day15.alerts_Windows_04thMarch24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts_Example2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//first switch to the frame as Try it button present inside the frame
				driver.switchTo().frame("iframeResult");
				
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
					
					//get text from alert pop-up
					String msg=driver.switchTo().alert().getText();
					System.out.println(msg);
					
					//accept pop-up
					//driver.switchTo().alert().accept(); for - OK, Yes button
					
					//System.out.println("Alert Accepted");
					
					driver.switchTo().alert().dismiss(); //For Cancel,Close,No
					
					String msg1=driver.findElement(By.id("demo")).getText();
					System.out.println("Message after alert: "+msg1);
	}

}
