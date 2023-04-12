package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_6_3tirupatibalaji {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
	     driver =new EdgeDriver();
	     
	     
	     driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
	     
	     
	   //wait statement
		  	Thread.sleep(2000);
		  	
			//dropdown code
		  	new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("india");
		  	new Select(driver.findElement(By.name("stateS"))).selectByVisibleText("tamilnadu");
	}
}

