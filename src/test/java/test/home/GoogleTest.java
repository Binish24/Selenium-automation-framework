package test.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class GoogleTest {

    public static void main(String[] args) throws InterruptedException {

        navigateToGoogleWebPage ();   //("Chrome");
        navigateToFacebookWebPage();

    }
        public static void navigateToGoogleWebPage () throws InterruptedException {
            WebDriver driver = new EdgeDriver();

//            if( browserName.equals("Edge")) driver = new EdgeDriver();
//            else if (browserName.equals("Chrome")) driver = new ChromeDriver();
//            else if (browserName.equals("FireFox")) driver = new FirefoxDriver();
//            else System.out.println("Invalid value");

//            switch (browserName) {
//                case "FireFox":
//                driver = new FirefoxDriver();
//                break;
//
//                case "Chrome":
//                    driver = new ChromeDriver();
//                    break;
//            }

            driver.manage().window().maximize();
            driver.get("https://www.google.com");

            //get title of the page
            String title = driver.getTitle();
            System.out.println(driver.getTitle());
            System.out.println("driver.getCurrentUrl");

            Thread.sleep(2000);



            //WebElement called DataType and aboutButton called variable
            WebElement aboutButton = driver.findElement(By.xpath("//a[text() = 'About']"));
            aboutButton.click();


            Thread.sleep(2000);


            driver.close();
            driver.quit();

            //This above is the pure selenium code
            // this will create problem
            //Do you guys remember object-oriented programming, for example encapsulation,
            // we could clean coding, hiding data from the user, simplyfing and reuse the code

        }

        public static void navigateToFacebookWebPage () throws InterruptedException {
            WebDriver driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com");

            //get title of the page
            String title = driver.getTitle();
            System.out.println(driver.getTitle());
            System.out.println("driver.getCurrentUrl");

            Thread.sleep(2000);

            //WebElement called DataType and aboutButton called variable
            WebElement createNewAccountButton = driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration')]"));
            createNewAccountButton.click();

            Thread.sleep(2000);

            driver.close();
            driver.quit();

            //This above is the pure selenium code
            // this will create problem
            //Do you guys remember object-oriented programming, for example encapsulation,
            // we could clean coding, hiding data from the user, simplyfing and reuse the code

        }

}
