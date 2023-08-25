package locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class TestLogin {
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

        //insert email
//        driver.findElement(By.name("email")).sendKeys("admin@example.com");
//        driver.findElement(By.name("password")).sendKeys("123456");
driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[1]/input")).sendKeys("admin@example.com");
driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[2]/input")).sendKeys("123456");
driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/button")).click();
//hyperlink
       // driver.findElement(By.partialLinkText("Forgot")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
