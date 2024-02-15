package Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Indoor Patient ");
            patients.add(createIndoorPatientFromUserInput(scanner));
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Outdoor Patient ");
            patients.add(createOutdoorPatientFromUserInput(scanner));
        }

        Collections.sort(patients);

        System.out.println("\nPatients with high or low blood pressure:");
        for (Patient patient : patients) {
            if (patient.hasHighOrLowBloodPressure()) {
                System.out.println(patient);
            }
        }

        System.out.println("\nDetails of every patient:");
        for (Patient patient : patients) {
            System.out.println("\n" + patient);
        }
    }

    private static IndoorPatient createIndoorPatientFromUserInput(Scanner scanner) {
        System.out.print("Enter Patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Patient age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Systolic blood pressure: ");
        int systolic = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Diastolic blood pressure: ");
        int diastolic = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number of days in hospital: ");
        int daysInHospital = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter daily fee: ");
        double dailyFee = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter a date ");
        String admissionDate = scanner.nextLine();
        System.out.print("Enter bed No: ");
        int bedNo = Integer.parseInt(scanner.nextLine());

        return new IndoorPatient(name, age, systolic, diastolic, daysInHospital, dailyFee, admissionDate, bedNo);
    }

    private static OutdoorPatient createOutdoorPatientFromUserInput(Scanner scanner) {
        System.out.print("Enter Patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Patient age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Systolic blood pressure: ");
        int systolic = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Diastolic blood pressure: ");
        int diastolic = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter consultation fee: ");
        double consultationFee = Double.parseDouble(scanner.nextLine());

        return new OutdoorPatient(name, age, systolic, diastolic, consultationFee);

    }
}
