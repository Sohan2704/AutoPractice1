package day11.Dropdowns_28thFeb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class BootstrapDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = ReusableFunctions.setUp("chrome", "https://thompsonsj.com/bootstrap-select-dropdown/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Identify List of countires dropdown
		List<WebElement> dropdowns = driver.findElements(By.cssSelector("button[id$='-button']"));
		dropdowns.get(0).click();
		
		List<WebElement> countries=driver.findElements(By.cssSelector(".dropdown-menu.show>div>a"));
		System.out.println("country count: "+countries.size());
		
		System.out.println("The Countries listed in dropdown are: ");
		for(int i=0;i<countries.size();i++) {
			System.out.println(countries.get(i).getText());
		}
			//to select 5th country from list
			countries.get(5).click();
		
			driver.close();
			
		}
		
		
	}


