package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Websitelogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:\\work\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("12345");
		
		
		
		
		
		
		
	}

}
