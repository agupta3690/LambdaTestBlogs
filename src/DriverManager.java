import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DriverManager {


       public static void init_driver(String browser) {
           // Create a list of browsers
           List<String> browsers = Arrays.asList("chrome", "firefox", "ie");


           // Loop through the list of browsers and create a driver instance for each one
           for (String browserName : browsers) {
              
               WebDriver driver;
              
               if (browser.equalsIgnoreCase("chrome")) {
                  
                   driver = new ChromeDriver();
                  
               } else if (browser.equalsIgnoreCase("firefox")) {
                  
                   driver = new FirefoxDriver();
                  
               } else if (browser.equalsIgnoreCase("ie")) {
                  
                   driver = new InternetExplorerDriver();
                  
               } else {
                  
                   throw new IllegalArgumentException("Invalid browser name: " + browser);
               }


               // Use the driver instance to navigate to a webpage and perform some actions
               driver.get("https://www.lambdatest.com");
              
               System.out.println(driver.getTitle());


               // Close the driver instance
               driver.quit();
           }
       }
}
