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

        // print all
        for (PayrollSystem employee : employees) {
            System.out.println(employee);
        }
    }
}
