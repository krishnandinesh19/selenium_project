package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationmethodsample {

	public static void main(String[] args) throws Exception {
		//open any browser (chrome/firefox/ edge)
				//creat any webdriver object
				WebDriver driver = new ChromeDriver();
				
				//type the url application 
				driver.get("https://www.facebook.com/login/");
				Thread.sleep(2000);
				
			   //click on forgot password in hyperlink
				driver.findElement(By.className("_97w4")).click();
				
				Thread.sleep(3000);
				driver.findElement(By.name("email")).sendKeys("dinesh");
				
				//click on refresh/reload icon
				driver.navigate().refresh();
				
				//click on backward icon
				driver.navigate().back();
				Thread.sleep(3000);
				
				//click on forward icon
				driver.navigate().forward();
				
				
				

	}

}
