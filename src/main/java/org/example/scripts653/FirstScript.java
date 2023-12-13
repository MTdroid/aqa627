package org.example.scripts653;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstScript {

    public static void script(WebDriver webDriver) {

        WebElement iframe = webDriver.findElement(By.xpath("//a[@href='/iframe']"));
        iframe.click();

        webDriver.switchTo().frame("mce_0_ifr");

        WebElement textField = webDriver.findElement(By.xpath("//body[@id='tinymce']"));
        textField.clear();
        textField.sendKeys("Hello World");

        webDriver.switchTo().defaultContent();
        WebElement boldText =webDriver.findElement(By.xpath("//button[@aria-label='Bold']"));

        boldText.click();

        webDriver.quit();
    }
}
