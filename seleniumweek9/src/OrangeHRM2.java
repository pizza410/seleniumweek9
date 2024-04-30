import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHRM2 {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }
}
