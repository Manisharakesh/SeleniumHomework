package SeleniumSession;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class WebdriverMsEdge {
    public static void main(String[] args)throws InterruptedException {

        //setup MsEdge driver (madiator)- it's path.
        System.setProperty("webdriver.edge.driver", "C:\\Users\\mrkun\\IdeaProjects\\Software\\edgedriver.exe");
        //Create an instance of webdriver.
        WebDriver driver = new EdgeDriver();

        //Navigate to webpage.
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();

        // Get page title(Tab Name)
        String title = driver.getTitle();
        System.out.println(title);

        // Expected vs Actual - Validation
        if(title.equals("nopCommerce demo store")) {
            System.out.println("The title is correct");
        }else {
            System.out.println("The title is incorrect");
        }

        driver.quit();


    }

}
