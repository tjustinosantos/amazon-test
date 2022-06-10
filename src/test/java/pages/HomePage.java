package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage {

    // Page Elements
    private final By hamburgerMenuButtonSelector = By.cssSelector("#nav-hamburger-menu");

    public HomePage(ChromeDriver driver) {
        super(driver);
    }


    public HomePage navigateTo(String url) {
        driver.navigate().to(url);
        return new HomePage(driver);
    }

    public HomePage clickOnHamburgerMenu() {
        WebElement hamburgerMenuButton = driver.findElement(hamburgerMenuButtonSelector);
        hamburgerMenuButton.click();
        return new HomePage(driver);
    }
}
