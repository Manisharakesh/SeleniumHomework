package SeleniumSession;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebFirefoxDriver {
    public static void main(String[] args)throws InterruptedException {
        //2.set up firefox driver (madiator) -it's path.
        //  System.setProperty("webdriver.gecko.driver","C:\\Users\\mrkun\\IdeaProjects\\Software\\geckodriver.exe");

        //1. create an instance of webdriver.
        WebDriver driver = new FirefoxDriver();
        //2.set up firefox driver (madiator) -it's path.
        System.setProperty("webdriver.geckodriver", "C:\\Users\\mrkun\\IdeaProjects\\Software\\geckodriver.exe");


        //3.Navigate to webpage
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //4.get the page title
        String title = driver.getTitle();
        System.out.println(title);

        //5.Expected vs Actual - Validation
       if (title.equals("nopCommerce demo store")){

            System.out.println("The title is correct");
        } else {
            System.out.println("The title is incorrect");
        }

driver.quit();

    }
}




