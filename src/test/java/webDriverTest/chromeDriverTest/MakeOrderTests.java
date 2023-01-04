package webDriverTest.chromeDriverTest;

import org.junit.Test;
import ru.yandex.praktikum.Main;
import ru.yandex.praktikum.OrderForPage;
import samokatTests.TestBase;

import static ru.yandex.praktikum.Main.*;

//Тесты оформления заказа в браузере Chrome
public class MakeOrderTests extends TestBase {

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
        fillRentAboutPageNegative("Привезите вечером", "00.02.2023");
        orderNotMadeCheck();
    }
}