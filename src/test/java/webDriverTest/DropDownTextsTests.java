package webDriverTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

import static ru.yandex.praktikum.Main.*;


//Тесты текстов кнопок "Вопросы о важном" в браузер Chrome
public class DropDownTextsTests {

    public void setUpChrome() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void setUpMozilla() {
        System.setProperty("webdriver.gecko.driver", "/Users/artembragin/Documents/geckodriver");
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }



    @Test
    public void firstDropDownTextCheckChrome() {
        setUpChrome();
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, dropDownFirstButton);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, firstActualText, firstExpectedText);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void secondDropDownTextCheckChrome() {
        setUpChrome();
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, dropDownSecondButton);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, secondActualText, secondExpectedText);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void thirdDropDownTextCheckChrome() {
        setUpChrome();
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, dropDownThirdButton);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, thirdActualText, thirdExpectedText);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void fourthDropDownTextCheckChrome() {
        setUpChrome();
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, dropDownFourthButton);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, fourthActualText, fourthExpectedText);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void fifthDropDownTextCheckChrome() {
        setUpChrome();
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, dropDownFifthButton);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, fifthActualText, fifthExpectedText);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void sixthDropDownTextCheckChrome() {
        setUpChrome();
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, dropDownSixthButton);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, sixthActualText, sixthExpectedText);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void seventhDropDownTextCheckChrome() {
        setUpChrome();
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, dropDownSeventhButton);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, seventhActualText, seventhExpectedText);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void eighthDropDownTextCheckChrome() {
        setUpChrome();
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, dropDownEighthButton);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, eighthActualText, eighthExpectedText);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void firstDropTextCheckMozilla() {
        setUpMozilla();
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, dropDownFirstButton);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, firstActualText, firstExpectedText);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void secondDropTextCheckMozilla() {
        setUpMozilla();
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, dropDownSecondButton);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, secondActualText, secondExpectedText);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void thirdDropTextCheckMozilla() {
        setUpMozilla();
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, dropDownThirdButton);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, thirdActualText, thirdExpectedText);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void fourthDropTextCheckMozilla() {
        setUpMozilla();
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, dropDownFourthButton);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, fourthActualText, fourthExpectedText);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void fifthDropTextCheckMozilla() {
        setUpMozilla();
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, dropDownFifthButton);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, fifthActualText, fifthExpectedText);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void sixthDropTextCheckMozilla() {
        setUpMozilla();
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, dropDownSixthButton);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, sixthActualText, sixthExpectedText);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void seventhDropTextCheckMozilla() {
        setUpMozilla();
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, dropDownSeventhButton);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, seventhActualText, seventhExpectedText);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void eighthDropTextCheckMozilla() {
        setUpMozilla();
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, dropDownEighthButton);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, eighthActualText, eighthExpectedText);   //Сравнение актуального и ожидаемого текста
    }
}