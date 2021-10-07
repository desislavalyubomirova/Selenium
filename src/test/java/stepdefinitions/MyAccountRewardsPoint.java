package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.TestSuiteSetup.chrome;

public class MyAccountRewardsPoint {
    @When("Customer click on My Account")
    public void customer_click_on_my_account() {
        chrome.findElement(By.partialLinkText("My account")).click();
    }

    @Then("Customer see Account info")
    public void customer_see_account_info() {
        String accountPage = chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("My account - Customer info",accountPage);
    }

    @When("Customer click on reward points")
    public void customer_click_on_reward_points() {
        chrome.findElement(By.partialLinkText("Reward points")).click();
    }

    @Then("Customer is on reward page")
    public void customer_is_on_reward_page() {
        String rewardsPage = chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("My account - Reward points",rewardsPage);
    }

    @Then("Customer can verify his balance")
    public void customer_can_verify_his_balance() {
        String rewardsBalance = chrome.findElement(By.cssSelector(".current-balance")).getText();
        assertEquals("Your current balance is 0 reward points (0.00).",rewardsBalance);
    }
}
