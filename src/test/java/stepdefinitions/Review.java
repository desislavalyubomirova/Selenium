package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.TestSuiteSetup.chrome;

public class Review {
    @When("Click on add review")
    public void click_on_add_review() {
        chrome.findElement(By.partialLinkText("Add your review")).click();
    }

    @Then("Customer is on Product review for Health Book page")
    public void customer_is_on_product_review_for_health_book_page() {
        String reviewPage = chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("Product reviews for Health Book ",reviewPage);
    }

    @When("Customer enter review title")
    public void customer_enter_review_title() {
        chrome.findElement(By.cssSelector(".review-title")).sendKeys("Health book review");
    }

    @When("Customer enter review text")
    public void customer_enter_review_text() {
        chrome.findElement(By.cssSelector(".review-text")).sendKeys("The book is great");
    }

    @When("Customer click submit review button")
    public void customer_click_submit_review_button() {
        chrome.findElement(By.cssSelector(".button-1.write-product-review-button")).click();
    }
}
