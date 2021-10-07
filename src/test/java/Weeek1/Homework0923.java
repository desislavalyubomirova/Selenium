package Weeek1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework0923 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com");
        WebElement booksLink = chrome.findElement(By.partialLinkText("Books"));
        booksLink.click();
        Select view = new Select(chrome.findElement((By.name("products-viewmode"))));
        view.selectByVisibleText("List");
        Select sortBy = new Select(chrome.findElement((By.name("products-orderby"))));
        sortBy.selectByVisibleText("Price: Low to High");
        WebElement addBook = chrome.findElement(By.partialLinkText("Computing and Internet"));
        addBook.click();
        WebElement addToCart = chrome.findElement(By.id("add-to-cart-button-13"));
        addToCart.click();
        WebElement shoppingCart = chrome.findElement(By.id("topcartlink"));
        shoppingCart.click();
        WebElement checkBox = chrome.findElement(By.id("termsofservice"));
        checkBox.click();
        WebElement checkOut = chrome.findElement(By.id("checkout"));
        checkOut.click();
        WebElement checkoutAsGuest = chrome.findElement(By.cssSelector(".button-1.checkout-as-guest-button"));
        checkoutAsGuest.click();
        WebElement firstName = chrome.findElement(By.name("BillingNewAddress.FirstName"));
        firstName.sendKeys("desislava");
        WebElement lastName = chrome.findElement(By.name("BillingNewAddress.LastName"));
        lastName.sendKeys(" lubomirova");
        WebElement emailAddress = chrome.findElement(By.id("BillingNewAddress_Email"));
        emailAddress.sendKeys("desislava.lubomirova@gmail.com");
        Select country = new Select(chrome.findElement(By.id("BillingNewAddress_CountryId")));
        country.selectByVisibleText("United States");
        //Select state = new Select(chrome.findElement(By.cssSelector("#BillingNewAddress_StateProvinceId")));
       // state.selectByIndex(2);
        WebElement city = chrome.findElement(By.name("BillingNewAddress.City"));
        city.sendKeys("Fairfax");
        WebElement address = chrome.findElement(By.id("BillingNewAddress_Address1"));
        address.sendKeys("9196 Barrick");
        WebElement postalCode = chrome.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        postalCode.sendKeys("22031");
        WebElement phoneNumber = chrome.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phoneNumber.sendKeys("703-537-9822");
        WebElement selectBillingAddress = chrome.findElement(By.cssSelector("#billing-buttons-container .button-1.new-address-next-step-button"));
        selectBillingAddress.click();
        //WebElement checkingBox = chrome.findElement(By.name("PickUpInStore"));
       // checkingBox.click();
        Thread.sleep(2000);
        WebElement pickUpCheckBox = chrome.findElement(By.cssSelector("#PickUpInStore"));
        pickUpCheckBox.click();
        Thread.sleep(1000);
        WebElement shippingContinue = chrome.findElement(By.cssSelector("#checkout-step-shipping .button-1.new-address-next-step-button"));
       shippingContinue.click();
        WebElement creditCard = chrome.findElement(By.id("paymentmethod_2"));
        creditCard.click();
        WebElement continueButton3 = chrome.findElement(By.partialLinkText("Continue"));
        continueButton3.click();
        Select cardType = new Select(chrome.findElement((By.id("CreditCardType"))));
        cardType.selectByValue("Visa");
        Select expMonth = new Select(chrome.findElement((By.id("ExpireMonth"))));
        cardType.selectByValue("2");
        Select expYear = new Select(chrome.findElement((By.id("ExpireYear"))));
        cardType.selectByValue("2022");
        WebElement continueButton4 = chrome.findElement(By.partialLinkText("Continue"));
        continueButton4.click();









    }



    }

