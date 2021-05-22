package Options;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.openqa.selenium.support.PageFactory.initElements;

public class Cases_options {
    //Строка поиска
    @FindBy(css = "input.gLFyf.gsfi")
    public WebElement searchInput;
    //Далее идут элементы ввода и управления кальклятором
    @FindBy (xpath ="//div[@jsname='N10B9']")
    public WebElement num_1;
    @FindBy (xpath ="//div[@jsname='lVjWed']")
    public WebElement num_2;
    @FindBy (xpath ="//div[@jsname='KN1kY']")
    public WebElement num_3;
    @FindBy (xpath ="//div[@jsname='xAP7E']")
    public WebElement num_4;
    @FindBy (xpath ="//div[@jsname='Ax5wH']")
    public WebElement num_5;
    @FindBy (xpath ="//div[@jsname='abcgof']")
    public WebElement num_6;
    @FindBy (xpath ="//div[@jsname='rk7bOd']")
    public WebElement num_7;
    @FindBy (xpath ="//div[@jsname='T7PMFe']")
    public WebElement num_8;
    @FindBy (xpath ="//div[@jsname='XoxYJ']")
    public WebElement num_9;
    @FindBy (xpath ="//div[@jsname='bkEvMb']")
    public WebElement num_0;
    @FindBy (xpath ="//div[@jsname='YrdHyf']")
    public WebElement sym_dat;
    //Символ =
    @FindBy (xpath ="//div[@jsname='Pt8tGc']")
    public WebElement sym_eq;
    //Символ процента
    @FindBy (xpath ="//div[@jsname='F0gbu']")
    public WebElement sym_proc;
    //Символ скобка (
    @FindBy (xpath ="//div[@jsname='j93WEe']")
    public WebElement sym_9;
    //Символ скобка )
    @FindBy (xpath ="//div[@jsname='qCp9A']")
    public WebElement sym_0;
    @FindBy (xpath ="//div[@jsname='H7sWPd']")
    public WebElement sym_CE;
    @FindBy (xpath ="//div[@jsname='WxTTNd']")
    public WebElement sym_del;
    @FindBy (xpath ="//div[@jsname='YovRWb']")
    public WebElement sym_x;
    @FindBy (xpath ="//div[@jsname='pPHzQc']")
    //Знак минус
    public WebElement sym_min;
    @FindBy (xpath ="//div[@jsname='XSr6wc']")
    public WebElement sym_plus;
    @FindBy (xpath ="//div[@jsname='aN1RFf']")
    public WebElement fun_sin;

    public Cases_options(WebDriver driver) {
        initElements(driver, this);
    }
    //ВВод и поиск укороченный вариант
    public void search (String text){
        searchInput.sendKeys(text, Keys.ENTER);
    }
}
