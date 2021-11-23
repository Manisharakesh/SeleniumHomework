package SeleniumSession;
import org.openqa.selenium.*;
import org.openqa.selenium.opera.OperaDriver;


public class WebDriverBasics {

        public static void main(String[] args) throws InterruptedException {
            //2. set up operaDriver( madiator) -it's path
            System.setProperty("webdriver.opera.driver","C:\\Users\\mrkun\\IdeaProjects\\Software\\operadriver.exe");

                    //1. create an instance of webDriver
            WebDriver driver = new OperaDriver();
            //Topcasting - child class object referred by parent interface reference variable.

            //3. Navigate to webpage
            driver. get("https://demo.nopcommerce.com/");
            Thread.sleep( 3000);// 1000 milliseconds is 1 second.
            driver.manage().window().maximize();
            //4. Get  page title(Tab Name)
            String title = driver.getTitle();
            System.out.println(title);

            //Expected VS Actual - Validation
            if(title.equals("nopCommerce demo store")) {
                System.out.println("The title is correct");
            }else{
                System.out.println("The title is incorrect");
            }
            //closing webpage
            //driver.close();//closes the current session
            driver.quit();


        }

    }

