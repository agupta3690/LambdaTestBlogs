import java.util.Arrays;
import java.util.List;


public class ArraysAsListWithArrayExample {


   public static void main (String args[]) {


       //Initializing a string Array


       String arr[] = {"Java", "Python", "C", "Ruby"};


       //Getting the list view of Array


       List <String> list = Arrays.asList(arr);


       //Printing the elements inside the list


       System.out.println(list);


   }


}
