import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        int[] numbers = new int[10]; // Fixed array size to store 10 numbers
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 Numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("10 Numbers Are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Hello, World!" + numbers[i]);
        }
    }
}