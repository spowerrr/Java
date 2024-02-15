package Assignment3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            FulltimeEmployee fulltimeEmployee = createFulltimeEmployee(scanner);
            if (!containsEmployeeWithID(employees, fulltimeEmployee.getId())) {
                employees.add(fulltimeEmployee);
            } else {
                System.out.println("Employee with ID " + fulltimeEmployee.getId() + " already exists. Skipping...");
            }
        }
        for (int i = 0; i < 3; i++) {
            ParttimeEmployee parttimeEmployee = createParttimeEmployee(scanner);
            if (!containsEmployeeWithID(employees, parttimeEmployee.getId())) {
                employees.add(parttimeEmployee);
            } else {
                System.out.println("Employee with ID " + parttimeEmployee.getId() + " already exists. Skipping...");
            }
        }

        for (Employee employee : employees) {
            if (employee instanceof FulltimeEmployee) {
                System.out.println("Fulltime");
            } else if (employee instanceof ParttimeEmployee) {
                System.out.println("Parttime");
            }
            System.out.println(employee);
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        }

        Collections.sort(employees);

        System.out.println("\nEmployees based on Salary:");
        for (Employee employee : employees) {
            if (employee instanceof FulltimeEmployee) {
                System.out.println("Fulltime");
            } else if (employee instanceof ParttimeEmployee) {
                System.out.println("Parttime");
            }
            System.out.println(employee);
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        }
        System.out.println("Enter birth year:");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println(year + ":");
        for (Employee employee : employees) {
            if (employee.getDateOfBirth().get(Calendar.YEAR) == year) {
                if (employee instanceof FulltimeEmployee) {
                    System.out.println("Fulltime");
                } else if (employee instanceof ParttimeEmployee) {
                    System.out.println("Parttime");
                }
                System.out.println(employee);
                System.out.println("Salary: " + employee.getSalary());
                System.out.println();
            }
        }

    }

    private static boolean containsEmployeeWithID(ArrayList<Employee> employees, String id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    private static FulltimeEmployee createFulltimeEmployee(Scanner scanner) {
        System.out.println("\nFulltime Employee:");
        String name = getUserInput(scanner, "Name:");
        String id = getUserInput(scanner, "ID:");
        int day = getUserIntInput(scanner, "Day of Birth:");
        int month = getUserIntInput(scanner, "Month of Birth:");
        int year = getUserIntInput(scanner, "Year of Birth:");
        double monthlySalary = getUserDoubleInput(scanner, "Monthly Salary:");
        return new FulltimeEmployee(name, id, day, month, year, monthlySalary);
    }

    private static ParttimeEmployee createParttimeEmployee(Scanner scanner) {
        System.out.println("\nParttime Employee:");
        String name = getUserInput(scanner, "Name:");
        String id = getUserInput(scanner, "ID:");
        int day = getUserIntInput(scanner, "Day of Birth:");
        int month = getUserIntInput(scanner, "Month of Birth:");
        int year = getUserIntInput(scanner, "Year of Birth:");
        double hours = getUserDoubleInput(scanner, "Hours Worked:");
        double hourlyRate = getUserDoubleInput(scanner, "Hourly Rate:");
        return new ParttimeEmployee(name, id, day, month, year, hours, hourlyRate);
    }

    private static String getUserInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    private static int getUserIntInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid,enter a valid input.");
            }
        }
    }

    private static double getUserDoubleInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid,enter a valid input.");
            }
        }
    }

}
