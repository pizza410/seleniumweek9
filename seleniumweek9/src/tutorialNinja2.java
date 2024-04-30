import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class tutorialNinja2 {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement searchBox=driver.findElement(By.name("search"));
        searchBox.sendKeys("SAMSUNG");
        WebElement searchButton=driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
        searchButton.click();
        driver.quit();


    }
}
