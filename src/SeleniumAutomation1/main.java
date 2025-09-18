package SeleniumAutomation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Selenium Automation!");
        System.getProperty("webdriver.chrome.driver",
                "C:\\Users\\pishu\\Desktop\\framework\\seleniumIntroduction\\src\\Drivers\\chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://www.google.com/");
        Driver.manage().window().maximize();
        Driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        Driver.quit();
    }

}
