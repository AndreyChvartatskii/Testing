package ru.ok;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(PLAY_MUSIC)));
      driver.findElement(By.xpath(PLAY_MUSIC)).click();
        Assert.assertTrue(driver.findElement(By.xpath(PLAY_MUSIC)).isSelected());
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
        (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(PAUSE_MUSIC)));
        Assert.assertTrue(driver.findElement(By.xpath(PAUSE_MUSIC)).isSelected());
      driver.findElement(By.xpath(PAUSE_MUSIC)).click();
      return  this;
    }

}
