import java.util.Arrays;
import java.util.List;


public class ModifyListExample {
  
   public static void main (String args[]) {
      
      
       //Initializing a string Array
      
       String [] arr = {"Java", "Python", "C", "Ruby"};
      
       //Getting the list view of Array
      
       List <String> list = Arrays.asList(arr);
      
       //Modifying the structure of the list
      
       list.add("C++");
      
       //Printing the List
      
       System.out.println(list);
      
   }


}
