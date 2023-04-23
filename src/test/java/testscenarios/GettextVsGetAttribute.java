package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextVsGetAttribute {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		// google search button text
		//String abv = driver.findElement(By.name("btnK")).getAttribute("value");
	    //System.out.println(abv); 
	      
	     //String bvc = driver.findElement(By.name("btnI")).getAttribute("aria-label");
	     //System.out.println(bvc);
		
		driver.get("https://www.facebook.com/login/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String FbEmailText=driver.findElement(By.name("email")).getAttribute("Email address or phone number");
		System.out.println(FbEmailText);
		
		driver.findElement(By.linkText("_97w4")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}
