package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {

	public static void main(String[] args) {
		
		
		//open any browser (chrome/firefox/ edge)
		//creat any webdriver object
		WebDriver driver = new ChromeDriver();

		
		
		//type the url application 
		driver.get("https://www.facebook.com/login/");
		
		
		
		//type invaild credential (username &password)
		driver.findElement(By.id("email")).sendKeys("dinesh@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("qwerta");
		
		
		
		//click on login button 
		driver.findElement(By.name("login")).click();
		
	}

}
