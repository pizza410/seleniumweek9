import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class practiceautomation2 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice-automation.com/");
        driver.findElement(By.linkText("Form Fields")).click();
        driver.findElement(By.id("name")).sendKeys("Shubham");
    }
}
