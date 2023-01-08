package webDriverTest;

import org.junit.Test;

import static ru.yandex.praktikum.Main.*;


//Тесты текстов кнопок "Вопросы о важном" в браузерах Chrome и Mozilla
//Аннотации @before и @After, а так же методы установки браузеров, перенес в класс TestBase, кажется что так код выглядит лучше
//Итого в данном классе представлено 8 тестов для проверки соответствия текстов 8 кнопок FAQ, с возможностью смены драйвера в @Before

public class DropDownTextsTests extends TestBase{

    @Test
    public void firstDropDownTextCheck() {
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, DROP_DOWN_FIRST_BUTTON);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, firstActualText, FIRST_EXPECTED_TEXT);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void secondDropDownTextCheck() {
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, DROP_DOWN_SECOND_BUTTON);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, secondActualText, SECOND_EXPECTED_TEXT);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void thirdDropDownTextCheck() {
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, DROP_DOWN_THIRD_BUTTON);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, thirdActualText, THIRD_EXPECTED_TEXT);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void fourthDropDownTextCheck() {
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, DROP_DOWN_FOURTH_BUTTON);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, fourthActualText, FOURTH_EXPECTED_TEXT);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void fifthDropDownTextCheck() {
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, DROP_DOWN_FIFTH_BUTTON);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, fifthActualText, FIFTH_EXPECTED_TEXT);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void sixthDropDownTextCheck() {
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, DROP_DOWN_SIXTH_BUTTON);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, sixthActualText, SIXTH_EXPECTED_TEXT);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void seventhDropDownTextCheck() {
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, DROP_DOWN_SEVENTH_BUTTON);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, seventhActualText, SEVENTH_EXPECTED_TEXT);   //Сравнение актуального и ожидаемого текста
    }

    @Test
    public void eighthDropDownTextCheck() {
        openSamokat(webDriver);    //открытие сайта
        dropDownButtonClick(webDriver, DROP_DOWN_EIGHTH_BUTTON);   //клик на выпадающий список "Как рассчитывается время аренды?"
        assertEqual(webDriver, eighthActualText, EIGHTH_EXPECTED_TEXT);   //Сравнение актуального и ожидаемого текста
    }
}