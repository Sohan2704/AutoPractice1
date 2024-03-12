package day11.Dropdowns_28thFeb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import day6.BrowserOpsValidation_16thFeb.ReusableFunctions;

public class orrangeHrmAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=ReusableFunctions.setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String userName=driver.findElement(By.xpath("//p[text()='Username : Admin']")).getText();
		String[] givenUsername=userName.split("Username : ");
		System.out.println("Given Username is: "+givenUsername);
		String passWord=driver.findElement(By.xpath("//p[text()='Password : admin123']")).getText();
		String[] givenPassword=passWord.split(": ");
		System.out.println("Given Password is: "+givenUsername);
		
		
		
	}

}
