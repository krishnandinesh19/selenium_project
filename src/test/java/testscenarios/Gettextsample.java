package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextsample {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://collegeweeklive.com/go-signup/");
		
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		
		//get the text from application will use gettext()
		String abs = driver.findElement(By.id("firstNameError")).getText();
		System.out.println(abs);

	}

}
