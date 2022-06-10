package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class ResultPage extends BasePage {

    // Page Elements
    private final By sortByMenuSelector = By.cssSelector("#s-result-sort-select");
    private final By resultListSelector = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div");

    public ResultPage(ChromeDriver driver) {
        super(driver);
    }

    public ResultPage clickOnSortByMenuListBox(String sortingOption) {
        getElementWaiter(10).until(ExpectedConditions.elementToBeClickable(sortByMenuSelector));
        WebElement sortByMenuListBox = driver.findElement(sortByMenuSelector);
        Select sel = new Select(sortByMenuListBox);
        sel.selectByVisibleText(sortingOption);
        return new ResultPage(driver);
    }

    public ResultPage clickOnResultItem(int orderNumber) {
        getElementWaiter(10).until(ExpectedConditions.elementToBeClickable(resultListSelector));
        List<WebElement> resultsList = driver.findElements(resultListSelector);
        resultsList.get(orderNumber).click();

        //Wait for new tab to open
        getElementWaiter(10).until(numberOfWindowsToBe(2));
        return new ResultPage(driver);
    }

    public ResultPage switchToNewTab() {
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
        return new ResultPage(driver);
    }

}
