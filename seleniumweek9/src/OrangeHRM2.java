import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class OrangeHRM2 {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement usernameTab=driver.findElement(By.name("username"));
        usernameTab.sendKeys("Admin");
        WebElement passwordTab=driver.findElement(By.name("password"));
        passwordTab.sendKeys("admin123");
        WebElement loginButton=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        loginButton.click();
    }
}
