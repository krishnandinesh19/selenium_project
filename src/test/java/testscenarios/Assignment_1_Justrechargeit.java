package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class  Assignment_1_Justrechargeit {

	public static void main(String[] args) {
		
		
		//open any browser (chrome/firefox/ edge)
				//creat any webdriver object
				WebDriver driver = new ChromeDriver();
					
				//type the url application 
				driver.get("https://www.justrechargeit.com/SignIn.aspx");
				
				//type invaild user name and password
				driver.findElement(By.id("txtUserName")).sendKeys("dinesh@mail.com");
				driver.findElement(By.id("txtPasswd")).sendKeys("sdghfj");
				driver.findElement(By.id("txtCaptcha")).sendKeys("e2er");
				
				//click on login button 
				driver.findElement(By.id("imgbtnSignin")).click();
	}

}
