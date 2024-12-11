package test.browser;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class CreateBrowser extends Base {

    private static final Logger log = LoggerFactory.getLogger(CreateBrowser.class);

    //    WebDriver driver =DriverManager.initializeWebDriver(); //CHROME, EDGE, FIREFOX, SAFARI
        //String name;
        //int number;
        //(WebDriver/String/int is dataType and name/number/driver is the name of variable

       // driver.get("https://www.amazon.com");
//        String title = driver.getTitle();
//        System.out.println(title);

        @Test
        public void createBrowserTest() throws InterruptedException {
            Thread.sleep(3000);

        }

        //Let's simplify this process because in the future, we need to create instance of every test.
        //it is unnecessary to have duplicate code and that is why we have object-oriented programming.
        // Object-oriented programming means everything is in the form of objects. we create classes. we use encapsulation to
        //move the information that we need. we create objects, we call them and we use them.
        //So before I create a specific class, i create a method, that is going to create different instance of browsers.
        public static void main(String[] args) {

            DriverManager.initializeWebDriver();
        }

}





