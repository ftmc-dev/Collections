import java.util.*;
import java.util.stream.Collectors;

public class Analyse {
    public static void main(String[] args) {

        Scanner sentence = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sentence.nextLine();
        String[] word = str.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String words : word) {
            if(map.containsKey(words)){
                map.put(words, map.get(words) + 1);
            }
            else{
                map.put(words, 1);
            }
        }
        System.out.println(map);

    }



}
