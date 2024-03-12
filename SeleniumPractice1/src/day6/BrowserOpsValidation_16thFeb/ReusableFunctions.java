package day6.BrowserOpsValidation_16thFeb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReusableFunctions {

	
		public static WebDriver setUp(String browserName,String appUrl) {
			WebDriver driver=null;
			if (browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//maximize browser window
			driver.manage().window().maximize();
			driver.get(appUrl);
			return driver;
	}

		public static Properties getPropertyFileInstance(String string) throws IOException {
			// TODO Auto-generated method stub
			ReusableFunctions.setUp("Chrome", "https://online.actitime.com/tcs/login.do");
			FileInputStream fis=new FileInputStream(".\\testData\\testData.properties");
			Properties prop=new Properties();
			prop.load(fis);
			return prop;
		}

}
