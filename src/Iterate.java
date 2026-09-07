import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Iterate {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(0,"A");
        map.put(1,"B");
        map.put(2,"C");
        map.put(3,"D");

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
