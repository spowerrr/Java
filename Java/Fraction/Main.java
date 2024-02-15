package Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 4);
        Fraction fraction2 = new Fraction(3, 5);

        System.out.println("Fraction 1: " + fraction1);
        System.out.println("Fraction 2: " + fraction2);

        fraction1.add(fraction2);
        System.out.println("Addition Result: " + fraction1);

        fraction1.sub(fraction2);
        System.out.println("Subtraction Result: " + fraction1);

        fraction1.multiplication(fraction2);
        System.out.println("Multiplication Result: " + fraction1);

        fraction1.division(fraction2);
        System.out.println("Division Result: " + fraction1);
    }
}
