import java.util.Arrays;
import java.util.List;

public class ModifyElementsExample {
	
	public static void main (String args[]) {
		
		

		//Initializing a string Array
		
		String [] arr = {"Java", "Python", "C", "Ruby"};
		
		//Getting the list view of Array
		
		List <String> list = Arrays.asList(arr);
		
		//Modifying the list
		
		list.set(3, "C++");
		
		//Printing the original Array
		
		System.out.println(Arrays.toString(arr));
		
	}

}
