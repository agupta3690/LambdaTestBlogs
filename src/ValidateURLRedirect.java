

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ValidateURLRedirect {


	public static void main(String args[]) throws IOException {


		//Creating ChromeDriver instance


		WebDriver driver = new ChromeDriver();


		//Initializing a String array with URLs


		String URLs[] = {"https://app.lambdatest.com/", "https://accounts.lambdatest.com/detail/profile"};


		//Passing the String array to the asList method as an argument


		List <String> URLlist = Arrays.asList(URLs);


		//Iterating through the list and printing the redirected URLs


		for (String URL: URLlist) {
			driver.get(URL);
			System.out.println(driver.getCurrentUrl());
		}
	}
}
