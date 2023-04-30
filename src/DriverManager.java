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
                  
            	   //Chrome on local grid
            	   
                  /* driver = new ChromeDriver(); */
                   
                   //Chrome on LambdaTest cloud grid
                   
                   ChromeOptions browserOptions = new ChromeOptions();
                   browserOptions.setPlatformName("Windows 10");
                   browserOptions.setBrowserVersion("113.0");
                   HashMap<String, Object> ltOptions = new HashMap<String, Object>();
                   ltOptions.put("username", "Your LambdaTest Username");
                   ltOptions.put("accessKey", "Your LambdaTest Key");
                   ltOptions.put("project", "Untitled");
                   ltOptions.put("w3c", true);
                   browserOptions.setCapability("LT:Options", ltOptions);


                  
               } else if (browser.equalsIgnoreCase("firefox")) {
                  
            	   //FireFox on local grid
                   
            	  /* driver = new FirefoxDriver(); */
            	   
            	   //FireFox on LambdaTest cloud grid
                   
                   FirefoxOptions browserOptions = new FirefoxOptions();
                   browserOptions.setPlatformName("Windows 10");
                   browserOptions.setBrowserVersion("112.0");
                   HashMap<String, Object> ltOptions = new HashMap<String, Object>();
                   ltOptions.put("username", "arun.gupta36");
                   ltOptions.put("accessKey", "ns8jXRSUnep97fV3BgSOC66CFRrNTsuQs2VB1EIdUxhNPxkLUG");
                   ltOptions.put("project", "Untitled");
                   ltOptions.put("w3c", true);
                   browserOptions.setCapability("LT:Options", ltOptions);
                  
               } else if (browser.equalsIgnoreCase("ie")) {
                  
            	   //Internet Explorer on local grid
            	   
                  /* driver = new InternetExplorerDriver(); */
                   
                   //Internet Explorer on LambdaTest cloud grid
                   
                   InternetExplorerOptions browserOptions = new InternetExplorerOptions();
                   browserOptions.setPlatformName("Windows 10");
                   browserOptions.setBrowserVersion("11.0");
                   HashMap<String, Object> ltOptions = new HashMap<String, Object>();
                   ltOptions.put("username", "arun.gupta36");
                   ltOptions.put("accessKey", "ns8jXRSUnep97fV3BgSOC66CFRrNTsuQs2VB1EIdUxhNPxkLUG");
                   ltOptions.put("project", "Untitled");
                   ltOptions.put("w3c", true);
                   browserOptions.setCapability("LT:Options", ltOptions);
                  
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
