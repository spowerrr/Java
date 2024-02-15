import java.util.Scanner;

public class MyClass1 {
    // Online Java Compiler
    // Use this editor to write, compile and run your Java code online

    public static void main(String[] args) {
        int numbers[] = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 Numbers:");
        for (int i = 0; i < numbers.length; i++) { // numbers[i]=input.nextInt();
            numbers[i] = 500 + (int) (Math.random() * 100);
            // 0.1122*100=11.22
        }
        System.out.println("10 Numbers Are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Even Numbers Are:");
        for (Integer a : numbers) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
    }
}