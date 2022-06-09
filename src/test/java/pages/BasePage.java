package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {
    WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = new ChromeDriver();;
    }

    public WebDriverWait getElementWaiter(int seconds){
        Duration durationseconds = Duration.ofSeconds(seconds);
        WebDriverWait wait = new WebDriverWait(driver, durationseconds);
        return wait;
    }
}
