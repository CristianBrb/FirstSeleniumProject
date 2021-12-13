import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class CartTest {

    public void addToCartWithoutLogin() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        driver.findElement(By.id("product-collection-image-403")).click();
        driver.findElement(By.id("option27")).click();
        driver.findElement(By.id("option77")).click();
        driver.findElement(By.cssSelector(".product-view .add-to-cart-buttons .button")).click();
        driver.findElement(By.id("postcode")).sendKeys("800350");
        driver.findElement(By.id("region_id")).sendKeys("a");
        driver.findElement(By.cssSelector(".cart .button")).click();

     //   driver.quit();

    }
}
