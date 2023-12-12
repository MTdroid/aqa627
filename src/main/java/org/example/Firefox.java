package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

    public static void firefoxDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M.TAG\\selenium\\firefox\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("http://www.google.com");
        String title = webDriver.getTitle();
        Assertions.assertTrue(title.contains("Google"));
        Thread.sleep(1600);
        webDriver.quit();
    }
}
