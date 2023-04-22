

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ValidateLinksAndImagesExample {
   


   public static void main(String args[]) throws IOException {
   
     //Creating ChromeDriver instance

WebDriver driver = new ChromeDriver();
       
      //Opening the test URL 

driver.get("https://the-internet.herokuapp.com/broken_images");
     
      //Initializing a list of img elements

       List<WebElement> allImages = driver.findElements(By.tagName("img"));


	//Creating a list to store the broken image URLs

       List<String> brokenImages = new ArrayList<String>();


//Iterating through the list of elements and hitting the img src URLs

       for (WebElement link : allImages) {
           String src = link.getAttribute("src");
           System.out.println("Testing image source "+src);
           HttpURLConnection connection = (HttpURLConnection) new URL(src).openConnection();
           connection.setRequestMethod("HEAD");
           int responseCode = connection.getResponseCode();
           if (responseCode >= 400) {


			//Adding all the broken image URLs to the list

               brokenImages.add(src);
           }
       }


       System.out.println("Broken images:");


	//Printing the broken img URLs list
 
       System.out.println(Arrays.asList(brokenImages));
      
   }


}
