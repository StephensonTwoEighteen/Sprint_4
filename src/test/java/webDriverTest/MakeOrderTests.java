package webDriverTest;

import org.junit.Test;

import ru.yandex.praktikum.OrderForPage;

import static ru.yandex.praktikum.Main.*;
import static ru.yandex.praktikum.OrderForPage.*;
import static ru.yandex.praktikum.RentAboutPage.*;


//Тесты оформления заказов в браузерах Chrome и Mozilla
//Аннотации @before и @After так же представлены в классе TestBase (а так же методы установки браузеров)
//Итого в данном классе имеем 4 теста.
//2 позитивных - 1 на верхнюю кнопку заказать и 1 на нижнюю кнопку заказать ( makeOrderTestPositiveUpperButton и makeOrderTestPositiveLowerButton)
//А так же два негативных, на обе кнопки ( makeOrderTestNegativeUpperButton и makeOrderTestNegativeLowerButton)

public class MakeOrderTests extends TestBase{

    @Test
    public void makeOrderTestPositiveUpperButton() {
        openSamokat(webDriver);
        clickMakeOrderUpperButton(webDriver);
        fillOrderPageFields(webDriver, OrderForPage.namePetya, OrderForPage.surnamePetya, "Рябиновая 57", "79563327766");
        fillRentAboutPage(webDriver,"Привезите утром или в обед", "29.02.2023");
        orderMadeCheck(webDriver);
    }

    @Test
    public void makeOrderTestPositiveLowerButton() {
        openSamokat(webDriver);
        clickMakeOrderLowerButton(webDriver);
        fillOrderPageFields(webDriver, OrderForPage.namePetya, OrderForPage.surnamePetya, "Рябиновая 57", "79563327766");
        fillRentAboutPage(webDriver,"Привезите утром или в обед", "29.02.2023");
        orderMadeCheck(webDriver);
    }

    @Test
    public void makeOrderTestNegativeUpperButton() {
        openSamokat(webDriver);
        clickMakeOrderUpperButton(webDriver);
        fillOrderPageFields(webDriver, OrderForPage.nameVasya, OrderForPage.surnameVasya, "Рябиновая 57", "79563327766");
        fillRentAboutPageNegative(webDriver);
    }

    @Test
    public void makeOrderTestNegativeLowerButton() {
        openSamokat(webDriver);
        clickMakeOrderLowerButton(webDriver);
        fillOrderPageFields(webDriver, OrderForPage.nameVasya, OrderForPage.surnameVasya, "Рябиновая 57", "79563327766");
        fillRentAboutPageNegative(webDriver);
    }
}