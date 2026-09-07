import java.util.ArrayList;
import java.util.Collections;

public class Create {
    public static void main(String[] args) {

        //Create an array list
        ArrayList<String> colors = new ArrayList<>();

        //Add elements
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Orange");

        //Iterate through
        for(String color : colors){
            System.out.println(color);
        }

        //Insert at first position
        colors.add(1, "White");
        System.out.println(colors);

        //Remove an element at a specific index
        colors.remove(3);
        System.out.println(colors);

        //Update
        colors.set(3, "Black");
        System.out.println(colors);

        //Search all elements
       boolean hasAllElements = colors.containsAll(colors);
       System.out.println(hasAllElements);
       //Search for a particular element
       if(colors.contains("Black")) {
           System.out.println("Yes");
       }
       else {
           System.out.println("No");
       }

       //Sort
        System.out.println("List before sorting: " + colors);
        Collections.sort(colors);
        System.out.println("List after sorting: " + colors);

      //Copy
        ArrayList<String> fruits = new ArrayList<>();

        //Add elements
        fruits.add("Apple");
        fruits.add("Strawberry");
        fruits.add("Banana");
        fruits.add("Orange");

        colors.addAll(fruits);
        System.out.println(colors);

    //Swap elements
    System.out.println("List before shuffling:\n" +fruits);
    Collections.shuffle(fruits);
    System.out.println("List after shuffling:\n" +fruits);


    //Reverse elements
    System.out.println("List before shuffling:\n" +colors);
    Collections.reverse(colors);
    System.out.println("List after shuffling:\n" +colors);
}
}