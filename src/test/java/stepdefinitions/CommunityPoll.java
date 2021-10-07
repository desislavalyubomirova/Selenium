package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.TestSuiteSetup.chrome;

public class CommunityPoll {

    @When("Customer click on Excellent")
    public void customer_click_on_excellent() {
        WebElement clickButton = chrome.findElement(By.cssSelector("#pollanswers-1"));
        clickButton.click();
    }
    @When("Customer clicks on vote")
    public void customer_clicks_on_vote() {
        WebElement clickVote  = chrome.findElement(By.cssSelector("#vote-poll-1"));
        clickVote.click();
    }
    @Then("Verify message:Only register customers can vote")
    public void verify_message_only_register_customers_can_vote() throws InterruptedException {
        Thread.sleep(2000);
        String message = chrome.findElement(By.cssSelector("#block-poll-vote-error-1")).getText();
        assertEquals("Only registered users can vote.",message);
    }
}
