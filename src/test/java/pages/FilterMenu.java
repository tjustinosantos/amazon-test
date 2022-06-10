package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class FilterMenu extends BasePage {
    // Page Elements
    private final By brandMenuSelector = By.xpath("//*[@id=\"s-refinements\"]/div[20]/ul/li[2]/span/a/span");

    public FilterMenu(ChromeDriver driver) {
        super(driver);
    }

    public FilterMenu clickOnBrandMenu(String brandOption) {
        getElementWaiter(10).until(ExpectedConditions.elementToBeClickable(brandMenuSelector));
        List<WebElement> brandMenuItens = driver.findElements(brandMenuSelector);

        for (WebElement li : brandMenuItens) {
            if (li.getText().equals(brandOption)) {
                li.click();
            }
        }

        return new FilterMenu(driver);
    }
}
