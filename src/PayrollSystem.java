// necessary information
public class PayrollSystem {
    private String name;
    private int employeeId;
    private String department;
    private double hourlyWage;
    private double hoursWorked;

    // Constructor
    public PayrollSystem(String name, int employeeId, String department, double hourlyWage, double hoursWorked) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage >= 0) {  // catch
            this.hourlyWage = hourlyWage;
        } else {
            System.out.println("No valid hourly wage.");
        }
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked >= 0) {  // catch
            this.hoursWorked = hoursWorked;
        } else {
            System.out.println("No valid hours worked.");
        }
    }
    // calculations
    private double overtimePay() {
        if (hoursWorked > 40) {
            double overtimeHours = Math.max(0, hoursWorked - 40);
            return overtimeHours * (hourlyWage * 1.5);
        }
        return 0.0;
    }

    public double weeklySalary() {
        double regularPay = Math.min(hoursWorked, 40) * hourlyWage; // regular pay for first 40 hours
        return regularPay + overtimePay();
    }

    // display how we want
    @Override
    public String toString() {
        return "Employee{name='" + name + "', employeeId=" + employeeId +
                ", department='" + department + "', hourlyWage=" + hourlyWage +
                ", hoursWorked=" + hoursWorked + ", overtimePay=" + overtimePay() +
                ", weeklySalary=" + weeklySalary() + "}";
    }
}
