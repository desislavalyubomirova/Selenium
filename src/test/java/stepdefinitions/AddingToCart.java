package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.TestSuiteSetup.chrome;

public class AddingToCart {


    @When("Customer search for a book")
    public void customer_search_for_a_book() {
        WebElement bar = chrome.findElement(By.cssSelector("#small-searchterms"));
        bar.sendKeys("book");
        bar.submit();
    }

    @Then("Customer is on search page")
    public void customer_is_on_search_page() {
        String ola = chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("hi", ola);
    }

    @When("Customer clicks on add to cart")
    public void customer_clicks_on_add_to_cart() {
        chrome.findElement(By.cssSelector(".button-2.product-box-add-to-cart-button")).click();


    }

    @Then("Shopping cart should get updated from \\({int}) to \\({int})")
    public void shopping_cart_should_get_updated_from_to(Integer int1, Integer int2) throws InterruptedException {
        Thread.sleep(1000);
        String one = chrome.findElement(By.cssSelector(".cart-qty")).getText();
        assertEquals("(1)", one);
    }
}
