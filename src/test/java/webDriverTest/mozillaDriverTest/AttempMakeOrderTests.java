/*package webDriverTest.mozillaDriverTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.praktikum.Main;
import ru.yandex.praktikum.OrderForPage;

import java.util.concurrent.TimeUnit;

import static ru.yandex.praktikum.Main.*;

//Тесты оформления заказа в браузере Mozilla
public class MakeOrderTests {
    WebDriver webDriver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/Users/artembragin/Documents/geckodriver");
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() {
        webDriver.quit();
    }


    @Test
    public void makeOrderTestPositiveUpperButton() {
        Main mainPage = new Main(webDriver);

        openSamokat();
        clickMakeOrderUpperButton();
        fillOrderPageFields(OrderForPage.namePetya, OrderForPage.surnamePetya, "Рябиновая 57", "79563327766");
        fillRentAboutPage("Привезите утром или в обед", "29.02.2023");
        orderMadeCheck();
    }

    @Test
    public void makeOrderTestPositiveLowerButton() {
        Main mainPage = new Main(webDriver);

        openSamokat();
        clickMakeOrderLowerButton();
        fillOrderPageFields(OrderForPage.namePetya, OrderForPage.surnamePetya, "Рябиновая 57", "79563327766");
        fillRentAboutPage("Привезите утром или в обед", "29.02.2023");
        orderMadeCheck();
    }

    @Test
    public void makeOrderTestNegativeUpperButton() {
        Main mainPage = new Main(webDriver);

        openSamokat();
        clickMakeOrderUpperButton();
        fillOrderPageFields(OrderForPage.nameVasya, OrderForPage.surnameVasya, "Рябиновая 57", "79563327766");
        fillRentAboutPageNegative("Привезите утром или в обед", "29.02.2023");
        orderNotMadeCheck();
    }

    @Test
    public void makeOrderTestNegativeLowerButton() {
        Main mainPage = new Main(webDriver);

        openSamokat();
        clickMakeOrderLowerButton();
        fillOrderPageFields(OrderForPage.nameVasya, OrderForPage.surnameVasya, "Рябиновая 57", "79563327766");
        fillRentAboutPageNegative("Привезите утром или в обед", "29.02.2023");
        orderNotMadeCheck();
    }
}*/
