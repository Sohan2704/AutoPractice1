package day14.mouseOps_Switching_01stMarch24;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class Switching_Example1 {

	public static void main(String[] args) {
		
WebDriver driver = ReusableFunctions.setUp("chrome", "https://demowebshop.tricentis.com/login");
		
		//identify the element where mouse is blinking/focusing
         WebElement actElement=driver.switchTo().activeElement();
         System.out.println("Cursor is blinking in current active Element: "+actElement.getText());
         
         //get attribute and verify active element is correct or not
         String actElementValue=actElement.getAttribute("name");
         System.out.println("Is username input field having focus? "+actElementValue.equals("Email"));
         
       //login without identifying any element
         actElement.sendKeys("tester01@vomoto.com",Keys.TAB);
         driver.switchTo().activeElement().sendKeys("Abc@12345",Keys.ENTER);
         System.out.println("Logged in without locating any elements");
	}
	}
/**
validate mouse focus is on username field or not

login without identifying any element

*/