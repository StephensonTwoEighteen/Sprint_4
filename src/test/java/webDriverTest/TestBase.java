package webDriverTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static ru.yandex.praktikum.Main.webDriver;

public class TestBase {
    public void setUpBrowser(String browserName){
        if (browserName == "chrome") {
            setUpChrome();
        } else if (browserName == "mozilla"){
            setUpMozilla();
        }
    }
    public static void setUpChrome() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public static void setUpMozilla() {
        System.setProperty("webdriver.gecko.driver", "/Users/artembragin/Documents/geckodriver");
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Before
    public void setUpBrowser(){
        setUpBrowser("mozilla");
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }
}
