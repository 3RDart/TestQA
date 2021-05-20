package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Тест 1. Проверка операций с целыми числами.
public class Case1 {
    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.findElement(By.cssSelector ("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector ("div.XRsWPe.AOvabd")).sendKeys("", Keys.NUMPAD5);
        //driver.quit();
    }
}