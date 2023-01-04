package ru.yandex.praktikum;

import org.openqa.selenium.By;

//Страница "Про аренду"
public class RentAboutPage {

    //Поле "Когда привезти самокат"
    protected static By dateField = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div.Order_MixedDatePicker__3qiay > div > div > input");

    //Поле "Срок аренды"
    protected static By rentalPeriodField = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div[1]");

    //Пункт из выпадающего списка "трое суток"
    protected static By rentalThreeDays = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div.Dropdown-root.is-open > div.Dropdown-menu > div:nth-child(3)");

    //Чек-бокс цвет "черный жемчуг"
    protected static By blackColourCheckBox = By.cssSelector("#black");

    //Поле "Комментарий для курьера"
    protected static By commentForCourierField = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div.Input_InputContainer__3NykH > input");

    //Кнопка "Заказать"
    protected static By clickOrderLowerButton = By.xpath("/html/body/div/div/div[2]/div[3]/button[2]");

    //Кнопка "Да" в модалке "Хотите оформить заказ?"
    protected static By yesButton = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Modal__YZ-d3 > div.Order_Buttons__1xGrp > button:nth-child(2)");
}
