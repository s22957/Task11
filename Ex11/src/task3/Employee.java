package task3;

import java.time.LocalDate;

public class Employee extends Person{

    protected final int hireDate;
    protected final String companyName;
    protected final double salary;

    public Employee(String firstName, String lastName, int birthdayYear,
                    int hireDate, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    protected int getJobSeniority(){
        return LocalDate.now().getYear() - hireDate;
    }

    public double getSalary() {
        return salary;
    }
}
