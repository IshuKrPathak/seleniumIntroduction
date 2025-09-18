package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
    public static void main(String[] args) {

        //setting the path of chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pishu\\Desktop\\framework\\seleniumIntroduction\\src\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //getting the url
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        //findig an element on URL and send input
        driver.findElement(By.id("username")).sendKeys("Ishu Kumar Pathak");
        driver.findElement(By.id("password")).sendKeys("Ishu123");
        driver.findElement(By.className("checkmark")).click();
        driver.findElement(By.className("signInBtn")).click();


        
    }


}
