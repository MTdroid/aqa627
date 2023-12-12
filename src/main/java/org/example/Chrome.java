package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

    public static void chromeDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M.TAG\\selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.google.com");
        String title = webDriver.getTitle();
        Assertions.assertTrue(title.contains("Google"));
        Thread.sleep(1600);
        webDriver.quit();
    }
}
