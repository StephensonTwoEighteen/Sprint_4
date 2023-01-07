package ru.yandex.praktikum;

import org.openqa.selenium.By;

public class OrderForPage {

    //Страница "Для кого самокат"

    //Тестовые данные
    public static String namePetya = "Петя";
    public static String surnamePetya = "Сидоров";
    public static String nameVasya = "Vasya";
    public static String surnameVasya = "Ivanov";
    public static String isExpected = "Заказ оформлен";

    //Поле "Имя"
    protected static By firstNameField = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(1) > input");
    //Поле "Фамилия"
    protected static By secondNameField = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(2) > input");
    //Поле "Адрес: куда привезти заказ"
    protected static By addressField = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(3) > input");

    //Поле выпадающего списка "Метро"
    protected static By metroStationField = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(4) > div > div > input");

    //Пункт выпадающего списка "Сокольники"
    protected static By sokolnikiStationButton = By.xpath(".//button[@value='3']");

    //Поле "Телефон: на него позвонит курьер"
    protected static By phoneNumberField = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(5) > input");

    //Кнопка "Далее"
    protected static By goAheadButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
}