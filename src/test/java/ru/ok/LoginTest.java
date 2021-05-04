package ru.ok;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends BaseTest {

    String username = "chvartatskii@mail.ru";
    String password = "qwerty12";

    @Test
    public void testGoogleSearch() throws InterruptedException  {
        UserPage userPage = new LoginPage(driver).doLogin(username, password);

    }
}
