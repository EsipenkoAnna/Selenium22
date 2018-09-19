package GR22;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
    private static WebDriver driver;

    @BeforeClass

    public static void setup() {
        driver = new ChromeDriver();

    }

    @Test

    public void OPENPAGE() {

        driver.get("https://yandex.ru");


    }
}