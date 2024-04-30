import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class nopCommerce2 {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement computersButton=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
        computersButton.click();
    }
}
