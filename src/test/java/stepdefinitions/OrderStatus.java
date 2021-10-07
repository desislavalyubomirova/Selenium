package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.TestSuiteSetup.chrome;

public class OrderStatus {

    @When("Customer click on orders link ")
    public void customer_click_on_orders_link() {
        chrome.findElement(By.partialLinkText("Orders")).click();
    }
    @Then("Customer verify MyAccount-Orders Page")
    public void customer_verify_my_account_orders_page() {
        String conformation = chrome.findElement(By.cssSelector(".account")).getText();
        assertEquals("My account - Orders",conformation);

    }
    @Then("Customer should see order status")
    public void customer_should_see_order_status() {
        String orderStatus = chrome.findElement(By.cssSelector(".info li:nth")).getText();
        assertEquals("Pending",orderStatus);

    }
}
