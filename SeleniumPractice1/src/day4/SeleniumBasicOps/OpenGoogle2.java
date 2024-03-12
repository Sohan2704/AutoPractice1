package day4.SeleniumBasicOps;

import org.openqa.selenium.WebDriver;

import day3.BrowserOpening.GenericWayToOpenBrowser;

public class OpenGoogle2 {

	public static void main(String[] args) {
//		//open chrome browser
//		WebDriver driver=new ChromeDriver();
//		//enter google URL
//		driver.get("https://www.google.com");
		
		WebDriver driver=GenericWayToOpenBrowser.SetUp("chrome","https://www.google.com");
		
		//driver1=driver.get(appURL);
		
		//validate -title & URL
				String expectedTitle="Google";
				String actualTitle=driver.getTitle();
				System.out.println("title validation status: "+actualTitle.equals(expectedTitle));
				
				String expectedURL="https://www.google.com/";
				String actualURL=driver.getCurrentUrl();
				System.out.println("URL validation status: "+actualURL.equals(expectedURL));
				
				String pageSource=driver.getPageSource();
				System.out.println("Page source length: "+pageSource.length());
				
				//close browser
				//driver.close();
	}

}

/**
Open chrome browser
enter google url
validate-
	page title
	page url
close the browser
*/