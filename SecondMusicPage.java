package ru.ok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SecondMusicPage {
    WebDriver driver;
    private String PLAY_MUSIC = ".//wm-icon[contains(@data-tsid, 'play_button')]";
    private String PAUSE_MUSIC = ".//wm-tico[contains(@data-tsid, 'pause_button')]";
  SecondMusicPage(WebDriver driver){
    this.driver = driver;
    check();
}
    protected void check() {

    }
    public SecondMusicPage playAndStop() throws InterruptedException{
      driver.findElement(By.xpath(PLAY_MUSIC)).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
      driver.findElement(By.xpath(PAUSE_MUSIC)).click();
      return  this;
    }

}
