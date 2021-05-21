package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.pagefactory.ByAll;

//Тест 1. Проверка операций с целыми числами.
public class Case1 {
    private static WebDriver driver;
    @BeforeAll
    public static void init(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }
    @Test
    public void case1(){
        driver.get("http://google.com");
        driver.findElement(By.cssSelector ("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        //driver.findElements(By.cssSelector ("div.XRsWPe.AOvabd. 2")). click();
        driver.findElement (By.xpath("//div[@jsname='xAP7E']")). click();
    }
//@AfterAll
public static void fulldown() {
    driver.quit();
}
}
