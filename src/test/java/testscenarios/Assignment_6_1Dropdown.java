package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_6_1Dropdown {

	public static void main(String[] args) throws Exception {
     WebDriver driver;
     driver =new EdgeDriver();
     
     driver.get("https://testautomationpractice.blogspot.com/");
     driver.manage().window().maximize();
     
   //wait statement
 	Thread.sleep(2000);
     
     //dropdown code
     new Select(driver.findElement(By.name("speed"))).selectByVisibleText("Fast");
     new Select(driver.findElement(By.name("files"))).selectByVisibleText("PDF file");
     new Select(driver.findElement(By.name("number"))).selectByVisibleText("4");
     new Select(driver.findElement(By.name("products"))).selectByVisibleText("Iphone");
     new Select(driver.findElement(By.name("animals"))).selectByVisibleText("Baby cat");
    
	}

}
