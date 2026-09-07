import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("John");
        students.add("Jane");
        students.add("Julie");

        ArrayList<String> students2 = new ArrayList<>();
        students2.add("Peter");
        students2.add("Rim");
        students2.add("Julia");

            students2.addAll(students);
            System.out.println(students2);
    }
}
