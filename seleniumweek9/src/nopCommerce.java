import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class nopCommerce {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        WebElement searchBar=driver.findElement(By.id("small-searchterms"));
        searchBar.sendKeys("Apple");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        WebElement searchButton=driver.findElement(By.linkText("Search"));
        searchButton.click();
        //driver.quit();



    }
}
