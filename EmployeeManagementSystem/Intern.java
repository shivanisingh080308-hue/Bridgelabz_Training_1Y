
package EmployeeManagementSystem;

public class Intern extends Employee{
    int internshipeduration;

    public Intern(String name, int id, double salary, int internshipduration) {
        super(name, id, salary);
        this.internshipeduration=internshipduration;
    }

    public void displayDetails() {
        super.displayDetails(); // Call the base class method
        System.out.println("Duration  of Internship : " +internshipeduration);
    }
}
