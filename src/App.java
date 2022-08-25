import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\271865\\Documents\\selenium\\selenium-tests\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://b2c-stage.ecom.poferries.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@id='passNext']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[@class='button farefinder-passenger-next']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[normalize-space()='Show times']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@aria-label='Continue']")).click(); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("(//a[@aria-label='Sign in'])[3]")).click(); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@id='popupLoginEmail']")).sendKeys("ratanparahisagni@gmail.com");
        driver.findElement(By.xpath("//input[@id='popupLoginPassword']")).sendKeys("Hisagni@123");
        driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='Enter first name'])[1]")).sendKeys("test-abc");
        driver.findElement(By.xpath("(//input[@placeholder='Enter last name'])[1]")).sendKeys("test-de");
        Select se2 = new Select(driver.findElement(By.xpath("(//select[@name='Gender'])[1]")));
        se2.selectByIndex(1);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("(//input[@placeholder='Enter email'])[1]")).sendKeys("testop89@gmail.com");
        driver.findElement(By.xpath("(//input[@placeholder='Enter phone number'])[1]")).sendKeys("1234567890");
        driver.findElement(By.xpath("(//input[@placeholder='Enter first name'])[2]")).sendKeys("Hisagni");
        driver.findElement(By.xpath("(//input[@placeholder='Enter last name'])[2]")).sendKeys("Bhut");
        Select se3 = new Select(driver.findElement(By.xpath("(//select[@name='Gender'])[2]")));
        se3.selectByIndex(1);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("(//input[@placeholder='Enter vehicle registration'])[1]")).sendKeys("5656");
        driver.findElement(By.xpath("(//button[@aria-label='Continue'][normalize-space()='Continue'])[1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // driver.quit();
        driver.findElement(By.xpath("(//input[@id='orderCheckoutQasPostCode'])[1]")).sendKeys("10001");
        driver.findElement(By.xpath("(//input[@placeholder='Enter Address Line 1'])[1]")).sendKeys("b2");
        driver.findElement(By.xpath("(//input[@name='city'])[1]")).sendKeys("Gandhinagar");
        driver.findElement(By.xpath("(//label[normalize-space()='Terms and Conditions'])[1]")).click();
        driver.findElement(By.xpath("(//button[@class='button btnBooingContinuew'])[1]")).click();
    }
}