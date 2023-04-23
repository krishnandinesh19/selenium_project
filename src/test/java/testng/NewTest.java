package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws Exception {
	  WebDriver driver =new ChromeDriver();
      
      driver.get("https://blazedemo.com/");
      driver.manage().window().maximize();
      
    //wait statement
   	Thread.sleep(2000);
   	
   //dropdown code
   	new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Boston");
   	new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("London");
   	driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
   	
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
		
		driver.findElement(By.id("inputName")).sendKeys("dinesh");
		driver.findElement(By.id("address")).sendKeys("avadi");
		driver.findElement(By.id("city")).sendKeys("chennai");
		driver.findElement(By.id("state")).sendKeys("tn");
		driver.findElement(By.id("zipCode")).sendKeys("600054");
		new Select(driver.findElement(By.name("cardType"))).selectByVisibleText("American Express");
		driver.findElement(By.id("creditCardNumber")).sendKeys("45678976554");
		driver.findElement(By.id("creditCardMonth")).sendKeys("6");
		driver.findElement(By.id("creditCardYear")).sendKeys("2027");
		driver.findElement(By.id("nameOnCard")).sendKeys("DINESH");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		String aba = driver.findElement(By.xpath("/html/body/div[2]/div/h1")).getText();
		System.out.println(aba);
	    
  }
}
