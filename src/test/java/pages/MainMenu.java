package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MainMenu extends HomePage {

    // Page Elements
    private final By menuItemsSelector = By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible");
    private final By subMenuItemsSelector = By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX");

    public MainMenu(ChromeDriver driver) {
        super(driver);
    }

    public MainMenu clickOnMenuItem(String menuItem) {
        getElementWaiter(10).until(ExpectedConditions.elementToBeClickable(menuItemsSelector));
        WebElement menuItemLink = driver.findElement(By.linkText(menuItem));
        menuItemLink.click();
        return new MainMenu(driver);
    }

    public MainMenu clickOnTvButton(String subMenuItem) {
        getElementWaiter(10).until(ExpectedConditions.elementToBeClickable(subMenuItemsSelector));
        WebElement subMenuItemLink = driver.findElement(By.linkText(subMenuItem));
        subMenuItemLink.click();
        return new MainMenu(driver);
    }
}
