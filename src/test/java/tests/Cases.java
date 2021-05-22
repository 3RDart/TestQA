package tests;

import Options.Cases_options;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Cases {
    private static WebDriver driver;
    private static Cases_options cases_options;
    @BeforeAll
    public static void init(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        cases_options = new Cases_options(driver);
    }
    @Test
    //Кейс1. Проверка операций с целыми числами.
    public void case1(){
        driver.get("http://google.com");
        cases_options.search("Калькулятор");
        cases_options.sym_9.click();
        cases_options.num_1.click();
        cases_options.sym_plus.click();
        cases_options.num_2.click();
        cases_options.sym_0.click();
        cases_options.sym_x.click();
        cases_options.num_3.click();
        cases_options.sym_min.click();
        cases_options.num_4.click();
        cases_options.num_0.click();
        cases_options.sym_del.click();
        cases_options.num_5.click();
        cases_options.sym_eq.click();
    }
    @Test
    //Кейс 2. Проверка деления на ноль.
    public void case2(){
        driver.get("http://google.com");
        cases_options.search("Калькулятор");
    cases_options.num_6.click();
    cases_options.sym_del.click();
    cases_options.num_0.click();
    cases_options.sym_eq.click();
    }
    @Test
    //Кейс 3. Проверка ошибки при отсутствии значения
    public void case3() {
        driver.get("http://google.com");
        cases_options.search("Калькулятор");
        cases_options.fun_sin.click();
        cases_options.sym_eq.click();
    }
//@AfterAll
public static void fulldown() {
            driver.quit();
}
}
