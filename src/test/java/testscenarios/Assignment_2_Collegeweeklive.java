package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2_Collegeweeklive {

	public static void main(String[] args) throws Exception {
		
		//creat any webdriver object
		WebDriver driver = new ChromeDriver();
		
		//type the url 
		driver.get("https://collegeweeklive.com/go-signup/");
		
		//wait statement
				Thread.sleep(3000);
		
		//type the invalid user name id all details 
		driver.findElement(By.name("firstName")).sendKeys("dinesh");
		driver.findElement(By.name("lastName")).sendKeys("krishnan");
		driver.findElement(By.id("emailAddress")).sendKeys("dinesh@mail.com");
		driver.findElement(By.id("phoneNumber")).sendKeys("8148543251");
		driver.findElement(By.id("password")).sendKeys("qwtaq12");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("qwtaq12");
		
		
		//checkbox
		driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();
		driver.findElement(By.id("questions[q_137]")).click();
		
		//sumbit
		driver.findElement(By.id("submit")).click();
	}

}
