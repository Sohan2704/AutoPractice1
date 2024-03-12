package day10.CSSAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class TC5Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=ReusableFunctions.setUp("Chrome", "https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.cssSelector("div>a[id*='u_0_0_']")).click();
		Thread.sleep(10000);
          
		System.out.println("Create Account Pop up displayed");
		WebElement dayDropDown=driver.findElement(By.cssSelector("#day"));
		Select dayDropDowns= new Select(dayDropDown);
		
		System.out.println("The Day Drop Down is Visible or not? "+dayDropDown.isDisplayed());
		
		System.out.println("The Day Drop Down is Enabled or not? "+dayDropDown.isEnabled());
		
		System.out.println("The Day Drop Down is Multi Select or not? "+dayDropDowns.isMultiple());
         
		// to get options and count
		
		List<WebElement> daysList=dayDropDowns.getOptions();
		
		System.out.println("Total Number of Options are available in Day Dropdown : "+daysList.size());
		
		//To Print all the options from dropdown list
		System.out.println("The List of all dropdown options for day is: ");
		for(int i=0;i<daysList.size();i++) {
			System.out.println(daysList.get(i).getText());
		}
		//to get default or already Selected Value
		System.out.println("The Default selected value in Day Dropdown is: "+dayDropDowns.getFirstSelectedOption().getText());

		// to select value or change the dropdown value by index
		dayDropDowns.selectByIndex(2);
		System.out.println("The Selected value by Index in Day Dropdown is: "+dayDropDowns.getFirstSelectedOption().getText());

		// to select value or change the dropdown value by value
		dayDropDowns.selectByValue("11");
		System.out.println("The Selected value by Value in Day Dropdown is: "+dayDropDowns.getFirstSelectedOption().getText());

		// to select value or change the dropdown value by Visible Text 
		
		dayDropDowns.selectByVisibleText("31");
		System.out.println("The Selected value by Visible Text in Day Dropdown is: "+dayDropDowns.getFirstSelectedOption().getText());

		//MONTH DROPDOWN
	System.out.println("************Validation of Month Dropdown***********************");	
	
		WebElement monthDropDown=driver.findElement(By.cssSelector("#month"));
		Select selectMonth= new Select(monthDropDown);
		
		System.out.println("The Month Drop Down is Visible or not? "+monthDropDown.isDisplayed());
		
		System.out.println("The Month Drop Down is Enabled or not? "+monthDropDown.isEnabled());
		
		System.out.println("The Month Drop Down is Multi Select or not? "+selectMonth.isMultiple());
         
		// to get options and count
		
		List<WebElement> monthsList=selectMonth.getOptions();
		
		System.out.println("Total Number of Options are available in Month Dropdown : "+monthsList.size());
		
		//To Print all the options from dropdown list
		System.out.println("The List of all dropdown options for Month is: ");
		for(int j=0;j<monthsList.size();j++) {
			System.out.println(monthsList.get(j).getText());
		}
		//to get default or already Selected Value
		System.out.println("The Default selected value in Month Dropdown is: "+selectMonth.getFirstSelectedOption().getText());

		// to select value or change the dropdown value by index
		selectMonth.selectByIndex(2);
		System.out.println("The Selected value by Index in Month Dropdown is: "+selectMonth.getFirstSelectedOption().getText());

		// to select value or change the dropdown value by value
		selectMonth.selectByValue("4");
		System.out.println("The Selected value by Value in Month Dropdown is: "+selectMonth.getFirstSelectedOption().getText());

		// to select value or change the dropdown value by Visible Text 
		
		selectMonth.selectByVisibleText("May");
		System.out.println("The Selected value by Visible Text in Month Dropdown is: "+selectMonth.getFirstSelectedOption().getText());

		//YEAR DROPDOWN
		System.out.println("************Validation of Year Dropdown***********************");	
		
			WebElement yearDropDown=driver.findElement(By.cssSelector("#year"));
			Select selectYear= new Select(yearDropDown);
			
			System.out.println("The Year Drop Down is Visible or not? "+yearDropDown.isDisplayed());
			
			System.out.println("The Year Drop Down is Enabled or not? "+yearDropDown.isEnabled());
			
			System.out.println("The Year Drop Down is Multi Select or not? "+selectYear.isMultiple());
	         
			// to get options and count
			
			List<WebElement> yearsList=selectYear.getOptions();
			
			System.out.println("Total Number of Options are available in Year Dropdown : "+yearsList.size());
			
			//To Print all the options from dropdown list
			System.out.println("The List of all dropdown options for Year are : ");
			for(int k=0;k<yearsList.size();k++) {
				System.out.println(yearsList.get(k).getText());
			}
			//to get default or already Selected Value
			System.out.println("The Default selected value in Year Dropdown is: "+selectYear.getFirstSelectedOption().getText());

			// to select value or change the dropdown value by index
			//selectYear.selectByIndex(10);
			//System.out.println("The Selected value by Index in Year Dropdown is: "+selectYear.getFirstSelectedOption().getText());

			// to select value or change the dropdown value by value
			selectYear.selectByValue("2023");
			System.out.println("The Selected value by Value in Year Dropdown is: "+selectYear.getFirstSelectedOption().getText());

			// to select value or change the dropdown value by Visible Text 
			
			selectYear.selectByVisibleText("2022");
			System.out.println("The Selected value by Visible Text in Year Dropdown is: "+selectYear.getFirstSelectedOption().getText());

			
		driver.close();
		System.out.println("TC5 Facebook TestCase Passed and Browser Closed....!!!");
		
		
	}

}
