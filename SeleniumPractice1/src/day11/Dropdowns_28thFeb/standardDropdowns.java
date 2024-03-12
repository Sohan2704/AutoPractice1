package day11.Dropdowns_28thFeb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class standardDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=ReusableFunctions.setUp("Chrome", "https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//To identify dropdown 
	WebElement skillsDropdown=driver.findElement(By.id("Skills"));
	
	//Create and Instantiate object of Select Class
	Select skillsDropdownOptions=new Select(skillsDropdown);
	
	System.out.println("Skills dropdown is displayed or not? "+skillsDropdown.isDisplayed());
	System.out.println("Skills dropdown is Enabled or not?  "+skillsDropdown.isEnabled());
	System.out.println("Skills Dropdown is Selecte dor not? "+skillsDropdown.isSelected());
	
	System.out.println("is Skills dropdown list is multiselect? "+skillsDropdownOptions.isMultiple());
	
	List<WebElement> Skillslist=skillsDropdownOptions.getOptions();
	System.out.println("Total Number of Options are available in Dropdown : "+Skillslist.size());
	
	//get default selected value or changed value from dropdown
	System.out.println("Default selected dropdown options is : "+skillsDropdownOptions.getFirstSelectedOption().getText());
	
	//to Select any value or change value from dropdown by using Index
	skillsDropdownOptions.selectByIndex(1);
	System.out.println("User selected dropdown options using By index : "+skillsDropdownOptions.getFirstSelectedOption().getText());
	
	//to Select any value or change value from dropdown by using Value
		skillsDropdownOptions.selectByValue("Documentation");
		System.out.println("User selected dropdown options using By Value : "+skillsDropdownOptions.getFirstSelectedOption().getText());
		
	//to Select any value or change value from dropdown by using Visible Text
		skillsDropdownOptions.selectByVisibleText("Engineering");
		System.out.println("User selected dropdown options using By Visible Text : "+skillsDropdownOptions.getFirstSelectedOption().getText());
		
	  //
		System.out.println("**************Print all options from skill dropdown***************************");
//		for(WebElement element: Skillslist) {
//			System.err.println(element.getText());
//		}
					//or
		String expectedSkills="Select Skills,Adobe InDesign,Adobe Photoshop,Analytics,Android,APIs,Art Design,AutoCAD,Backup Management,C,C++,Certifications,Client Server,Client Support,Configuration,Content Managment,Content Management Systems (CMS),Corel Draw,Corel Word Perfect,CSS,Data Analytics,Desktop Publishing,Design,Diagnostics,Documentation,End User Support,Email,Engineering,Excel,FileMaker Pro,Fortran,HTML,Implementation,Installation,Internet,iOS,iPhone,Linux,Java,Javascript,Mac,Matlab,Maya,Microsoft Excel,Microsoft Office,Microsoft Outlook,Microsoft Publisher,Microsoft Word,Microsoft Visual,Mobile,MySQL,Networks,Open Source Software,Oracle,Perl,PHP,Presentations,Processing,Programming,PT Modeler,Python,QuickBooks,Ruby,Shade,Software,Spreadsheet,SQL,Support,Systems Administration,Tech Support,Troubleshooting,Unix,UI / UX,Web Page Design,Windows,Word Processing,XML,XHTML";
		String actualSkills="";
		for(int i=0;i<Skillslist.size();i++) {
			if(i!=Skillslist.size()-1) {
				actualSkills=actualSkills+Skillslist.get(i).getText()+",";
			}else {
				actualSkills=actualSkills+Skillslist.get(i).getText();
			}
		}
		System.out.println("Expected Skills\n"+expectedSkills);
		System.out.println("Actual Skills\n"+actualSkills);
		
		System.out.println("Skill comparision: "+actualSkills.equals(expectedSkills));
	}

}
