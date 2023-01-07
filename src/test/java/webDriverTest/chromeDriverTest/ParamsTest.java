package webDriverTest.chromeDriverTest;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.Main;

import static ru.yandex.praktikum.Main.*;
import static ru.yandex.praktikum.Main.fillRentAboutPage;

@RunWith(Parameterized.class)
public class ParamsTest {

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Вася", "Петров", "Рябиновая 55", "79873322445", "Привет", "29.03.2023"},
                {"Petya", "Ivanov", "Мира 211", "79873388841", "Здравствуй", "10.01.2023"},
                {"Ваня", "Сидоров", "Новозаводская 15в", "79873777741", "Хеллоу", "15.02.2023"}
        };
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }

    private final Main main;
    private final String name;
    private final String surname;
    private final String address;
    private final String phoneNumber;
    private final String comment;
    private final String date;


        public ParamsTest(String name, String surname, String address, String phoneNumber, String comment, String date) {
            this.main = new Main();
            this.name = name;
            this.surname = surname;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.comment = comment;
            this.date = date;
        }

        //Параметризованные тесты для Mozilla и Chrome
        @Test
        public void makeOrderParamsTestMozilla() {
            setUpMozilla();
            openSamokat(webDriver);
            clickMakeOrderUpperButton(webDriver);
            fillOrderPageFields(webDriver, name, surname, address, phoneNumber);
            fillRentAboutPage(webDriver, comment, date);
            orderMadeCheck(webDriver);
        }

        @Test
        public void makeOrderParamsTestChrome() {
            setUpChrome();
            openSamokat(webDriver);
            clickMakeOrderUpperButton(webDriver);
            fillOrderPageFields(webDriver, name, surname, address, phoneNumber);
            fillRentAboutPage(webDriver, comment, date);
            orderMadeCheck(webDriver);
        }
    }

