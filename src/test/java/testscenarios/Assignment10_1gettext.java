package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10_1gettext {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"imgbtnSignin\"]")).click();
		
		//get the text from application will use gettext()
		String num = driver.findElement(By.id("MessageCaption2")).getText();
		System.out.println(num);

	}

}
