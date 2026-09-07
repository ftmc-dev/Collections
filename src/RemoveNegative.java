import java.util.ArrayList;

public class RemoveNegative {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(-3);
        numbers.add(-4);
        numbers.add(5);
        numbers.add(-6);

        for(int num : numbers){
            if(num < 0){
                numbers.remove(num);
                System.out.println(num);
            }
            else{
                System.out.println(num);
            }
        }
    }
}
