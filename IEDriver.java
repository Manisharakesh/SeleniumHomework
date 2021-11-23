package SeleniumSession;

import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriver {
    public static void main(String[] args) throws InterruptedException{
        // setup idedriver (madiator)- its path.
        System.setProperty("webdriver.Ied.driver","C:\\Users\\mrkun\\IdeaProjects\\Software\\Ieddriver.exe");
         // Create an instance of webdriver

        WebDriver driver = new InternetExplorerDriver();

       // Navigate web page
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        // Get the title of page.
        String title = driver.getTitle();
        System.out.println(title);

        // Expected vs Actual = Validation
        if(title.equals("nopCommerce demo store")) {
            System.out.println("The title is correct");
        }  else{
            System.out.println("The title is incorrect");

        }
        driver.quit();






    }
}
