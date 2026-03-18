package com.example;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        testcases test = new testcases(driver);
        //test_cases test = new test_cases(driver);
        //test.TestCase1();
        
        test.testCase1();
       // test.testCase2();
       // test.testCase3();
       // test.testCase4();
       // test.testCase5();
       driver.quit();
    }
}