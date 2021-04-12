package ru.ok;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends BaseTest {

    String username = "chvartatskii@mail.ru";
    String password = "qwerty12";
    String ispolnitel = "Tiesto";
    @Test
    public void testGoogleSearch() throws InterruptedException  {
        UserPage userPage = new LoginPage(driver).doLogin(username, password);
        MusicPage musicPage = new UserPage(driver).findMusic();
        SecondMusicPage secondMusicPage = new MusicPage(driver).poisk(ispolnitel);
        SecondMusicPage secondMusicPage1 = new SecondMusicPage(driver).playAndStop();

    }
}
