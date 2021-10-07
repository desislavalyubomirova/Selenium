package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.TestSuiteSetup.chrome;

public class Purchase {

    @When("Customer click on books")
    public void customer_click_on_inch_laptop() {

        WebElement Books = chrome.findElement(By.partialLinkText("Books"));
        Books.click();


    }
    @Then("Customer should see the results")
    public void customer_should_see_the_results() {


    }

    @When("Customer orders by Price low to hight")
    public void customer_orders_by_price_low_to_hight() {
        WebElement Sortby = chrome.findElement(By.id("products-orderby"));
        Sortby.sendKeys("Price: Low to High");
    }
    @When("Customer change the view to list")
    public void customer_change_the_view_to_list() {
        WebElement ViewAs = chrome.findElement(By.id("products-viewmode"));
        ViewAs.sendKeys("List");
    }
    @When("Customer adds the first book to cart")
    public void customer_adds_the_first_book_to_cart() {
        List<WebElement> addToCarts = chrome.findElements(By.cssSelector(".button-2.product-box-add-to-cart-button"));
        WebElement addToCart1 = addToCarts.get(0);
        addToCart1.click();
    }
    @Then("Customer should see updated cart")
    public void customer_should_see_updated_cart() {
            WebElement shoppingCart = chrome.findElement(By.cssSelector(".cart-qty"));
            System.out.println(shoppingCart.getText());
            assertEquals("2",shoppingCart.getText());

    }
    @When("Customer is on the cart page")
    public void customer_is_on_the_cart_page() {
        WebElement ClicAddcart = chrome.findElement(By.id("topcartlink"));
        ClicAddcart.click();
    }
    @Then("Customer should land on shopping cart page")
    public void customer_should_land_on_shopping_cart_page() {
        WebElement cartPage=chrome.findElement(By.cssSelector(".page-title"));
        System.out.println(cartPage.getText());
        assertEquals("Shopping cart",cartPage.getText());

    }
    @When("Customer Choose USA")
    public void customer_choose_usa() {
        WebElement Country = chrome.findElement(By.id("CountryId"));
        Country.sendKeys("United States");
    }
    @When("Customer agrees to terms and conditions")
    public void customer_agrees_to_terms_and_conditions() {
        WebElement Iagreebutton = chrome.findElement(By.id("termsofservice"));
        Iagreebutton.click();
    }
    @When("Customer clicks on check out")
    public void customer_clicks_on_check_out() {
        WebElement Checkout = chrome.findElement(By.id("checkout"));
        Checkout.click();
    }
    @Then("Customer should be redirected to sign in page")
    public void customer_should_be_redirected_to_sign_in_page() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement cartTitle=chrome.findElement(By.cssSelector(".page-title"));
        System.out.println(cartTitle.getText());
    }
    @When("Customer clicks on check out as guest button")
    public void customer_clicks_on_check_out_as_guest_button() {
        WebElement CheckoutasGuest = chrome.findElement(By.cssSelector(".button-1.checkout-as-guest-button"));
        CheckoutasGuest.click();
    }
    @Then("Customer is redirected to Checkout page")
    public void customer_is_redirected_to_checkout_page() throws InterruptedException {
        Thread.sleep(2000);
        WebElement checkoutTitle = chrome.findElement(By.cssSelector(".page-title"));
//        System.out.println(checkoutTitle.getText());

    }
    @When("Customer enters first name")
    public void customer_enters_first_name() {
        WebElement Firstname = chrome.findElement(By.id("BillingNewAddress_FirstName"));
        Firstname.sendKeys("Desi");
    }
    @When("Customer enter last name")
    public void customer_enter_last_name() {
        WebElement Lastname = chrome.findElement(By.id("BillingNewAddress_LastName"));
        Lastname.sendKeys("Lyubomirova");
    }
    @When("Customer enter email")
    public void customer_enter_email() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement Email = chrome.findElement(By.id("BillingNewAddress_Email"));
        Email.sendKeys("desislava.lubomirova.dl@gmail.com");
    }
    @When("Customer enter address1")
    public void customer_enter_address1() {
        WebElement Address = chrome.findElement(By.id("BillingNewAddress_Address1"));
        Address.sendKeys("4719 Commons Dr");
    }
    @When("Customer choose country")
    public void customer_choose_country() {
        WebElement Country1 = chrome.findElement(By.id("BillingNewAddress_CountryId"));
        Country1.sendKeys("United States");

    }

    @When("Customer enter city information")
    public void customer_enter_city_information() {
        WebElement City = chrome.findElement(By.id("BillingNewAddress_City"));
        City.sendKeys("Annandale");
    }
    @When("Customer enter zip")
    public void customer_enter_zip() {
        WebElement Zipcode = chrome.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        Zipcode.sendKeys("22003");
    }
    @When("Customer enter phone")
    public void customer_enter_phone() {
        WebElement Phonenumber = chrome.findElement(By.id("BillingNewAddress_PhoneNumber"));
        Phonenumber.sendKeys("7035379822");
    }
    @When("Customer click on continue")
    public void customer_click_on_continue() {
        WebElement Continue = chrome.findElement(By.cssSelector(".button-1.new-address-next-step-button"));
        Continue.click();
    }
    @Then("Billing tab becomes inactive")
    public void billing_tab_becomes_inactive() {
        WebElement billingTab = chrome.findElement(By.cssSelector("#opc-billing"));
        System.out.println(billingTab.isEnabled());

    }
    @Then("Shipping tab become active")
    public void shipping_tab_become_active() {

    }
    @When("Customer click on pick-up in store checkbox")
    public void customer_click_on_pick_up_in_store_checkbox() throws InterruptedException {
        Thread.sleep(3000);
        WebElement PickUpInStore = chrome.findElement(By.id("PickUpInStore"));

        PickUpInStore.click();
    }
    @When("Customer click on continue button")
    public void customer_click_on_continue_button() {
        WebElement ContinueShipping = chrome.findElement(By.cssSelector("#checkout-step-shipping .button-1.new-address-next-step-button"));
        ContinueShipping.click();
    }
    @Then("Payment method becomes active")
    public void payment_method_becomes_active() {

WebElement billingTab = chrome.findElement(By.cssSelector("opc-shipping_method"));
        System.out.println(billingTab.isEnabled());
    }
    @When("Customer clicks on payment method continue")
    public void customer_clicks_on_continue() throws InterruptedException {
        Thread.sleep(3000);
        WebElement Continue2 = chrome.findElement(By.cssSelector(".button-1.payment-method-next-step-button"));
        Continue2.click();

    }
    @Then("Payment tab becomes disabled")
    public void payment_tab_becomes_disabled() {

    }
    @Then("Confirm page becomes active")
    public void confirm_page_becomes_active() {

    }

    @When("Customer click on payment info continue button")
    public void customer_click_on_payment_info_continue_button() throws InterruptedException {
        Thread.sleep(1000);
        WebElement Continue3 = chrome.findElement(By.cssSelector(".button-1.payment-info-next-step-button"));
        Continue3.click();
    }

    @When("Customer click on confirm")
    public void customer_click_on_confirm() throws InterruptedException {
        Thread.sleep(3000);
        WebElement Confirmbutton = chrome.findElement(By.cssSelector(".button-1.confirm-order-next-step-button"));
        Confirmbutton.click();
    }
    @Then("Order number is generated")
    public void order_number_is_generated() {

    }
}
