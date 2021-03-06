package tests;

import Options.Cases_options;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Cases {
    private static WebDriver driver;
    private static Cases_options cases_options;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        cases_options = new Cases_options(driver);
    }
    @BeforeEach
    public void setup() {
          driver.get("http://google.com");
    }
    @Test
    @DisplayName("Кейс1. Проверка операций с целыми числами")
    public void case1() {
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
        //Проверки результатов теста
        assertAll(
                ()-> assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", cases_options.check_Form.getText()),
                ()-> assertEquals("1", cases_options.check_Answer.getText())
        );
        // Пауза чтобы визуально посмотреть результат
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
    }

    @Test
    @DisplayName("Кейс 2. Проверка деления на ноль")
    public void case2() {
        cases_options.search("Калькулятор");
        cases_options.num_6.click();
        cases_options.sym_del.click();
        cases_options.num_0.click();
        cases_options.sym_eq.click();
        //Проверки результатов теста
        assertAll(
                ()-> assertEquals("6 ÷ 0 =", cases_options.check_Form.getText()),
                ()-> assertEquals("Infinity", cases_options.check_Answer.getText())
        );
        // Пауза чтобы визуально посмотреть результат
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
    }

    @Test
    @DisplayName("Кейс 3. Проверка ошибки при отсутствии значения")
    public void case3() {
        cases_options.search("Калькулятор");
        cases_options.fun_sin.click();
        cases_options.sym_eq.click();
        //Проверки результатов теста
        assertAll(
                ()->assertEquals("sin() =", cases_options.check_Form.getText()),
                ()->assertEquals("Error", cases_options.check_Answer.getText())
        );
        // Пауза чтобы визуально посмотреть результат
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
    }

    @AfterAll
    public static void fulldown() {
        driver.quit();
    }
}
