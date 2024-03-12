package day9.FindElements_22ndFeb2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class Example3 {

	public static void main(String[] args) {
		WebDriver driver=ReusableFunctions.setUp("chrome","https://www.google.com/");
		//identify search input field and type selenium
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		//identify all suggestions given by google
		List<WebElement> suggesntionList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>*:first-child>*:first-child>span"));
	System.out.println("Suggestions Count: "+suggesntionList.size());
	for(int i=0;i<suggesntionList.size();i++) {
		suggesntionList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>*:first-child>*:first-child>span"));
		
		WebElement suggestions=suggesntionList.get(i);
		String suggestionText=suggestions.getText();
		System.out.println("Suggestion List is as : "+suggesntionList.get(i).getText());
	
		if(suggestionText.contains("selenium testing")) {
			System.out.println("Selenium Testing text is found and Testcase is Passed");
			suggestions.click();
			break;
		} 
	
	}
	//System.out.println("Selenium text is not found and Testcase is failed");
	driver.close();
	}
}
/*
Open google 
type selenium
check suggestion count is 10 or not
print one by one all suggestion

TODO:
	check in the suggestion "selenium testing" present or not
	if yes then select it and validate same is searched in google or not

*/