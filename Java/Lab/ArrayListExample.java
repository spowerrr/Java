import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        list1.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");

        list1.addAll(list2); // Combines list2 into list1

        // Print the combined list
        System.out.println("Combined List (list1 + list2): " + list1);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Before Removing: " + numbers);
        numbers.remove(1); // Removes the element at index 1 (20)
        System.out.println("After Removing:" + numbers);
        list2.set(1, "Orange"); // Replaces "Banana" with "Orange"
        System.out.println("Combined List (list1 + list2) After Replacing: " + list1);
        System.out.println("Combined List list2 After Replacing: " + list2);

        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        int index = colors.indexOf("Green"); // Returns 1
        System.out.println("Green Stays: " + index + " index");

    }
}