package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.logging.Logger;

public class StepDefinition {
    static Logger log = Logger.getLogger(StepDefinition.class.getName());
    ChromeDriver driver;
    String originalWindow;

    @Before
    public void startUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Given("I have amazon website opened")
    public void I_have_amazon_website_opened() throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.navigateTo("https://www.amazon.in/");
    }

    @When("I click on hamburger menu in the top left corner")
    public void I_click_on_hamburger_menu_in_the_top_left_corner() throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnHamburgerMenu();
    }

    @And("click on the {string}")
    public void And_click_on_the(String menuItem) throws Throwable {
        MainMenu mainMenu = new MainMenu(driver);
        mainMenu.clickOnMenuItem(menuItem);
    }

    @And("I click on click on {string}")
    public void I_click_on_click_on(String subMenuItem) throws Throwable {
        MainMenu mainMenu = new MainMenu(driver);
        mainMenu.clickOnTvButton(subMenuItem);
    }

    @And("I filter the results by Brand {string}")
    public void I_scroll_down_and_filter_the_results_by_Brand(String brand) throws Throwable {
        FilterMenu filterMenu = new FilterMenu(driver);
        filterMenu.clickOnBrandMenu(brand);
    }

    @And("sort the Samsung results with {string}")
    public void And_sort_the_Samsung_results_with(String sortingOption) throws Throwable {
        ResultPage resultPage = new ResultPage(driver);
        resultPage.clickOnSortByMenuListBox(sortingOption);
    }

    @And("click on the second highest priced item")
    public void And_click_on_the_second_highest_priced_item() throws Throwable {
        ResultPage resultPage = new ResultPage(driver);
        originalWindow = driver.getWindowHandle();
        resultPage.clickOnResultItem(2);
    }

    @Then("I assert that About this item section is present")
    public void I_assert_that_about_this_item_section_is_present() throws Throwable {
        ResultPage resultPage = new ResultPage(driver);
        ProductPage productPage = new ProductPage(driver);
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        Assert.assertNotNull(productPage.getAboutItem());
    }

    @And("log this section text to console")
    public void log_this_section_text_to_console_report() throws Throwable {
        ProductPage productPage = new ProductPage(driver);
        log.info(productPage.getAboutItem());
    }
}
