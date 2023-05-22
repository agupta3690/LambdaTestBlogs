import java.util.Arrays;
import java.util.List;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverManager {

       
       private RemoteWebDriver driver;
       
       public static void init_driver(String browser) throws MalformedURLException {
              
               String username = System.getenv("LT_USERNAME") == null ? "Your LT Username" : System.getenv("LT_USERNAME");
               String authkey = System.getenv("LT_ACCESS_KEY") == null ? "Your LT AccessKey" : System.getenv("LT_ACCESS_KEY");

               // Create a list of browsers
               List<String> browsers = Arrays.asList("chrome", "firefox", "edge");

                  // Loop through the list of browsers and create a driver instance for each one
                  for (String browserName : browsers) {

                      if (browser.equalsIgnoreCase("chrome")) {
                             
                      //To launch the chrome browser on local       
                      /*driver = new ChromeDriver();*/
                      
                      //Setting chrome capabilities
                      DesiredCapabilities ChromeCaps = new DesiredCapabilities();
                      ChromeCaps.setCapability("platform", "Windows 10");
                      ChromeCaps.setCapability("browserName", "chrome");
                      ChromeCaps.setCapability("version", "latest");
                      ChromeCaps.setCapability("build", "TestNG With Java");
                      ChromeCaps.setCapability("name", m.getName() + this.getClass().getName());
                      ChromeCaps.setCapability("plugin", "git-testng");

                       //To launch the chrome browser on LambdaTest cloud grid
                       String[] Tags = new String[]{"Feature", "Magicleap", "Severe"};
                       ChromeCaps.setCapability("tags", Tags);

                       driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), ChromeCaps);

                  
                      } else if (browser.equalsIgnoreCase("firefox")) {
                       
                      //To launch the firefox browser on local         
                      /*driver = new FirefoxDriver();*/
                      
                      //Setting firefox capabilities
                      DesiredCapabilities FirefoxCaps = new DesiredCapabilities();
                      FirefoxCaps.setCapability("platform", "Windows 10");
                      FirefoxCaps.setCapability("browserName", "firefox");
                      FirefoxCaps.setCapability("version", "114.0");
                      FirefoxCaps.setCapability("build", "TestNG With Java");
                      FirefoxCaps.setCapability("name", m.getName() + this.getClass().getName());
                      FirefoxCaps.setCapability("plugin", "git-testng");

                   	   
                       //To launch the firefox browser on LambdaTest cloud grid
                       String[] Tags = new String[]{"Feature", "Magicleap", "Severe"};
                       FirefoxCaps.setCapability("tags", Tags);

                       driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), FirefoxCaps);

                  
                      } else if (browser.equalsIgnoreCase("edge")) {
                             
                      //To launch the edge browser on local           
                      /*driver = new EdgeDriver();*/
                      
                      //Setting edge capabilities
                      DesiredCapabilities EdgeCaps = new DesiredCapabilities();
                      EdgeCaps.setCapability("platform", "Windows 10");
                      EdgeCaps.setCapability("browserName", "edge");
                      EdgeCaps.setCapability("version", "112.0");
                      EdgeCaps.setCapability("build", "TestNG With Java");
                      EdgeCaps.setCapability("name", m.getName() + this.getClass().getName());
                      EdgeCaps.setCapability("plugin", "git-testng");
         
                       //To launch the edge browser on LambdaTest cloud grid
                       String[] Tags = new String[]{"Feature", "Magicleap", "Severe"};
                       EdgeCaps.setCapability("tags", Tags);

                       driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), EdgeCaps);

                  
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
