package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class Edge {

    public static void edgeDriver()  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M.TAG\\selenium\\edge\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
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
