import java.util.ArrayList;

public class HelloWorld1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        for (String name : names) {
            System.out.println(name);
        }
    }
}