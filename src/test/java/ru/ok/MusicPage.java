package ru.ok;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

        (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(MUSIC_FIND)));
        driver.findElement(By.xpath(MUSIC_FIND)).click();
        driver.findElement(By.xpath(MUSIC)).sendKeys(ispolnitel);
        (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(MUSIC_POISK)));
        driver.findElement(By.xpath(MUSIC_POISK)).click();
        return new SecondMusicPage(driver);
    }

}
