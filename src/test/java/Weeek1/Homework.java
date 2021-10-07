package Weeek1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.smartcardio.CardTerminal;

public class Homework {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
            chrome.get("https://www.amazon.com/");
        WebElement searchBar = chrome.findElement(By.id("twotabsearchtextbox"));
        searchBar.sendKeys(" Shoes");
        searchBar.submit();
        WebElement productLink = chrome.findElement(By.partialLinkText("Men's 623 V3 Casual Comfort Cross Trainer"));
        productLink.click();
        WebElement addToCartlButton =  chrome.findElement(By.name("Men's 623 V3 Casual Comfort Cross Trainer"));
        addToCartlButton.click();
        WebElement cartLink = chrome.findElement(By.partialLinkText("1 item in cart"));
        cartLink.click();
        WebElement checkOut =  chrome.findElement(By.name("proceedToRetailCheckout"));
        checkOut.click();
        WebElement emailBar =  chrome.findElement(By.name("email"));
        emailBar.sendKeys("desislava.lubomirova.dl@gmail.com");
        WebElement continueButton = chrome.findElement(By.id("continue"));
        continueButton.click();




    }
}
