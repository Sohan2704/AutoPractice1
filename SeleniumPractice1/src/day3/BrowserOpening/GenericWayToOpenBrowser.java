package day3.BrowserOpening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=SetUp("chrome","https://www.google.com");
	}
public static WebDriver SetUp(String browserName, String appURL) {
	WebDriver driver=null;
	
	if(browserName.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
		System.out.println("Chrome Browser Launched");
	}else if(browserName.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();

		System.out.println("Firefox Browser Launched");
	}else if(browserName.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
		System.out.println("Edge Browser Launched");
	}
	driver.get(appURL);
	driver.close();
	return driver;
	
}

}
