package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_6_2Collegeweek_live {

	public static void main(String[] args) throws Exception {

		 WebDriver driver;
	     driver =new EdgeDriver();
	     
	     driver.get("https://collegeweeklive.com/go-signup");
	     driver.manage().window().maximize();
	     
	   //wait statement
	  	Thread.sleep(2000);
	  	
	  	//dropdown code
	  	new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
	  	new Select(driver.findElement(By.name("nationality"))).selectByVisibleText("INDIA");
	  	

	}

}

