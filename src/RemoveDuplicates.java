import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String[] strings = {"Green", "Red", "Yellow", "Red"};
        List<Integer> integerList = List.of(1, 34,10, 1, 2, 2, 3, 4, 6);
        Set<Integer> color = new HashSet<>();
        color.add(99);
        color.addAll(integerList);
        System.out.println("HashSet without duplicates: " + color);
    }
}
