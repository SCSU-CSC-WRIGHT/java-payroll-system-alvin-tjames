import java.util.ArrayList;
import java.util.Scanner;

public class PayrollEntry {
    public static void main(String[] args) {
        // new input
        Scanner sc = new Scanner(System.in);
        // create array
        ArrayList<PayrollSystem> employees = new ArrayList<>();

        // test data
        employees.add(new PayrollSystem("John Doe", 101, "Engineering", 25.0, 45.0));
        employees.add(new PayrollSystem("Jane Smith", 102, "Marketing", 30.0, 40.0));
        employees.add(new PayrollSystem("Bob Johnson", 103, "HR", 20.0, 50.0));

        // user input
        System.out.println("\nWould you like to add new employees? (y/n)");
        String response = sc.nextLine().trim().toLowerCase();

        if (response.equals("yes")) {
            System.out.println("Enter the number of employees to add: ");
            int numEmployees = validInput(sc);

            for (int i = 0; i < numEmployees; i++) {
                employees.add(userInput(sc, i + 1));
            }
        }

        sc.close();

        // print all
        System.out.println("\nEmployee Payroll Information:");
        for (PayrollSystem employee : employees) {
            System.out.println(employee);
        }
    }

    private static PayrollSystem userInput(Scanner sc, int employeeNumber) {
        System.out.println("\nEnter the information of the employee " + employeeNumber + ": ");

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Employee ID: ");
        int employeeID = validInput(sc);

        System.out.println("Department: ");
        String department = sc.nextLine();

        System.out.println("Hourly Wage: ");
        double hourlyWage = validDoubleInput(sc, "Hourly Wage: ", true);

        System.out.println("Hours worked: ");
        double hoursWorked = validDoubleInput(sc, "Hours Worked: ", true);

        return new PayrollSystem(name, employeeID, department, hourlyWage, hoursWorked);
    }

    // catches for user input
    private static int validInput(Scanner sc) {
        while (true) {
            try{
            int value = sc.nextInt();
            sc.nextLine();
            return value;
        }catch (Exception e) {
            System.out.println("Invalid input");
            sc.nextLine();
        }
    }
}

private static double validDoubleInput(Scanner sc, String message, boolean flag) {
    while (true) {
        try {
            System.out.print(message);
            double value = sc.nextDouble();
            sc.nextLine();

            if (flag && value < 0) {
            System.out.println("Invalid input");
            }else{
                return value;
            }
        }catch (Exception e) {
            System.out.println("Invalid input");
            sc.nextLine();
        }
        }
    }
}