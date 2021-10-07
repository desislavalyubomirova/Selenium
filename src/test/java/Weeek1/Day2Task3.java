package Weeek1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.google.com/");
        WebElement searchBar =  chrome.findElement(By.name("q"));
        searchBar.sendKeys("Toys");
        searchBar.submit();
        WebElement imageLink = chrome.findElement(By.partialLinkText("Images"));
        imageLink.click();
        WebElement link = chrome.findElement(By.name("WHTf8b"));
        link.click();



    }
}
