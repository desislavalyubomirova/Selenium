package Weeek1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com/");
        WebElement searchBar =  chrome.findElement(By.id("small-searchterms"));
        searchBar.sendKeys("Computing");
        searchBar.submit();
        WebElement link = chrome.findElement(By.partialLinkText("Computing and Internet"));
        link.click();

    }
}
