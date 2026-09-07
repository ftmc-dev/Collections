import java.util.TreeSet;

public class Sort {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("Cherry");
        set.add("Pineapple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");

        for(String s : set){
            System.out.println(s);
        }
    }
}
