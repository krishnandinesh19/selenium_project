package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//click on windowbutton button
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);
		
	
		//close the current window,quitting the browser 
		 //driver.close();
		driver.quit();
		
		
		
				

	}

}
