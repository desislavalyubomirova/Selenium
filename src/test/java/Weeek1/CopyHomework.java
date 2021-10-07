package Weeek1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CopyHomework {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com//");

        WebElement Books = chrome.findElement(By.partialLinkText("Books"));
        Books.click();
        WebElement Sortby = chrome.findElement(By.id("products-orderby"));
        Sortby.sendKeys("Price: Low to High");
        WebElement ViewAs = chrome.findElement(By.id("products-viewmode"));
        ViewAs.sendKeys("List");
        List<WebElement> addToCarts = chrome.findElements(By.cssSelector(".button-2.product-box-add-to-cart-button"));
        WebElement addToCart1 = addToCarts.get(0);
        addToCart1.click();
        WebElement ClicAddcart = chrome.findElement(By.id("topcartlink"));
        ClicAddcart.click();
        WebElement Country = chrome.findElement(By.id("CountryId"));
        Country.sendKeys("United States");
        WebElement Iagreebutton = chrome.findElement(By.id("termsofservice"));
        Iagreebutton.click();
        WebElement Checkout = chrome.findElement(By.id("checkout"));
        Checkout.click();
        WebElement CheckoutasGuest = chrome.findElement(By.cssSelector(".button-1.checkout-as-guest-button"));
        CheckoutasGuest.click();
        WebElement Firstname = chrome.findElement(By.id("BillingNewAddress_FirstName"));
        Firstname.sendKeys("Desi");
        WebElement Lastname = chrome.findElement(By.id("BillingNewAddress_LastName"));
        Lastname.sendKeys("Lyubomirova");
        WebElement Email = chrome.findElement(By.id("BillingNewAddress_Email"));
        Email.sendKeys("desislava.lubomirova.dl@gmail.com");
        WebElement Country1 = chrome.findElement(By.id("BillingNewAddress_CountryId"));
        Country1.sendKeys("United States");
        WebElement City = chrome.findElement(By.id("BillingNewAddress_City"));
        City.sendKeys("Annandale");
        WebElement Address = chrome.findElement(By.id("BillingNewAddress_Address1"));
        Address.sendKeys("4719 Commons Dr");
        WebElement Zipcode = chrome.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        Zipcode.sendKeys("22003");
        WebElement Phonenumber = chrome.findElement(By.id("BillingNewAddress_PhoneNumber"));
        Phonenumber.sendKeys("7035379822");
        WebElement Continue = chrome.findElement(By.cssSelector(".button-1.new-address-next-step-button"));
        Continue.click();
        Thread.sleep(2000);
        WebElement PickUpInStore = chrome.findElement(By.id("PickUpInStore"));
        PickUpInStore.click();
        Thread.sleep(2000);
        WebElement ContinueShipping = chrome.findElement(By.cssSelector("#checkout-step-shipping .button-1.new-address-next-step-button"));
        ContinueShipping.click();
        Thread.sleep(1000);
        WebElement Continue2 = chrome.findElement(By.cssSelector(".button-1.payment-method-next-step-button"));
        Continue2.click();
        Thread.sleep(1000);
        WebElement Continue3 = chrome.findElement(By.cssSelector(".button-1.payment-info-next-step-button"));
        Continue3.click();
        Thread.sleep(1000);
        WebElement Confirmbutton = chrome.findElement(By.cssSelector(".button-1.confirm-order-next-step-button"));
        Confirmbutton.click();

        Thread.sleep(10000);
        WebElement textContainer = chrome.findElement(By.cssSelector(".section.order-completed"));
        String rawText = textContainer.getText();
        System.out.println(rawText);


    }
}
