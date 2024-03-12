package day11.Dropdowns_28thFeb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class multiSelectionDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=ReusableFunctions.setUp("Chrome", "https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//To identify dropdown 
		WebElement skillsDropdown=driver.findElement(By.id("Skills"));
		
		//Create and Instantiate object of Select Class
		Select selectSkills=new Select(skillsDropdown);
		
		// to check Multi select
		System.out.println("Is Skills Dropdown is Multi Select? :"+selectSkills.isMultiple());
		
		//select skills by index, value and visible text
		selectSkills.selectByIndex(2);
		selectSkills.selectByVisibleText("C++");
		selectSkills.selectByValue("Android");
		
		//to check total number of skills in dropdown list
		
		System.out.println("All Selected Skills are : "+selectSkills.getAllSelectedOptions().size());
		
		//to deselect dropdown
		
		/*
		 * selectSkills.deselectByValue("Android");
		 * System.out.println("All Selected Skills are : "+selectSkills.
		 * getAllSelectedOptions());
		 */
		
		
		//to Print all the options from Skills dropdown
		driver.close();
	}

}
