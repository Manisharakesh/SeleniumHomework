package SeleniumSession;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverChrome {
    public static void main(String[] args) throws InterruptedException {
        //2.Set up chrome driver its path.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrkun\\IdeaProjects\\Software\\chromedriver.exe");

        //1.Create instance of webdriver
        WebDriver driver = new ChromeDriver();//Topcasting -child class object referred by parent interface reference variable.

        //3.Navigate to webpage.
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(4000); //1000 milliseconds is 1 second.
        driver.manage().window().maximize();

        //4. Get the page title.
        String title = driver.getTitle();
        System.out.println(title);

        //5.Expected vs Actual - Validation
        if (title.equals("nopCommerce demo store")) {
            System.out.println("The title is correct");
        } else {
            System.out.println("The title is incorrect");
        }
        //closing webpage
        // driver.close(); closes the current session.
        driver.quit(); // closes everything.
    }
    }

