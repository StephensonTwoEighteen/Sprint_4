package ru.yandex.praktikum;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static ru.yandex.praktikum.MainPageElements.*;
import static ru.yandex.praktikum.MainPageElements.getEighthExpectedText;
import static ru.yandex.praktikum.OrderForPage.*;
import static ru.yandex.praktikum.RentAboutPage.*;

public class Main {

    public static String ActualText;
    public static String ExpectedText;
    public static WebDriver webDriver;

    public Main(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //----------Открытие сайта самокат
    public static void openSamokat() {
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
    }


    //клик на верхнюю кнопку "Заказать"
    public static void clickMakeOrderUpperButton() {
        webDriver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        webDriver.findElement(makeOrderUpperButton).click();
    }

    //клик на нижнюю кнопку "Заказать"
    public static void clickMakeOrderLowerButton() {
        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

        webDriver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        webDriver.findElement(makeOrderLowerButton).click();
    }

    //Метод заполнения полей страницы "Для кого самокат"
    public static void fillOrderPageFields(String name, String surname, String address, String phoneNumber){
        webDriver.findElement(firstNameField).sendKeys(name);
        webDriver.findElement(secondNameField).sendKeys(surname);
        webDriver.findElement(addressField).sendKeys(address);
        webDriver.findElement(metroStationField).click();
        webDriver.findElement(sokolnikiStationButton).click();
        webDriver.findElement(phoneNumberField).sendKeys(phoneNumber);
        webDriver.findElement(goAheadButton).click();
    }

    //Метод заполнения полей страницы "Про аренду"
    public static void fillRentAboutPage(String comment, String date){
        webDriver.findElement(rentalPeriodField).click();
        webDriver.findElement(rentalThreeDays).click();
        webDriver.findElement(blackColourCheckBox).click();
        webDriver.findElement(commentForCourierField).sendKeys(comment);
        webDriver.findElement(dateField).sendKeys(date);
        webDriver.findElement(clickOrderLowerButton).click();
        webDriver.findElement(yesButton).click();

    }

    //Метод проверки успешного оформления заказа
    public static void orderMadeCheck(){
        String isDisplayed = webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[1]")).getText();
        MatcherAssert.assertThat(isDisplayed, startsWith(isExpected));
    }

    //Метод проверки появления страницы "Про аренду" после ввода негативного набора данных на странице "Для кого самокат"
    public static void fillRentAboutPageNegative(String comment, String date){
        assertTrue(webDriver.findElements(rentalPeriodField).size() == 0);
    }

    //Метод проверки негативного кейса (невозможности оформить заказ)
    public static void orderNotMadeCheck(){
        assertTrue(webDriver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div[1]")).size() == 0);
    }

    //Класс 1й кнопки "Вопросы о важном"
    public static class FirstText {

        //Метод клика на 1ю кнопку блока "Вопросы о важном"
        public static void dropDownFirstButtonClick() {
            ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            webDriver.findElement(dropDownFirstButton);
            webDriver.findElement(dropDownFirstButton).click();
        }

        //Метод получения актуального текста после нажатия на кнопку
        public static void firstActualTextGetting() {
            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            ActualText = webDriver.findElement(firstActualText).getText();
            ExpectedText = getFirstExpectedText();
        }

        //Метод сравнения актуального и ожидаемого текста
        public static void assertEqualFirst() {
            assertEquals(ExpectedText, ActualText);
        }
    }

    //Класс 2й кнопки "Вопросы о важном"
    public static class SecondText {
        //Метод клика на 2ю кнопку блока "Вопросы о важном"
        public static void dropDownSecondButtonClick() {
            ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            webDriver.findElement(dropDownSecondButton);
            webDriver.findElement(dropDownSecondButton).click();
        }

        //Метод получения актуального текста после нажатия на кнопку
        public static void secondActualTextGetting() {
            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            ActualText = webDriver.findElement(secondActualText).getText();
            ExpectedText = getSecondExpectedText();
        }

        //Метод сравнения актуального и ожидаемого текста
        public static void assertEqualSecond() {
            assertEquals(ExpectedText, ActualText);
        }
    }

    //Класс 3й кнопки "Вопросы о важном"
    public static class ThirdText {
        //Метод клика на 3ю кнопку блока "Вопросы о важном"
        public static void dropDownThirdButtonClick() {
            ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            webDriver.findElement(dropDownThirdButton);
            webDriver.findElement(dropDownThirdButton).click();
        }

        //Метод получения актуального текста после нажатия на кнопку
        public static void thirdActualTextGetting() {
            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            ActualText  = webDriver.findElement(thirdActualText).getText();
            ExpectedText = getThirdExpectedText();
        }

        //Метод сравнения актуального и ожидаемого текста
        public static void assertEqualThird() {
            //webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            assertEquals(ExpectedText, ActualText);
        }
    }

    //Класс 4й кнопки "Вопросы о важном"
    public static class FourthText {
        //Метод клика на 4ю кнопку блока "Вопросы о важном"
        public static void dropDownFourthButtonClick() {
            ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            webDriver.findElement(dropDownFourthButton);
            webDriver.findElement(dropDownFourthButton).click();
        }

        //Метод получения актуального текста после нажатия на кнопку
        public static void fourthActualTextGetting() {
            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            ActualText = webDriver.findElement(fourthActualText).getText();
            ExpectedText = getFourthExpectedText();
        }

        //Метод сравнения актуального и ожидаемого текста
        public static void assertEqualFourth() {
            assertEquals(ExpectedText, ActualText);
        }
    }

    //Класс 5й кнопки "Вопросы о важном"
    public static class FifthText {
        //Метод клика на 5ю кнопку блока "Вопросы о важном"
        public static void dropDownFifthButtonClick() {
            ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            webDriver.findElement(dropDownFifthButton);
            webDriver.findElement(dropDownFifthButton).click();
        }

        //Метод получения актуального текста после нажатия на кнопку
        public static void fifthActualTextGetting() {
            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            ActualText = webDriver.findElement(fifthActualText).getText();
            ExpectedText = getFifthExpectedText();
        }

        //Метод сравнения актуального и ожидаемого текста
        public static void assertEqualFifth() {
            assertEquals(ExpectedText, ActualText);
        }
    }

    //Класс 6й кнопки "Вопросы о важном"
    public static class SixthText {
        //Метод клика на 6ю кнопку блока "Вопросы о важном"
        public static void dropDownSixthButtonClick() {
            ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            webDriver.findElement(dropDownSixthButton);
            webDriver.findElement(dropDownSixthButton).click();
        }

        //Метод получения актуального текста после нажатия на кнопку
        public static void sixthActualTextGetting() {
            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            ActualText = webDriver.findElement(sixthActualText).getText();
            ExpectedText = getSixthExpectedText();
        }

        //Метод сравнения актуального и ожидаемого текста
        public static void assertEqualSixth() {
            assertEquals(ExpectedText, ActualText);
        }
    }

    //Класс 7й кнопки "Вопросы о важном"
    public static class SeventhText {
        //Метод клика на 7ю кнопку блока "Вопросы о важном"
        public static void dropDownSeventhButtonClick() {
            ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            webDriver.findElement(dropDownSeventhButton);
            webDriver.findElement(dropDownSeventhButton).click();
        }

        //Метод получения актуального текста после нажатия на кнопку
        public static void seventhActualTextGetting() {
            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            ActualText = webDriver.findElement(seventhActualText).getText();
            ExpectedText = getSeventhExpectedText();
        }

        //Метод сравнения актуального и ожидаемого текста
        public static void assertEqualSeventh() {
            assertEquals(ExpectedText, ActualText);
        }
    }

    //Класс 8й кнопки "Вопросы о важном"
    public static class EighthText {
        //Метод клика на 8ю кнопку блока "Вопросы о важном"
        public static void dropDownEighthButtonClick() {
            ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            webDriver.findElement(dropDownEighthButton);
            webDriver.findElement(dropDownEighthButton).click();
        }

        //Метод получения актуального текста после нажатия на кнопку
        public static void eighthActualTextGetting() {
            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            ActualText = webDriver.findElement(eighthActualText).getText();
            ExpectedText = getEighthExpectedText();
        }

        //Метод сравнения актуального и ожидаемого текста
        public static void assertEqualEighth() {
            assertEquals(ExpectedText, ActualText);
        }
    }

}