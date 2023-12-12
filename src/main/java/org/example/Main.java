package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M.TAG\\selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.wildberries.ru");
        Dimension d = new Dimension(1920,1080);
        webDriver.manage().window().setSize(d);

        WebElement searchLine = webDriver.findElement(By.id("searchInput"));
        WebElement searchBtn = webDriver.findElement(By.id("applySearchBtn"));

        Thread.sleep(400);
        searchLine.sendKeys("мобильный телефон");
        searchBtn.click();

        Thread.sleep(400);
        WebElement firstElement = webDriver.findElement(By.xpath("//article[@data-nm-id][1]"));
        firstElement.click();

        Thread.sleep(400);
        WebElement bucket = webDriver.findElement(By.xpath("//div[@class='product-page__order-buttons']"));
        bucket.click();

        Thread.sleep(400);
        WebElement goToBucket = webDriver.findElement(By.xpath("//span[@class='navbar-pc__icon navbar-pc__icon--basket']"));
        goToBucket.click();

        WebElement phoneAssert = webDriver.findElement(By.xpath("//h1[@class='basket-section__header active']"));
        phoneAssert.getAttribute("data-count");

        Assertions.assertEquals(phoneAssert.getAttribute("data-count"),"1");

        webDriver.quit();
    }
}
