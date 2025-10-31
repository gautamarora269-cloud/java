package mypackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstTestCase {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", 
            "C:\\Users\\priya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        RemoteWebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");

        String title = driver.getTitle();
        System.out.println("Page Title : " + title);

        System.out.println("URL: " + driver.getCurrentUrl());

        // driver.quit();
    }
}
