package Weeek1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com/");
        WebElement productLink = chrome.findElement(By.partialLinkText("14.1-inch Laptop"));
        productLink.click();
                WebElement addToCart  =  chrome.findElement(By.id("add-to-cart-button-31"));
                addToCart.click();
        WebElement shoppingCart = chrome.findElement(By.id("topcartlink"));
                shoppingCart.click();
        Select country = new Select(chrome.findElement((By.id("CountryId"))));
        country.selectByVisibleText("United States");
        WebElement checkBox = chrome.findElement(By.id("termsofservice"));
        checkBox.click();
    }
}
