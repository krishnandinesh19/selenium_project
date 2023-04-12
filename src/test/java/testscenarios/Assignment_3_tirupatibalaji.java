package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_3_tirupatibalaji {

	public static void main(String[] args) throws Exception {
		//object creation
				WebDriver driver;
				
				////open edge browser
				driver = new EdgeDriver();
				
				
				
				//type thr url
				driver.get("https://tirupatibalaji.ap.gov.in/#/login");
				
				
				//wait statement
				Thread.sleep(3000);
				
				
				//signup hyper link
				driver.findElement(By.linkText("Sign Up")).click();
				
				
				//wait statement
				Thread.sleep(3000);
				
				
				//radio button and text box
				driver.findElement(By.id("entity")).click();
				driver.findElement(By.name("name")).sendKeys("htysnssnxan");
			}	
			}


	
