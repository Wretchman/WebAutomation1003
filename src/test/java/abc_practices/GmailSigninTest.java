package abc_practices;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSigninTest {
   
    
    public static void main(String[] args) throws Throwable {
       
    	System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();  // You can use any other web browser.
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("gb_70")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/ServiceLogin?");
        driver.findElement(By.id("identifierId")).sendKeys("hab4791@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        driver.findElement(By.xpath("//input[@aria-label='Enter your password' and @name='password']")).sendKeys("0pen4meplsgoogle");
        Thread.sleep(200);
        driver.findElement(By.id("passwordNext")).click();
        
        Thread.sleep(200);
       
        driver.get("https://www.facebook.com/");
        Thread.sleep(500);
        driver.navigate().back();
       
        Thread.sleep(500);
        
        driver.close();
        
        
    }

}
