package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class test_cases {
     WebDriver driver;

    public test_cases(WebDriver driver) {
        this.driver = driver;
    }
    public void TestCase1() throws InterruptedException {
        System.out.println("test case 1 started");
        driver.get("https://demo.nopcommerce.com/");
        Boolean logo= driver.findElement(By.xpath("//div[@class='header-logo']")).isDisplayed();
        Thread.sleep(3000);
        Assert.assertTrue(logo, "Logo is not displayed");
        System.out.println("Logo is displaying");
        System.out.println("test case 1 completed");
    }
    public void TestCase2() throws InterruptedException {
        System.out.println("test case 2 started");
        Thread.sleep(3000);
        testmethods.navigatetoWebsite(driver, "https://demo.nopcommerce.com/"); 
        Thread.sleep(5000);
        testmethods.click(driver, By.className("ico-login"));
        Thread.sleep(3000);
        testmethods.login_page(driver, "testuser@example.com", "Password123!");
            Boolean errorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).isDisplayed();
        Assert.assertTrue(errorMessage, "Error message is not displayed");
        System.out.println("Error message is displaying");
        System.out.println("test case 2 completed");
    }
    public void TestCase3() throws InterruptedException {
        System.out.println("test case 3 started");
        Thread.sleep(3000);
        testmethods.navigatetoWebsite(driver, "https://demo.nopcommerce.com/"); 
        Thread.sleep(5000);
        testmethods.click(driver, By.className("ico-register"));
        Thread.sleep(3000);
        testmethods.resister_page(driver, "Male","Test", "User", "testuser@example.com", "abcd","abcd@123", "abcd@123");
        boolean successMessage = driver.findElement(By.xpath("//div[text()='Your registration completed']")).isDisplayed();
        //boolean errorMessage = driver.findElement(By.xpath("//li[text()='The specified email already exists']")).isDisplayed();
        Assert.assertTrue(successMessage, "Registration was not successful");
        System.out.println("Registration was successful");
        testmethods.click(driver, By.xpath("//a[@class='button-1 register-continue-button']"));
        testmethods.click(driver, By.xpath("//a[@class='ico-logout']"));
        System.out.println("test case 3 completed");

    }
    public void TestCase4() throws InterruptedException {
        System.out.println("test case 4 started");
       try{
        Thread.sleep(3000);
        testmethods.navigatetoWebsite(driver, "https://demo.nopcommerce.com/"); 
        Thread.sleep(5000);
        testmethods.click(driver, By.className("ico-login"));
        Thread.sleep(3000);
        testmethods.login_page(driver, "testuser@example.com", "abcd@123");
        testmethods.click(driver, By.xpath("//a[text()='Computers']"));
        testmethods.click(driver, By.xpath("//ul[@class='sublist']/li[2]/a"));
        testmethods.click(driver, By.xpath("//div[@class='item-grid']/div[1]/article/div[2]/h2/a"));
        testmethods.click(driver, By.xpath("//button[@class='button-1 add-to-cart-button']"));
        boolean successMessage = driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).isDisplayed();
        Assert.assertTrue(successMessage, "Product was not added to cart");
        System.out.println("Product was added to cart");
        // testmethods.click(driver, By.xpath("//a[@class='ico-logout']"));
        System.out.println("test case 4 completed");
        Thread.sleep(3000);
        }catch(Exception e){
            System.out.println("Test case 4 failed");
        }
    }
    public void TestCase5() throws InterruptedException {
        System.out.println("test case 5 started");
        try{
        Thread.sleep(3000);
        testmethods.navigatetoWebsite(driver, "https://demo.nopcommerce.com/"); 
        Thread.sleep(2000);
        testmethods.click(driver, By.xpath("//span[@class='cart-label']"));
        testmethods.click(driver, By.xpath("//input[@id='termsofservice']"));
        testmethods.click(driver, By.xpath("//button[@id='checkout']"));
        testmethods.addressform(driver);
        testmethods.click(driver, By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));
        testmethods.click(driver, By.xpath("//button[@class='button-1 payment-method-next-step-button']"));
        testmethods.click(driver, By.xpath("//button[@class='button-1 payment-info-next-step-button']"));
        testmethods.click(driver, By.xpath("//button[@class='button-1 confirm-order-next-step-button']"));
        boolean successMessage = driver.findElement(By.xpath("//div[@class='section order-completed']/h2")).isDisplayed();
        Assert.assertTrue(successMessage, "Order was not completed");
        testmethods.click(driver, By.xpath("//button[@class='button-1 order-completed-continue-button']"));
        System.out.println("Order was completed");
        System.out.println("test case 5 completed");
        Thread.sleep(3000);
        }catch(Exception e){
            System.out.println("Test case 5 failed");
        }
    }


    // //span[@class='cart-label']
    // //input[@id='termsofservice']
    // //button[@id='checkout']

    // //button[@class='button-1 shipping-method-next-step-button']
    // //button[@class='button-1 payment-method-next-step-button']
    // //button[@class='button-1 payment-info-next-step-button']
    // //button[@class='button-1 confirm-order-next-step-button']
    // //div[@class='section order-completed']/h2
    // //button[@class='button-1 order-completed-continue-button']
        


}
