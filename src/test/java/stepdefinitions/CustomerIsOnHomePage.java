package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static stepdefinitions.TestSuiteSetup.chrome;

public class CustomerIsOnHomePage {


    @When("Customer enter email address")
    public void customer_enter_email_address() {
        WebElement Email = chrome.findElement(By.cssSelector("#newsletter-email"));
        Email.sendKeys("desislava.lubomirova.dl@gmail.com");


    }
    @When("Customer clicks on subscribe")
    public void customer_clicks_on_subscribe() {

    }
    @Then("Customer see checking text")
    public void customer_see_checking_text() {

    }

}
