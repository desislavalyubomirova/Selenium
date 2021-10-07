package Weeek1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplay {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com/141-inch-laptop");
        WebElement reviewtLink = chrome.findElement(By.partialLinkText("Add your review"));
        System.out.println(reviewtLink.isDisplayed());

    }
}
