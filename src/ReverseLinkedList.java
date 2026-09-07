import java.util.Collections;
import java.util.LinkedList;
public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("R");
        list.add("B");
        list.add("I");

        Collections.reverse(list);
        System.out.println(list);
    }
}
