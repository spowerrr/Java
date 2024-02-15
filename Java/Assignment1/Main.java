package Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<University> universities = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            universities.add(createPublicUniversityFromUserInput(scanner));
        }

        for (int i = 0; i < 3; i++) {
            universities.add(createPrivateUniversityFromUserInput(scanner));
        }

        System.out.println("UGC Approved");
        for (University university : universities) {
            if (university.isUgcApproved()) {
                System.out.println(university);
            }
        }

        System.out.println("politics not allowed");
        for (University university : universities) {
            if (university instanceof PublicUniversity) {
                if (!((PublicUniversity) university).isPoliticsAllowed()) {
                    System.out.println(university);
                }
            }
        }

        System.out.println(" address:");
        String inputAddress = scanner.nextLine();
        System.out.println("Universities from " + inputAddress + ":");
        for (University university : universities) {
            if (university.getAddress().equalsIgnoreCase(inputAddress)) {
                System.out.println(university);
            }
        }

        System.out.println("Details of every university:");
        for (University university : universities) {
            System.out.println("\n" + university);
            if (university instanceof PublicUniversity) {
                System.out.println("Public");
                System.out.println("Number of Halls: " + ((PublicUniversity) university).getNumberOfHalls());
                System.out.println("Politics Allowed: " + ((PublicUniversity) university).isPoliticsAllowed());
            } else if (university instanceof PrivateUniversity) {
                System.out.println("Private");
                System.out.println(
                        "Number of Trustee Members: " + ((PrivateUniversity) university).getNumberOfTrusteeMember());
            }
        }
    }

    private static PublicUniversity createPublicUniversityFromUserInput(Scanner scanner) {
        System.out.print(" name: ");
        String name = scanner.nextLine();
        System.out.print("year: ");
        int establishedYear = Integer.parseInt(scanner.nextLine());
        System.out.print("address: ");
        String address = scanner.nextLine();
        System.out.print(" UGC Approved(true/false): ");
        boolean ugcApproved = Boolean.parseBoolean(scanner.nextLine());
        System.out.print(" halls: ");
        int numberOfHalls = Integer.parseInt(scanner.nextLine());
        System.out.print("politics allowed(true/false): ");
        boolean politicsAllowed = Boolean.parseBoolean(scanner.nextLine());

        return new PublicUniversity(name, establishedYear, address, ugcApproved, numberOfHalls, politicsAllowed);
    }

    private static PrivateUniversity createPrivateUniversityFromUserInput(Scanner scanner) {
        System.out.print(" name: ");
        String name = scanner.nextLine();
        System.out.print("year: ");
        int establishedYear = Integer.parseInt(scanner.nextLine());
        System.out.print(" address: ");
        String address = scanner.nextLine();
        System.out.print("UGC Approved(true/false) ");
        boolean ugcApproved = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("trustee members: ");
        int numberOfTrusteeMember = Integer.parseInt(scanner.nextLine());

        return new PrivateUniversity(name, establishedYear, address, ugcApproved, numberOfTrusteeMember);
    }
}
