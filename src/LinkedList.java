public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> l = new java.util.LinkedList<>();
        l.add("Students");
        l.add("Books");
        l.add("Chairs");

        System.out.println("Original List: " + l);
        for(String s : l)
            System.out.println(s);
    }
}
