package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_7Hyperlinkpractice {

	public static void main(String[] args) throws Exception {
		//open any browser (chrome/firefox/ edge)
		//creat any webdriver object
		//WebDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();	
		//type the url application 
		driver.get("https://www.justrechargeit.com/");
		
	
	  //use hyperlink
		driver.findElement(By.id("jriTop_signin9")).click();
		 driver.findElement(By.id("forgotpassword")).click();
		    
	}

}
