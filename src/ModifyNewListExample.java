

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ModifyNewListExample {
  
   public static void main (String args[]) {
      
       //Initializing a string Array
      
       String [] arr = {"Java", "Python", "C", "Ruby"};
      
       //Getting the list view of Array
      
       List <String> list = new ArrayList<String>(Arrays.asList(arr));
      
       //Modifying the list
      
       list.add("C++");
      
       //Printing the original Array
      
       System.out.println(list);
      
   }


}
