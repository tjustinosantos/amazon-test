package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    ChromeDriver driver;

    public BasePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public WebDriverWait getElementWaiter(int seconds) {
        Duration durationInSeconds = Duration.ofSeconds(seconds);
        WebDriverWait wait = new WebDriverWait(driver, durationInSeconds);
        return wait;
    }
}
