package org.example;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
    public static void main(String[] args) throws InterruptedException {
        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Step 1: Open E-commerce site
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

       
        System.out.println("Title: " + driver.getTitle());


        WebElement product = driver.findElement(By.linkText("Samsung galaxy s6"));
        product.click();
        Thread.sleep(3000);

        // Step 3: Add to cart (optional)
        WebElement addToCartBtn = driver.findElement(By.xpath("//a[text()='Add to cart']"));
        addToCartBtn.click();
        Thread.sleep(3000);

        // // Handle alert
        // driver.switchTo().alert().accept();
        // Thread.sleep(2000);


        
        driver.findElement(By.id("login2")).click();
        Thread.sleep(2000);


        driver.findElement(By.id("loginusername")).sendKeys("testuser");
        driver.findElement(By.id("loginpassword")).sendKeys("testpass");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(3000);


        WebElement logout = driver.findElement(By.id("logout2"));
        logout.click();
        Thread.sleep(2000);

        System.out.println("Logout successful.");


        driver.quit();
    }
}
