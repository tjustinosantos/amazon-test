package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BasePage {

    // Page Elements
    private final By featureBulletsSelector = By.cssSelector("#feature-bullets");

    public ProductPage(ChromeDriver driver) {
        super(driver);
    }

    public String getAboutItem() {
        getElementWaiter(10).until(ExpectedConditions.elementToBeClickable(featureBulletsSelector));
        WebElement sortByMenuListBox = driver.findElement(featureBulletsSelector);
        return sortByMenuListBox.getText();
    }
}
