package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.TestSuiteSetup.chrome;

public class Computers {
    @When("Customer click on computers")
    public void customer_click_on_computers() {
        chrome.findElement(By.partialLinkText("Computers")).click();
    }
    @Then("Verify customers is on computers page")
    public void verify_customers_is_on_computers_page() {
        String verificationPage = chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("Computers",verificationPage);
    }
}
