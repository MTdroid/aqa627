package org.example.scripts653;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ThirdScript {

    public static void script(WebDriver webDriver) {

        WebElement jsAlert = webDriver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlert.click();

        String alertText = webDriver.switchTo().alert().getText();
        Assertions.assertEquals(alertText,"I am a JS Alert");
        webDriver.switchTo().alert().accept();

        Assertions.assertThrows(NoAlertPresentException.class, () -> webDriver.switchTo().alert().getText());


        WebElement jsConfirm = webDriver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsConfirm.click();
        webDriver.switchTo().alert().dismiss();

        Assertions.assertThrows(NoAlertPresentException.class, () -> webDriver.switchTo().alert().getText());


        WebElement jsPrompt = webDriver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsPrompt.click();

        webDriver.switchTo().alert().sendKeys("Hello World");
        webDriver.switchTo().alert().accept();

        WebElement resultText = webDriver.findElement(By.id("result"));

        Assertions.assertTrue(resultText.getText().contains("You entered: Hello World"));
        webDriver.quit();
    }
}
