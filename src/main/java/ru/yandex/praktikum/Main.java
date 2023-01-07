package ru.yandex.praktikum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static ru.yandex.praktikum.OrderForPage.*;
import static ru.yandex.praktikum.RentAboutPage.*;

public class Main {

    public static String ActualText;
    //public static String ExpectedText;
    public static WebDriver webDriver;

    public Main() {
        this.webDriver = webDriver;
    }


    //Установка вебдрайвера Хром
    public static void setUpChrome() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //Установка вебдрайвера Мозилла
    public static void setUpMozilla() {
        System.setProperty("webdriver.gecko.driver", "/Users/artembragin/Documents/geckodriver");
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
        webDriver.findElement(makeOrderUpperButton).click();
    }

    //Метод клика на нижнюю кнопку "Заказать"
    public static void clickMakeOrderLowerButton(WebDriver webDriver) {
        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

        webDriver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        webDriver.findElement(makeOrderLowerButton).click();
    }

    //Метод заполнения полей страницы "Для кого самокат"
    public static void fillOrderPageFields(WebDriver webDriver, String name, String surname, String address, String phoneNumber) {
        webDriver.findElement(firstNameField).sendKeys(name);
        webDriver.findElement(secondNameField).sendKeys(surname);
        webDriver.findElement(addressField).sendKeys(address);
        webDriver.findElement(metroStationField).click();
        webDriver.findElement(sokolnikiStationButton).click();
        webDriver.findElement(phoneNumberField).sendKeys(phoneNumber);
        webDriver.findElement(goAheadButton).click();
    }

    //Метод заполнения полей страницы "Про аренду"
    public static void fillRentAboutPage(WebDriver webDriver, String comment, String date) {
        webDriver.findElement(rentalPeriodField).click();
        webDriver.findElement(rentalThreeDays).click();
        webDriver.findElement(blackColourCheckBox).click();
        webDriver.findElement(commentForCourierField).sendKeys(comment);
        webDriver.findElement(dateField).sendKeys(date);
        webDriver.findElement(clickOrderLowerButton).click();
        webDriver.findElement(yesButton).click();

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
    protected final static By makeOrderUpperButton = By.cssSelector(".Header_Nav__AGCXC > button:nth-child(1)");
    //Нижняя
    protected final static By makeOrderLowerButton = By.cssSelector(".Button_Middle__1CSJM");

    //Кнопки "Вопросы о важном"
    public final static By dropDownFirstButton = By.cssSelector("#accordion__heading-0");
    public final static By dropDownSecondButton = By.cssSelector("#accordion__heading-1");
    public final static By dropDownThirdButton = By.cssSelector("#accordion__heading-2");
    public final static By dropDownFourthButton = By.cssSelector("#accordion__heading-3");
    public final static By dropDownFifthButton = By.cssSelector("#accordion__heading-4");
    public final static By dropDownSixthButton = By.cssSelector("#accordion__heading-5");
    public final static By dropDownSeventhButton = By.cssSelector("#accordion__heading-6");
    public final static By dropDownEighthButton = By.cssSelector("#accordion__heading-7");

    //----------Тексты элементов "Вопросы о важном"
    public static final String firstExpectedText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public final static By firstActualText = By.cssSelector("#accordion__panel-0 > p");
    public final static String secondExpectedText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public final static By secondActualText = By.cssSelector("#accordion__panel-1 > p");
    public final static String thirdExpectedText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public final static By thirdActualText = By.cssSelector("#accordion__panel-2 > p");
    public final static String fourthExpectedText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public final static By fourthActualText = By.cssSelector("#accordion__panel-3 > p");
    public final static String fifthExpectedText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public final static By fifthActualText = By.cssSelector("#accordion__panel-4 > p");
    public final static String sixthExpectedText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public final static By sixthActualText = By.cssSelector("#accordion__panel-5 > p");
    public final static String seventhExpectedText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public final static By seventhActualText = By.cssSelector("#accordion__panel-6 > p");
    public final static String eighthExpectedText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    public final static By eighthActualText = By.cssSelector("#accordion__panel-7 > p");
}