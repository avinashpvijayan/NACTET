package NACTET;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yathra {
    public static void main(String[] args) 
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yatra.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int lc = links.size();
        System.out.println("Total number of Links: " + lc);
        driver.quit();
    }
}

