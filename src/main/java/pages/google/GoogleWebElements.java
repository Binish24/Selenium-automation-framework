package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleWebElements {

    WebDriver driver;
    WebElement aboutButton;
    WebElement storeButton;
    WebElement gmailButton;
    WebElement imagesButton;

    public GoogleWebElements (WebDriver driver) {
        this.driver = driver;
        this.aboutButton = driver.findElement(By.xpath("//a[text() ='About']"));
        this.storeButton = driver.findElement(By.xpath("//a[text() ='Store']"));
        this.gmailButton = driver.findElement(By.xpath("//a[text() ='Gmail']"));
        this.imagesButton = driver.findElement(By.xpath("//a[text() ='Images']"));
    }

    public void clickOnAboutButton() {
        aboutButton.click();
    }

    public void clickOnStoreButton() {
        storeButton.click();
    }

    public void clickOnGmailButton () {
        gmailButton.click();
    }

    public void clickOnImagesButton() {
        imagesButton.click();
    }
}
