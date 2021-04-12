package ru.ok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MusicPage {
    WebDriver driver;
    private String MUSIC_FIND = ".//*[contains(@data-tsid, 'search_input')]";
    private String MUSIC_POISK = ".//*[contains(@data-tsid, 'submit_search_button')]";

   String MUSIC = ".//*[contains(@data-tsid, 'inner_input')]";
    MusicPage(WebDriver driver){
        this.driver = driver;
        check();
    }
    protected void check() {

    }

    public SecondMusicPage poisk(String ispolnitel)throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(MUSIC_FIND)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(MUSIC)).sendKeys(ispolnitel);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(MUSIC_POISK)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return new SecondMusicPage(driver);
    }

}
