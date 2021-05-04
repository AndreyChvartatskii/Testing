package ru.ok;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver;
    @Before
    public void start() {
        driverInit();
        get();
    }

    BaseTest() {

    }

    public void driverInit() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chvar\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void get() {
        driver.manage().window();
        driver.get("https://ok.ru/");
    }
    @After
    public void stop(){
        driverDown();
    }

    public void driverDown() {
        driver.quit();
    }
}