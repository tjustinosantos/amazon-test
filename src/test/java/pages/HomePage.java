package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class HomePage extends BasePage {

    // Page Elements
    private final By hamburgerMenuButtonSelector = By.cssSelector("#nav-hamburger-menu");

    public HomePage(WebDriver driver) throws MalformedURLException {
        super((driver));
    }


    public HomePage navigateTo(String url) throws MalformedURLException {
        driver.navigate().to(url);
        return new HomePage(driver);
    }

    public HomePage clickOnHamburgerMenu() throws MalformedURLException {
        WebElement hamburgerMenuButton = driver.findElement(hamburgerMenuButtonSelector);
        hamburgerMenuButton.click();
        return new HomePage(driver);
    }
}
