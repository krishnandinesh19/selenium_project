package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_12GetTitleandGetURL {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		// driver = new FirefoxDriver();
		driver = new EdgeDriver();
		//driver =new ChromeDriver()
		driver.get("https://www.applevacations.com/#!/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		Thread.sleep(6000);
		//Offer click
		driver.findElement(By.xpath("//*[@id='bx-element-1820631-B7dy9qj']/button")).click();
		Thread.sleep(2000);
		// Copy XPATH was not working so tried option copy FULL XPATH
		driver.findElement(By.xpath("/html/body/div[2]/div/header/div[1]/div/div[1]/div/div[2]/nav/ul/li[2]/a"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[2]/div/header/div[1]/div/div[1]/div/div[2]/nav/ul/li[2]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}

}

