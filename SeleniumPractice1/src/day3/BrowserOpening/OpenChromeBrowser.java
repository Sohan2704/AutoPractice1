package day3.BrowserOpening;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		
		//WebDriverDecorator driver1=new WebDriverDecorator();
		ChromeDriver driver=new ChromeDriver();
		System.out.println("ChromeBrowser Launched");
	}

}
