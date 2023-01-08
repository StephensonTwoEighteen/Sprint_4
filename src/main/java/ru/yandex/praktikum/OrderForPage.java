package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderForPage {

    //Страница "Для кого самокат"

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

    //Тестовые данные
    public static String namePetya = "Петя";
    public static String surnamePetya = "Сидоров";
    public static String nameVasya = "Vasya";
    public static String surnameVasya = "Ivanov";
    public static String isExpected = "Заказ оформлен";

    //Поле "Имя"
    protected static By firstNameField = By.xpath(".//input[@*='* Имя']");
    //Поле "Фамилия"
    protected static By secondNameField = By.xpath(".//input[@*='* Фамилия']");
    //Поле "Адрес: куда привезти заказ"
    protected static By addressField = By.xpath(".//input[@*='* Адрес: куда привезти заказ']");

    //Поле выпадающего списка "Метро"
    protected static By metroStationField = By.xpath(".//input[@*='* Станция метро']");

    //Пункт выпадающего списка "Сокольники"
    protected static By sokolnikiStationButton = By.xpath(".//button[@value='3']");

    //Поле "Телефон: на него позвонит курьер"
    protected static By phoneNumberField = By.xpath(".//input[@*='* Телефон: на него позвонит курьер']");

    //Кнопка "Далее"
    protected static By goAheadButton = By.xpath(".//button[contains (text(), \"Далее\")]");
}