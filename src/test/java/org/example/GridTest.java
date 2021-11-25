package org.example;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridTest {

    public static void main(String[] args) throws MalformedURLException {
        // 1- Desired Capabilities olustur
        DesiredCapabilities cap = new DesiredCapabilities();

        // Desired Capabilities icinde 3 sey tanimlayabiliriz

        // a) Browser
        cap.setBrowserName("chrome");

        // b) Operating System(isletim sistemi)
        cap.setPlatform(Platform.WINDOWS);

        // c) Browser Version
        //cap.setVersion("96.0.4664.45");

        ChromeOptions options = new ChromeOptions();

        String hubUrl = "http://192.168.0.33:4444/wd/hub";

        WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());


    }
}
