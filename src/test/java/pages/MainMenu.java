package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.net.MalformedURLException;

public class MainMenu extends HomePage {

    // Page Elements
    private final By menuItemsSelector = By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible");
    private final By subMenuItemsSelector = By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX");

    public MainMenu(WebDriver driver) throws MalformedURLException {
        super(driver);
    }

    public MainMenu clickOnMenuItem(String menuItem) throws MalformedURLException {
        getElementWaiter(10).until(ExpectedConditions.elementToBeClickable(menuItemsSelector));
        WebElement menuItemLink = driver.findElement(By.linkText(menuItem));
        menuItemLink.click();
        return new MainMenu(driver);
    }

    public MainMenu clickOnSubMenu(String subMenuItem) throws MalformedURLException {
        getElementWaiter(10).until(ExpectedConditions.elementToBeClickable(subMenuItemsSelector));
        WebElement subMenuItemLink = driver.findElement(By.linkText(subMenuItem));
        subMenuItemLink.click();
        return new MainMenu(driver);
    }
}
