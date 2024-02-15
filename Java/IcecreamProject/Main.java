package IcecreamProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Icecream> icecreams = new ArrayList<Icecream>();

    public static boolean alreadyExists(Icecream I) {
        boolean flag = false;
        for (Icecream x : icecreams) {
            if (x.equals(I)) {
                flag = true;
            }
        }
        return flag;
    }

    public static Icecream findMaxIcecream() {
        Icecream max = icecreams.get(0);
        for (Icecream I : icecreams) {
            if (I.getIcecreamPrice() > max.getIcecreamPrice()) {
                max = I;
            }
        }
        return max;
    }

    public static void searchByComapny(String company) {
        for (Icecream I : icecreams) {
            if (I.getIcecreamCompany().equals(company)) {
                System.out.println(I.toString());
            }
        }
    }

    public static void main(String[] args) {
        // Icecream I1 = new Icecream("Vanilla", "Igloo", 250.0);
        // Icecream I2 = new Icecream("Vanilla", "Igloo", 250.0);
        // System.out.println(I1.comapareTo(I2));

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Enter an icecream\n2. Exit");
            int x = input.nextInt();
            if (x == 2) {
                break;
            } else if (x == 1) {
                System.out.println("Type: ");
                String type = input.next();
                System.out.println("Company: ");
                String company = input.next();
                System.out.println("Price: ");
                double price = input.nextDouble();
                Icecream I = new Icecream(type, company, price);
                if (alreadyExists(I)) {
                    System.out.println("Icecream already exists in the arraylist");
                } else {
                    icecreams.add(I);
                    System.out.println("Icecream added successfully!");
                }
            }
        }
        System.out.println("Items in the arraylist: ");
        for (Icecream I : icecreams) {
            System.out.println(I.toString());
        }
        System.out.println("Icecream with highest price: ");
        System.out.println(findMaxIcecream());
        // System.out.println("Enter the company name you are looking for: ");
        // String company = input.next();
        // searchByComapny(company);
        // close.input();
    }
}
