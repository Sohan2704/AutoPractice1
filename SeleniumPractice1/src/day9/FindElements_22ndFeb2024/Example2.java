package day9.FindElements_22ndFeb2024;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver=ReusableFunctions.setUp("chrome","https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//identify all devices present in the page
		List<WebElement> deviceList=driver.findElements(By.cssSelector("#tbodyid>div>div"));
		System.out.println("No of Devices Presnt on Page are: "+deviceList.size());
		 
			//Iterate for each device name and device price
				for(int i=0;i<deviceList.size();i++) {
					WebElement device=deviceList.get(i);
					
					WebElement deviceNameList=device.findElement(By.cssSelector("#tbodyid>div>div>div>h4>a"));
			        String deviceNames=deviceNameList.getText();
			        
			         WebElement devicePriceList=device.findElement(By.cssSelector("#tbodyid>div>div>div>h5"));
			        String DevicePrice=devicePriceList.getText();
			        
			        System.out.println("Name of Device is: "+deviceNames + "  Price of Device is: "+DevicePrice);
			
		}
		
	}

}
/*
get device count
print device name one by one

TODO:
Print device name and price both 

*/