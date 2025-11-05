package com.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://live.astroindusoot.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
