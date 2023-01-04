package webDriverTest.chromeDriverTest;

import org.junit.Test;
import ru.yandex.praktikum.Main;
import samokatTests.TestBase;

import static ru.yandex.praktikum.Main.EighthText.*;
import static ru.yandex.praktikum.Main.FifthText.*;
import static ru.yandex.praktikum.Main.FirstText.*;
import static ru.yandex.praktikum.Main.FourthText.*;
import static ru.yandex.praktikum.Main.SecondText.*;
import static ru.yandex.praktikum.Main.SeventhText.*;
import static ru.yandex.praktikum.Main.SixthText.*;
import static ru.yandex.praktikum.Main.openSamokat;

//Тесты текстов кнопок "Вопросы о важном" в браузер Chrome
public class DropDownTextsTests extends TestBase {

    @Test
    public void firstDropDownTextCheck() {
        Main mainPage = new Main(webDriver);

        openSamokat();    //открытие сайта
        dropDownFirstButtonClick();   //клик на выпадающий список "Как рассчитывается время аренды?"
        firstActualTextGetting();
        assertEqualFirst();
    }

    @Test
    public void secondDropDownTextCheck() {
        Main mainPage = new Main(webDriver);

        openSamokat();    //открытие сайта
        dropDownSecondButtonClick();   //клик на выпадающий список "Как рассчитывается время аренды?"
        secondActualTextGetting();
        assertEqualSecond();
    }

    @Test
    public void thirdDropDownTextCheck() {
        Main mainPage = new Main(webDriver);

        openSamokat();    //открытие сайта
        dropDownSecondButtonClick();   //клик на выпадающий список "Как рассчитывается время аренды?"
        secondActualTextGetting();
        assertEqualSecond();
    }

    @Test
    public void fourthDropDownTextCheck() {
        Main mainPage = new Main(webDriver);

        openSamokat();    //открытие сайта
        dropDownFourthButtonClick();   //клик на выпадающий список "Как рассчитывается время аренды?"
        fourthActualTextGetting();
        assertEqualFourth();
    }

    @Test
    public void fifthDropDownTextCheck() {
        Main mainPage = new Main(webDriver);

        openSamokat();    //открытие сайта
        dropDownFifthButtonClick();   //клик на выпадающий список "Как рассчитывается время аренды?"
        fifthActualTextGetting();
        assertEqualFifth();
    }

    @Test
    public void sixthDropDownTextCheck() {
        Main mainPage = new Main(webDriver);

        openSamokat();    //открытие сайта
        dropDownSixthButtonClick();   //клик на выпадающий список "Как рассчитывается время аренды?"
        sixthActualTextGetting();
        assertEqualSixth();
    }

    @Test
    public void seventhDropDownTextCheck() {
        Main mainPage = new Main(webDriver);

        openSamokat();    //открытие сайта
        dropDownSeventhButtonClick();   //клик на выпадающий список "Как рассчитывается время аренды?"
        seventhActualTextGetting();
        assertEqualSeventh();
    }

    @Test
    public void eighthDropDownTextCheck() {
        Main mainPage = new Main(webDriver);

        openSamokat();    //открытие сайта
        dropDownEighthButtonClick();   //клик на выпадающий список "Как рассчитывается время аренды?"
        eighthActualTextGetting();
        assertEqualEighth();
    }
}