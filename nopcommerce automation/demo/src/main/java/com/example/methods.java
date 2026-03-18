package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class methods {

    public static void navigatetoWebsite(WebDriver driver, String url) throws InterruptedException{
        driver.get(url);
        Thread.sleep(3000);
    }

    public static void click(WebDriver driver, By locator) throws InterruptedException{
        WebElement element= driver.findElement(locator);
        element.click();
        Thread.sleep(3000);

    }

    public static void resister_page(WebDriver driver,String gender,String firstName, String lastName, String email,String company, String password, String confpassword) throws InterruptedException{
        if(gender.equals("Male")){
            driver.findElement(By.xpath("//span[@class='male']")).click();
        }else{
            driver.findElement(By.xpath("//span[@class='female']")).click();
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(firstName);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lastName);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys(company);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(confpassword);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Register']")).click();
        

        Thread.sleep(3000);

    }

    public static void login_page(WebDriver driver, String email, String password) throws InterruptedException{
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(3000);

    }
//     Login was unsuccessful. Please correct the errors and try again.
// No customer account found
// //div[@class='message-error validation-summary-errors']
    
}
