package webelement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginCMS {
    public static void main(String[] args) throws InterruptedException {
        //init browser with chrome
        WebDriver driver = new ChromeDriver();
        //WebDriver driver1= new EdgeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // open web
        driver.get("https://demo.activeitzone.com/ecommerce/login");
        Thread.sleep(1000);
        WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys("admin@example.com");
        //inputEmail.clear();
        driver.findElement(By.id("password")).sendKeys("123456");
       // driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        WebElement buttonCopy = driver.findElement( By.xpath("//button[normalize-space()='Copy']"));
        System.out.println("State of Copy button is "+buttonCopy.isDisplayed());
        WebElement buttonLogin = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        System.out.println("State of Login button is "+buttonLogin.isEnabled());
        //WebElement cbRemember = driver.findElement(By.id("remember"));
        //cbRemember.click();
        driver.findElement(By.xpath("//span[normalize-space()='Remember Me']")).click();
        WebElement cbRemember = driver.findElement(By.xpath("//span[normalize-space()='Remember Me']"));

        boolean status=cbRemember.isSelected();
        System.out.println("State of RememberMe  is "+status);

        Thread.sleep(2000);
        driver.quit();
    }
}
