package SelPractice1_24thFeb2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericBrowserOpening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=setUp("chrome", "https://www.google.co.in/");
	      //To MAximize Window
		driver.manage().window().maximize();
		

	}
	public static WebDriver setUp(String BrowserName, String appUrl) {
		
		WebDriver driver=null;
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			System.out.println("We are using Chrome Browser");
		}
		else if(BrowserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			System.out.println("We are using Firefox Browser");
		}
		else if(BrowserName.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
			System.out.println("We are using Edge Browser");
		}
		driver.get(appUrl);;
		return driver;
		
	}

}
