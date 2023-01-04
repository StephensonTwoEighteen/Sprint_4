package ru.yandex.praktikum;

import org.openqa.selenium.By;

public class MainPageElements {

    //----------Кнопки "Заказать"
    //Верхняя
    protected final static By makeOrderUpperButton = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/button[1]");
    //Нижняя
    protected final static By makeOrderLowerButton = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[5]/button");

    //----------Кнопки "Вопросы о важном"
    protected final static By dropDownFirstButton = By.xpath("//*[@id=\"accordion__heading-0\"]");
    protected final static By dropDownSecondButton = By.xpath("//*[@id=\"accordion__heading-1\"]");
    protected final static By dropDownThirdButton = By.xpath("//*[@id=\"accordion__heading-2\"]");
    protected final static By dropDownFourthButton = By.xpath("//*[@id=\"accordion__heading-3\"]");
    protected final static By dropDownFifthButton = By.xpath("//*[@id=\"accordion__heading-4\"]");
    protected final static By dropDownSixthButton = By.xpath("//*[@id=\"accordion__heading-5\"]");
    protected final static By dropDownSeventhButton = By.xpath("//*[@id=\"accordion__heading-6\"]");
    protected final static By dropDownEighthButton = By.xpath("//*[@id=\"accordion__heading-7\"]");


    //----------Текст элементов "Вопросы о важном"
    private static final String firstExpectedText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    protected final static By firstActualText = By.xpath("//*[@id=\"accordion__panel-0\"]/p");
    private final static String secondExpectedText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    protected final static By secondActualText = By.xpath("//*[@id=\"accordion__panel-1\"]/p");
    private final static String thirdExpectedText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    protected final static By thirdActualText = By.xpath("//*[@id=\"accordion__panel-2\"]/p");
    private final static String fourthExpectedText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    protected final static By fourthActualText = By.xpath("//*[@id=\"accordion__panel-3\"]/p");
    private final static String fifthExpectedText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    protected final static By fifthActualText = By.xpath("//*[@id=\"accordion__panel-4\"]/p");
    private final static String sixthExpectedText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    protected final static By sixthActualText = By.xpath("//*[@id=\"accordion__panel-5\"]/p");
    private final static String seventhExpectedText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    protected final static By seventhActualText = By.xpath("//*[@id=\"accordion__panel-6\"]/p");
    private final static String eighthExpectedText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    protected final static By eighthActualText = By.xpath("//*[@id=\"accordion__panel-7\"]/p");

    public static String getFirstExpectedText() {
        return firstExpectedText;
    }
    public static String getSecondExpectedText() {
        return secondExpectedText;
    }
    public static String getThirdExpectedText() {
        return thirdExpectedText;
    }
    public static String getFourthExpectedText() {
        return fourthExpectedText;
    }
    public static String getFifthExpectedText() {
        return fifthExpectedText;
    }
    public static String getSixthExpectedText() {
        return sixthExpectedText;
    }
    public static String getSeventhExpectedText() {
        return seventhExpectedText;
    }
    public static String getEighthExpectedText() {
        return eighthExpectedText;
    }

}
