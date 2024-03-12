package day4.SeleniumBasicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenGoogle {

	public static void main(String[] args) {
		//open chrome browser
		WebDriver driver=new ChromeDriver();
		
		//enter google URL
		driver.get("https://www.google.com");
		
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
