import java.util.Arrays;
import java.util.List;


public class ArraysAsListWithObjectsExample {



   public static void main (String args[]) {


       //Getting the list view of ProgrammingLanguage class objects


       List <ProgrammingLanguage> list = Arrays.asList(


               new ProgrammingLanguage("Java", 17.0),
               new ProgrammingLanguage("Python", 3.10),
               new ProgrammingLanguage("C", 17.0),
               new ProgrammingLanguage("Ruby", 3.2)


               );


       //Printing the objects inside the list


       System.out.println(list);


   }


}
