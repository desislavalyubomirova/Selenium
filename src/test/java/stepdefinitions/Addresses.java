package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.TestSuiteSetup.chrome;

public class Addresses {

    @When("Customer click on addresses")
    public void customer_click_on_addresses() {
            chrome.findElement(By.partialLinkText("Addresses")).click();
    }
    @Then("Customer verify MyAccount-Addresses Page")
    public void customer_verify_my_account_addresses_page() {
            String addressPage = chrome.findElement(By.cssSelector(".page-title")).getText();
            assertEquals("My account - Addresses",addressPage);
    }
    @Then("Customer verify name is John Smith")
    public void customer_verify_name_is_john_smith() {
            String verifyName = chrome.findElement(By.cssSelector(".info li:nth-child(1)")).getText();
            assertEquals("john smith",verifyName);
    }

}
