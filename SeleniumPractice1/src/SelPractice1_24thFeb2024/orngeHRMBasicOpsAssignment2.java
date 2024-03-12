package SelPractice1_24thFeb2024;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class orngeHRMBasicOpsAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		WebDriver driver=GenericBrowserOpening.setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      
	      
	}

}
