package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleAboutCommitmentElements {
    WebDriver driver;
    WebElement aboutButton;
    WebElement commitmentsButton;
    WebElement titleText;

    public GoogleAboutCommitmentElements(WebDriver driver) {
        this.driver = driver;
        this.aboutButton = driver.findElement(By.xpath("//a[text() ='About']"));
        this.commitmentsButton = driver.findElement(By.xpath("//a[@data-g-action ='commitments']"));
        boolean b = driver.findElement(By.xpath("//h1[@class ='glue-headline glue-headline--headline-1']")).isDisplayed();

    }

    public void clickOnAboutButton() {
        aboutButton.click();
    }

    public void clickOnCommitmentsButton() {
        commitmentsButton.click();
    }

    public void titleText() {
        String title = driver.getTitle();
        System.out.println(title);
    }
}

