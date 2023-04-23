package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_9_navigationalmethod {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.justrechargeit.com/SignUp.aspx");
		
		
		//Click on CreateNewAccount hyper link
	
		driver.findElement(By.name("signup_name")).click();
		
		
		//Type Name edit box (any dummy data)
       driver.findElement(By.id("signup_name")).sendKeys("DINESH");
       driver.findElement(By.id("signup_mobileno")).sendKeys("123688766");
      
       Thread.sleep(3000);
       
     //click on refresh/reload icon
		driver.navigate().refresh();
		
		
		
		//click on backward icon
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		//click on forward icon
		driver.navigate().forward();
		
		
	}

}
