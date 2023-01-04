package webDriverTest.mozillaDriverTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.praktikum.Main;

import java.util.concurrent.TimeUnit;

import static ru.yandex.praktikum.Main.EighthText.*;
import static ru.yandex.praktikum.Main.FifthText.*;
import static ru.yandex.praktikum.Main.FirstText.*;
import static ru.yandex.praktikum.Main.FourthText.*;
import static ru.yandex.praktikum.Main.SecondText.*;
import static ru.yandex.praktikum.Main.SeventhText.*;
import static ru.yandex.praktikum.Main.SixthText.*;
import static ru.yandex.praktikum.Main.ThirdText.*;
import static ru.yandex.praktikum.Main.openSamokat;

//Тесты текстов кнопок "Вопросы о важном" в браузер  Mozilla
public class DropDownTextsTests {
    WebDriver webDriver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/Users/artembragin/Documents/geckodriver");
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() {
        webDriver.quit();
    }


    @Test
    public void firstDropDownTextCheck() {
        Main mainPage = new Main(webDriver);

        openSamokat();
        dropDownFirstButtonClick();
        firstActualTextGetting();
        assertEqualFirst();
    }

    @Test
    public void secondDropDownTextCheck() {
        Main mainPage = new Main(webDriver);

        openSamokat();
        dropDownSecondButtonClick();
        secondActualTextGetting();
        assertEqualSecond();
    }

    @Test
    public void thirdDropDownTextCheck() {
        Main mainPage = new Main(webDriver);

        openSamokat();
        dropDownThirdButtonClick();
        thirdActualTextGetting();
        assertEqualThird();
    }

    @Test
    public void fourthDropDownTextCheck() {
        Main mainPage = new Main(webDriver);

        openSamokat();
        dropDownFourthButtonClick();
        fourthActualTextGetting();
        assertEqualFourth();
    }

    @Test
    public void fifthDropDownTextCheck() {
        Main mainPage = new Main(webDriver);

        openSamokat();
        dropDownFifthButtonClick();
        fifthActualTextGetting();
        assertEqualFifth();
    }

    @Test
    public void sixthDropDownTextCheck() {
        Main mainPage = new Main(webDriver);

        openSamokat();
        dropDownSixthButtonClick();
        sixthActualTextGetting();
        assertEqualSixth();
    }

    @Test
    public void seventhDropDownTextCheck() {
        Main mainPage = new Main(webDriver);

        openSamokat();
        dropDownSeventhButtonClick();
        seventhActualTextGetting();
        assertEqualSeventh();
    }

    @Test
    public void eighthDropDownTextCheck() {
        Main mainPage = new Main(webDriver);

        openSamokat();
        dropDownEighthButtonClick();
        eighthActualTextGetting();
        assertEqualEighth();
    }
}