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

    // calculation
    public double weeklySalary() {
        double weeklySalary;
        if (hoursWorked <= 40) {
            weeklySalary = hourlyWage * hoursWorked;
        } else {
            double baseSalary = hourlyWage * 40;
            double overtimeRate = (hoursWorked - 40) * (hourlyWage * 1.5);
            weeklySalary = baseSalary + overtimeRate;
        }
        return weeklySalary;
    }

    // display how we want
    @Override
    public String toString() {
        return "Employee{name='" + name + "', employeeId=" + employeeId +
                ", department='" + department + "', hourlyWage=" + hourlyWage +
                ", hoursWorked=" + hoursWorked + ", weeklySalary=" + weeklySalary() + "}";
    }
}
