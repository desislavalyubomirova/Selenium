package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.TestSuiteSetup.chrome;

public class LogIn {


    @Given("Customer is on Demo shop home page")
    public void customer_is_on_demo_shop_home_page() {
        chrome.get("http://demowebshop.tricentis.com/");
    }


    @When("Customers Click on log in")
    public void customers_click_on_log_in() {
        chrome.findElement(By.cssSelector("a.ico-login")).click();
    }


    @Then("Customer should be on Sign In Page")
    public void customer_should_be_on_sign_in_page() {
       String title = chrome.findElement(By.cssSelector(" .page-title")).getText();
       assertEquals("Welcome, Please Sign In",title);

    }
    @When("Customer enter email for login")
    public void customer_enters_email_for_login() {

        chrome.findElement(By.cssSelector("#Email")).sendKeys("desislava.lubomirova@abv.bg");
    }

    @When("Customer enter password")
    public void customer_enter_password() {
        chrome.findElement(By.cssSelector("#Password")).sendKeys("220471");
    }
    @When("Customer click on Remember me box")
    public void customer_click_on_remember_me_box() {
        chrome.findElement(By.cssSelector("#RememberMe")).click();
    }


        @Then("Customer Land on the home page")
        public void customer_land_on_the_home_page () {
            chrome.findElement(By.cssSelector(".button-1.login-button")).click();
        }
        @Then("Customer click on Log Out")
        public void customer_click_on_log_out () {
            String xyz = chrome.findElement(By.cssSelector(".ico-logout")).getText();
            assertEquals("Log out", xyz);
        }

    @When("Customers click on Log in button")
    public void customers_click_on_log_in_button() {
        chrome.findElement(By.cssSelector(".button-1.login-button")).click();
    }


}
