package webDriverTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.praktikum.OrderForPage;

import java.util.concurrent.TimeUnit;

import static ru.yandex.praktikum.Main.*;
import static ru.yandex.praktikum.Main.fillOrderPageFields;


//Тесты оформления заказа в браузере Chrome

public class MakeOrderTests {

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
    public void makeOrderTestPositiveUpperButtonChrome() {
        setUpChrome();
        openSamokat(webDriver);
        clickMakeOrderUpperButton(webDriver);
        fillOrderPageFields(webDriver, OrderForPage.namePetya, OrderForPage.surnamePetya, "Рябиновая 57", "79563327766");
        fillRentAboutPage(webDriver,"Привезите утром или в обед", "29.02.2023");
        orderMadeCheck(webDriver);
    }

    @Test
    public void makeOrderTestPositiveLowerButtonChrome() {

        setUpChrome();
        openSamokat(webDriver);
        clickMakeOrderLowerButton(webDriver);
        fillOrderPageFields(webDriver, OrderForPage.namePetya, OrderForPage.surnamePetya, "Рябиновая 57", "79563327766");
        fillRentAboutPage(webDriver,"Привезите утром или в обед", "29.02.2023");
        orderMadeCheck(webDriver);
    }

    @Test
    public void makeOrderTestNegativeUpperButtonChrome() {
        setUpChrome();
        openSamokat(webDriver);
        clickMakeOrderUpperButton(webDriver);
        fillOrderPageFields(webDriver, OrderForPage.nameVasya, OrderForPage.surnameVasya, "Рябиновая 57", "79563327766");
        fillRentAboutPageNegative(webDriver);
    }

    @Test
    public void makeOrderTestNegativeLowerButtonChrome() {
        setUpChrome();
        openSamokat(webDriver);
        clickMakeOrderLowerButton(webDriver);
        fillOrderPageFields(webDriver, OrderForPage.nameVasya, OrderForPage.surnameVasya, "Рябиновая 57", "79563327766");
        fillRentAboutPageNegative(webDriver);
    }

    //Тесты оформления заказа в браузере Mozilla
    @Test
    public void makeOrderTestPositiveUpperButtonMozilla() {

        setUpMozilla();
        openSamokat(webDriver);
        clickMakeOrderUpperButton(webDriver);
        fillOrderPageFields(webDriver, OrderForPage.namePetya, OrderForPage.surnamePetya, "Рябиновая 57", "79563327766");
        fillRentAboutPage(webDriver,"Привезите утром или в обед", "29.02.2023");
        orderMadeCheck(webDriver);
    }

    @Test
    public void makeOrderTestPositiveLowerButtonMozilla() {

        setUpMozilla();
        openSamokat(webDriver);
        clickMakeOrderLowerButton(webDriver);
        fillOrderPageFields(webDriver, OrderForPage.namePetya, OrderForPage.surnamePetya, "Рябиновая 57", "79563327766");
        fillRentAboutPage(webDriver,"Привезите утром или в обед", "29.02.2023");
        orderMadeCheck(webDriver);
    }

    @Test
    public void makeOrderTestNegativeUpperButtonMozilla() {
        setUpMozilla();
        openSamokat(webDriver);
        clickMakeOrderUpperButton(webDriver);
        fillOrderPageFields(webDriver, OrderForPage.nameVasya, OrderForPage.surnameVasya, "Рябиновая 57", "79563327766");
        fillRentAboutPageNegative(webDriver);
    }

    @Test
    public void makeOrderTestNegativeLowerButtonMozilla() {
        setUpMozilla();
        openSamokat(webDriver);
        clickMakeOrderLowerButton(webDriver);
        fillOrderPageFields(webDriver, OrderForPage.nameVasya, OrderForPage.surnameVasya, "Рябиновая 57", "79563327766");
        fillRentAboutPageNegative(webDriver);
    }
}