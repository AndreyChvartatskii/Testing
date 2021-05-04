package ru.ok;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class MusicTest extends BaseTest {
    String ispolnitel = "Tiesto";
    String username = "chvartatskii@mail.ru";
    String password = "qwerty12";


    @Test
    public void testMusicSearch() throws InterruptedException  {
        UserPage userPage = new LoginPage(driver).doLogin(username, password);
        MusicPage musicPage = new UserPage(driver).findMusic();
        SecondMusicPage secondMusicPage = new MusicPage(driver).poisk(ispolnitel);
        SecondMusicPage secondMusicPage1 = new SecondMusicPage(driver).playAndStop();
    }

}
