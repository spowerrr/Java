public class MyClass2 {
    public static void printprime(int[] numbers) {
        System.out.println("Prime numbers are:");
        for (Integer x : numbers) {
            if (isPrime(x) == 1) {
                System.out.println(x + " ");
            }
        }
    }

    public static int isPrime(int n) {
        // if (n <= 1) {
        // return 0; // 0 and 1 are not prime
        // }

        // Check for divisibility by integers from 2 to n/2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return 0; // n is divisible by i, so it's not prime
            }
        }

        return 1; // If no divisors found, n is prime
    }

    public static void main(String[] args) {
        int numbers[] = new int[10];
        for (int i = 0; i < numbers.length; i++) { // numbers[i]=input.nextInt();
            numbers[i] = 500 + (int) (Math.random() * 100);
            // 0.1122*100=11.22
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        printprime(numbers);
    }
}