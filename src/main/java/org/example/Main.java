package org.example;

import org.example.scripts653.FirstScript;
import org.example.scripts653.SecondScript;
import org.example.scripts653.ThirdScript;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        FirstScript.script(beforeEach("frames"));
        SecondScript.script(beforeEach("windows"));
        ThirdScript.script(beforeEach("javascript_alerts"));
    }

    public static WebDriver beforeEach(String link){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M.TAG\\selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://the-internet.herokuapp.com/"+link);
        Dimension d = new Dimension(1920,1080);
        webDriver.manage().window().setSize(d);
        return webDriver;
    }
}
