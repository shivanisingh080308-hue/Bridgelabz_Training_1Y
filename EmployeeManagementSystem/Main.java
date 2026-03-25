
package EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("shivani", 101, 100000, 100);
        Developer developer = new Developer("Akshat", 1234, 50000, "Java");
        Intern intern = new Intern("Vedant", 155, 20000, 3);
        System.out.println("----Manager Details-----");
        manager.displayDetails();
        System.out.println("-----Developer Details-----");
        developer.displayDetails();
        System.out.println("-----Intern Details-----");
        intern.displayDetails();
    }
}
