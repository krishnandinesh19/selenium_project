package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_11GetAttribute {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://app.riamoneytransfer.com/en-us/");
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("/html/body/div[1]/main/section[1]/div/div/div[2]/div/div/form/div[1]/div/div"))
				.click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/div[1]/main/section[1]/div/div/div[2]/div/div/form/div[1]/div/div/div/div/ul/li[3]/div/span[2]"))
				.click();
		Thread.sleep(2000);
		
		String amt = driver
				.findElement(By.xpath("/html/body/div[1]/main/section[1]/div/div/div[2]/div/div/form/div[2]/input"))
				.getAttribute("value");
		
		System.out.println("Send amount is: " + amt);
		String INRamt = driver
				.findElement(By.xpath("/html/body/div[1]/main/section[1]/div/div/div[2]/div/div/form/div[4]/input"))
				.getAttribute("value");
		System.out.println("Recepient will get Indian Rs: " + INRamt);

		WebElement element = driver
				.findElement(By.xpath("/html/body/div[1]/main/section[1]/div/div/div[2]/div/div/form/div[2]/input"));
		element.clear();
		element.sendKeys("250");
		Thread.sleep(2000);
		String Newamt = driver
				.findElement(By.xpath("/html/body/div[1]/main/section[1]/div/div/div[2]/div/div/form/div[2]/input"))
				.getAttribute("value");
		System.out.println("New Send amount is: " + Newamt);
		String NewINRamt = driver
				.findElement(By.xpath("/html/body/div[1]/main/section[1]/div/div/div[2]/div/div/form/div[4]/input"))
				.getAttribute("value");
		System.out.println("Recepient will get Indian Rs: " + NewINRamt);

	}

}

	


