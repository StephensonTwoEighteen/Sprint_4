package ru.yandex.praktikum;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static ru.yandex.praktikum.OrderForPage.*;
import static ru.yandex.praktikum.RentAboutPage.*;

public class Main {

    public static String ActualText;
    public static WebDriver webDriver;

    public Main() {
        this.webDriver = webDriver;
    }


    //----------Открытие сайта самокат
    public static void openSamokat(WebDriver webDriver) {
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
    }

    //Метод клика на кнопку блока "Вопросы о важном"
    public static void dropDownButtonClick(WebDriver webDriver, By By) {
        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        webDriver.findElement(By);
        webDriver.findElement(By).click();
    }

    //Метод сравнения актуального и ожидаемого текста
    public static void assertEqual(WebDriver webDriver, By By, String ExpectedText) {
        ActualText = webDriver.findElement(By).getText();
        assertEquals(ExpectedText, ActualText);
    }

    //Метод клика на верхнюю кнопку "Заказать"
    public static void clickMakeOrderUpperButton(WebDriver webDriver) {
        webDriver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        webDriver.findElement(MAKE_ORDER_UPPER_BUTTON).click();
    }

    //Метод клика на нижнюю кнопку "Заказать"
    public static void clickMakeOrderLowerButton(WebDriver webDriver) {
        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

        webDriver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        webDriver.findElement(MAKE_ORDER_LOWER_BUTTON).click();
    }

    //Метод проверки успешного оформления заказа
    public static void orderMadeCheck(WebDriver webDriver) {
        String isDisplayed = webDriver.findElement(By.className("Order_ModalHeader__3FDaJ")).getText();
        MatcherAssert.assertThat(isDisplayed, startsWith(isExpected));
    }

    //Метод проверки появления страницы "Про аренду" после ввода негативного набора данных на странице "Для кого самокат"
    public static void fillRentAboutPageNegative(WebDriver webDriver) {
        webDriver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        assertTrue(webDriver.findElements(rentalPeriodField).size() == 0);
    }

    //----------Кнопки "Заказать"
    //Верхняя
    protected final static By MAKE_ORDER_UPPER_BUTTON = By.cssSelector(".Header_Nav__AGCXC > button:nth-child(1)");
    //Нижняя
    protected final static By MAKE_ORDER_LOWER_BUTTON = By.cssSelector(".Button_Middle__1CSJM");

    //Кнопки "Вопросы о важном"
    public final static By DROP_DOWN_FIRST_BUTTON = By.cssSelector("#accordion__heading-0");
    public final static By DROP_DOWN_SECOND_BUTTON = By.cssSelector("#accordion__heading-1");
    public final static By DROP_DOWN_THIRD_BUTTON = By.cssSelector("#accordion__heading-2");
    public final static By DROP_DOWN_FOURTH_BUTTON = By.cssSelector("#accordion__heading-3");
    public final static By DROP_DOWN_FIFTH_BUTTON = By.cssSelector("#accordion__heading-4");
    public final static By DROP_DOWN_SIXTH_BUTTON = By.cssSelector("#accordion__heading-5");
    public final static By DROP_DOWN_SEVENTH_BUTTON = By.cssSelector("#accordion__heading-6");
    public final static By DROP_DOWN_EIGHTH_BUTTON = By.cssSelector("#accordion__heading-7");

    //----------Тексты элементов "Вопросы о важном"
    public final static String FIRST_EXPECTED_TEXT = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public static By firstActualText = By.cssSelector("#accordion__panel-0 > p");
    public final static String SECOND_EXPECTED_TEXT = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public static By secondActualText = By.cssSelector("#accordion__panel-1 > p");
    public final static String THIRD_EXPECTED_TEXT = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public static By thirdActualText = By.cssSelector("#accordion__panel-2 > p");
    public final static String FOURTH_EXPECTED_TEXT = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public static By fourthActualText = By.cssSelector("#accordion__panel-3 > p");
    public final static String FIFTH_EXPECTED_TEXT = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public static By fifthActualText = By.cssSelector("#accordion__panel-4 > p");
    public final static String SIXTH_EXPECTED_TEXT = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public static By sixthActualText = By.cssSelector("#accordion__panel-5 > p");
    public final static String SEVENTH_EXPECTED_TEXT = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public static By seventhActualText = By.cssSelector("#accordion__panel-6 > p");
    public final static String EIGHTH_EXPECTED_TEXT = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    public static By eighthActualText = By.cssSelector("#accordion__panel-7 > p");
}