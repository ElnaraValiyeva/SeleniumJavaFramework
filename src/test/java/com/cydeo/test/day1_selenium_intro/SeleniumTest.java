package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        //1 - Setting up th web driver manager
        WebDriverManager.chromedriver().setup();
       // System.setProperty("webdriver.chrome.driver","/Users/cybertek/Desktop/chromedriver");

        //2- Create instance of chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");



    }
}
