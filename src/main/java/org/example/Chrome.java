package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Chrome {

    public static void chromeDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M.TAG\\selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.google.com");
        String title = webDriver.getTitle();
        Assertions.assertTrue(title.contains("Google"));
        try {
            Thread.sleep(3333);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        webDriver.quit();
    }
}
