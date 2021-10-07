package Weeek1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3 {
    public static void main(String[] args) {
        // DROP DOWN
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.amazon.com/");
        Select categories = new Select(chrome.findElement((By.id("searchDrpdownBox"))));
        categories.selectByVisibleText("Appliances");

    }
}
