package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSigninTest {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "c:\\work\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("gb_70")).click();
		driver.close();
	
		
		

		
		
		
	}

	private static void click(String string) {
		// TODO Auto-generated method stub
		
	}

}
