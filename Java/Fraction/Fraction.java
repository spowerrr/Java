package Fraction;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.denominator = denominator;
    }

    public void add(Fraction fraction) {
        int newNumerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
        int newDenominator = this.denominator * fraction.denominator;
        this.numerator = newNumerator;
        this.denominator = newDenominator;
    }

    public void sub(Fraction fraction) {
        int newNumerator = this.numerator * fraction.denominator - fraction.numerator * this.denominator;
        int newDenominator = this.denominator * fraction.denominator;
        this.numerator = newNumerator;
        this.denominator = newDenominator;
    }

    public void multiplication(Fraction fraction) {
        this.numerator *= fraction.numerator;
        this.denominator *= fraction.denominator;
    }

    public void division(Fraction fraction) {
        if (fraction.numerator == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        this.numerator *= fraction.denominator;
        this.denominator *= fraction.numerator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
