package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {
    WebDriver driver;

    @Before
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("I have amazon website opened")
    public void I_have_amazon_website_opened() throws Throwable {
        System.out.println("Hello World");
    }

    @When("I click on hamburguer menu in the top left corner")
    public void I_click_on_hamburguer_menu_in_the_top_left_corner() throws Throwable {
        System.out.println("Hello World");
    }

    @And("I scroll own and then Click on the TV, Appliances")
    public void I_scroll_own_and_then_Click_on_the_TV_Appliances() throws Throwable {
        System.out.println("Hello World");
    }

    @And("Electronics link under Shop by Department section")
    public void And_Electronics_link_under_Shop_by_Department_section() throws Throwable {
        System.out.println("Hello World");
    }

    @And("I click on click on Televisions under Tv, Audio & Cameras sub section")
    public void I_click_on_click_on_Televisions_under_Tv_Audio_Cameras_sub_section() throws Throwable {
        System.out.println("Hello World");
    }

    @And("I scroll down and filter the results by Brand Samsung")
    public void I_scroll_down_and_filter_the_results_by_Brand_Samsung() throws Throwable {
        System.out.println("Hello World");
    }

    @And("sort the Samsung results with price High to Low")
    public void And_sort_the_Samsung_results_with_price_High_to_Low() throws Throwable {
        System.out.println("Hello World");
    }

    @And("click on the second highest priced item")
    public void And_click_on_the_second_highest_priced_item() throws Throwable {
        System.out.println("Hello World");
    }

    @Then("I assert that About this item section is present")
    public void I_assert_that_about_this_item_section_is_present() throws Throwable {
        System.out.println("Hello World");
    }

    @And("log this section text to console and report")
    public void log_this_section_text_to_console_report() throws Throwable {
        System.out.println("Hello World");
    }
}
