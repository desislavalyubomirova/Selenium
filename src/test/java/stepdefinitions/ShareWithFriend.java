package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.TestSuiteSetup.chrome;

public class ShareWithFriend {
    @When("Customer click Email friend button")
    public void customer_click_email_friend_button() {
        chrome.findElement(By.cssSelector(".email-a-friend")).click();

    }

    @Then("Customer is on the email friend tab")
    public void customer_is_on_the_email_friend_tab() {
        String emailFriendTab = chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("Email a friend",emailFriendTab);
    }

    @When("Customer enter friend email")
    public void customer_enter_friend_email() {
        chrome.findElement(By.cssSelector(".friend-email")).sendKeys("desislava.lubomirova@abv.bg");
    }

    @When("Customer click on Send email")
    public void customer_click_on_send_email() {
        chrome.findElement(By.cssSelector(".button-1.send-email-a-friend-button")).click();
    }

    @Then("Customer see verification message")
    public void customer_see_verification_message() {
        String verificationMessage = chrome.findElement(By.cssSelector(".result")).getText();
        assertEquals("Your message has been sent.",verificationMessage);
    }

}
