package org.example.scripts653;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecondScript {

    public static void script(WebDriver webDriver) {

        WebElement newWindow = webDriver.findElement(By.xpath("//a[@href='/windows/new']"));
        newWindow.click();

        String originalHandle = webDriver.getWindowHandle();

        for(String handle : webDriver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                webDriver.switchTo().window(handle);
            }
        }

        String title = webDriver.getTitle();
        Assertions.assertTrue(title.contains("New Window"));
        webDriver.close();

        webDriver.switchTo().window(originalHandle);
        Assertions.assertEquals(webDriver.getCurrentUrl(),"https://the-internet.herokuapp.com/windows");

        webDriver.quit();
    }
}
