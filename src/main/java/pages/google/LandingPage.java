package pages.google;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    private final WebDriver driver;
    public final WebElement aboutButton;
    public final WebElement storeButton;
    public final By gmailButton;
  //  private final WebElement productsButton;

    public LandingPage (WebDriver driver) {
        this.driver = driver;
        this.aboutButton = driver.findElement(By.xpath("//a[text() ='About']"));
        this.storeButton = driver.findElement(By.xpath("//a[text() ='Store']"));
        this.gmailButton = By.xpath("//a[text() ='Gmail']");
       // this.productsButton =driver.findElement(By.xpath("//a[@data-g-action='products']"));

    }

    public void clickOnAboutButton() {
        aboutButton.click();
    }

    public void clickOnStoreButton() {
        storeButton.click();
    }

    public void clickOnGamilButton () { }

//   public void clickOnProductsButton() {
//       productsButton.click();
//
//   }

}



