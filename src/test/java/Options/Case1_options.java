package Options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.openqa.selenium.support.PageFactory.initElements;

public class Case1_options {
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement num_1;
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement num_2;
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement num_3;
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement num_4;
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement num_5;
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement num_6;
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement num_7;
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement num_8;
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement num_9;
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement num_0;
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement sym_dat;
    //Символ =
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement sym_eq;
    //Символ процента
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement sym_proc;
    //Символ скобка (
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement sym_9;
    //Символ скобка )
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement sym_0;
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement sym_CE;
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement sym_del;
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement sym_x;
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement sym_min;
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement sym_plus;
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement fun_sin;


    public Case1_options(WebDriver driver) {
        initElements(driver, this);
    }
}
