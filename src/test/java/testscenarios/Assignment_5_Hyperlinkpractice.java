package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_5_Hyperlinkpractice {

	public static void main(String[] args) throws Exception {

		WebDriver Driver;
		
	//open edge browser
	//Driver = new EdgeDriver();
	 Driver = new ChromeDriver();
	
	//type the url 
	Driver.get("https://tirupatibalaji.ap.gov.in/#/login");
	
	//wait statement
	Thread.sleep(3000);
	
	//use hyperlink
	Driver.findElement(By.linkText("Sign Up")).click();
	
	//wait statement
	Thread.sleep(3000);
	
	//radio button and text box
	Driver.findElement(By.id("entity")).click();
	Driver.findElement(By.name("name")).sendKeys("htysnssnxan");

	}
}
