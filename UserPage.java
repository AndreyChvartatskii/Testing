package ru.ok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage {

    WebDriver driver;
    private String MUSIC_LOCATOR = ".//*[contains(@class,'toolbar_nav_a toolbar_nav_a__audio h-mod')]";

    UserPage(WebDriver driver) {
        this.driver = driver;
        check();
    }

    protected void check() {

    }
    public MusicPage findMusic(){
        driver.findElement(By.xpath(MUSIC_LOCATOR)).click();
        return new MusicPage(driver);
    }

}