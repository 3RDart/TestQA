package Options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.openqa.selenium.support.PageFactory.initElements;

public class Case1_options {
    @FindBy (css ="")
    public WebElement Enter_numbers;
    public Case1_options(WebDriver driver) {
        initElements(driver, this);
    }
}
