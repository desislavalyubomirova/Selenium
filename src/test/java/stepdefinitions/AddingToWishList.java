package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.TestSuiteSetup.chrome;

public class AddingToWishList {

    @Given("Customer is on DemoShop home page book")
    public void customer_is_on_demo_shop_home_page_book() {
        chrome.get("http://demowebshop.tricentis.com/");
    }
    @When("Customer search for a health book")
    public void customer_search_for_a_health_book() {
        WebElement bar = chrome.findElement(By.cssSelector("#small-searchterms"));
        bar.sendKeys("book");
        bar.submit();
    }
    @Then("Customer is on book page")
    public void customer_is_on_book_page() {
        String Book = chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("Search",Book);

    }
    @When("Customer click on book")
    public void customer_click_on_book() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement book = chrome.findElement(By.cssSelector(".product-title"));
        book.click();

    }
    @When("Customer click on add to wishlist")
    public void customer_click_on_add_to_wishlist() {
        chrome.findElement(By.cssSelector("#add-to-wishlist-button-22")).click();
    }
    @Then("Wishlist should get updated from \\({int}) to \\({int})")
    public void wishlist_should_get_updated_from_to(Integer int1, Integer int2) throws InterruptedException {
        Thread.sleep(1000);
        String wishlist = chrome.findElement(By.cssSelector(".wishlist-qty")).getText();
        assertEquals("(1)",wishlist);
    }
}
