package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

    public static void edgeDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M.TAG\\selenium\\edge\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("http://www.google.com");
        String title = webDriver.getTitle();
        Assertions.assertTrue(title.contains("Google"));
        Thread.sleep(1600);
        webDriver.quit();
    }
}
