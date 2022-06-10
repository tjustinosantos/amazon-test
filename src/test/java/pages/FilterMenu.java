package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.net.MalformedURLException;

public class FilterMenu extends BasePage {
    // Page Elements
    private final By brandMenuSelector = By.xpath("//*[@id=\"s-refinements\"]/div[20]/ul/li[3]/span/a");

    public FilterMenu(WebDriver driver) throws MalformedURLException {
        super(driver);
    }

    public FilterMenu clickOnBrandMenu(String brandOption) throws MalformedURLException, InterruptedException {
        getElementWaiter(10).until(ExpectedConditions.elementToBeClickable(brandMenuSelector));
        WebElement brandMenuItens = driver.findElement(brandMenuSelector);
        brandMenuItens.click();
        return new FilterMenu(driver);
    }
}
