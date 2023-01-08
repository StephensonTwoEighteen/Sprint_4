package webDriverTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.Main;

import static ru.yandex.praktikum.Main.*;
import static ru.yandex.praktikum.OrderForPage.*;
import static ru.yandex.praktikum.RentAboutPage.*;

//В данном классе представлены два параметризованных теста, на верхнюю и нижнюю кнопку Заказать (makeOrderUpperButtonParamsTest и makeOrderLowerButtonParamsTest)
@RunWith(Parameterized.class)
public class ParamsTest extends TestBase{

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Вася", "Петров", "Рябиновая 55", "79873322445", "Привет", "29.03.2023"},
                {"Petya", "Ivanov", "Мира 211", "79873388841", "Здравствуй", "10.01.2023"},
                {"Ваня", "Сидоров", "Новозаводская 15в", "79873777741", "Хеллоу", "15.02.2023"}
        };
    }

    private final Main MAIN;
    private final String NAME;
    private final String SURNAME;
    private final String ADDRESS;
    private final String PHONE_NUMBER;
    private final String COMMENT;
    private final String DATE;


        public ParamsTest(String name, String surname, String address, String phoneNumber, String comment, String date) {
            this.MAIN = new Main();
            this.NAME = name;
            this.SURNAME = surname;
            this.ADDRESS = address;
            this.PHONE_NUMBER = phoneNumber;
            this.COMMENT = comment;
            this.DATE = date;
        }

        //Параметризованные тесты для верхней и нижней кнопок Заказать
        @Test
        public void makeOrderUpperButtonParamsTest() {
            openSamokat(webDriver);
            clickMakeOrderUpperButton(webDriver);
            fillOrderPageFields(webDriver, NAME, SURNAME, ADDRESS, PHONE_NUMBER);
            fillRentAboutPage(webDriver, COMMENT, DATE);
            orderMadeCheck(webDriver);
        }

    @Test
    public void makeOrderLowerButtonParamsTest() {
        openSamokat(webDriver);
        clickMakeOrderLowerButton(webDriver);
        fillOrderPageFields(webDriver, NAME, SURNAME, ADDRESS, PHONE_NUMBER);
        fillRentAboutPage(webDriver, COMMENT, DATE);
        orderMadeCheck(webDriver);
    }
    }

