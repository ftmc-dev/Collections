import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Order {
    public static void main(String[] args) {

        TreeSet<Person> student = new TreeSet<>();

        student.add(new Person("1cassidy", 30));
        student.add(new Person("acassidy", 30));
        student.add(new Person("mirenda", 35));
        student.add(new Person("jaures", 40));
        student.add(new Person("guimel", 45));

        System.out.println(student);
    }
}
