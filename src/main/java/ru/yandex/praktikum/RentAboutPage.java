package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Страница "Про аренду"
public class RentAboutPage {

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

    //Поле "Когда привезти самокат"
    protected static By dateField = By.xpath(".//input[@*=\"* Когда привезти самокат\"]");

    //Поле "Срок аренды"
    protected static By rentalPeriodField = By.xpath(".//div[contains (text(), \"Срок аренды\")]");

    //Пункт из выпадающего списка "трое суток"
    protected static By rentalThreeDays = By.xpath(".//div[contains (text(), \"трое суток\")]");

    //Чек-бокс цвет "черный жемчуг"
    protected static By blackColourCheckBox = By.cssSelector("#black");

    //Поле "Комментарий для курьера"
    protected static By commentForCourierField = By.xpath(".//input[@*=\"Комментарий для курьера\"]");

    //Кнопка "Заказать"
    protected static By clickOrderLowerButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //Кнопка "Да" в модалке "Хотите оформить заказ?"
    protected static By yesButton = By.xpath(".//button[contains (text(), 'Да')]");
}
