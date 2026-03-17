
public class Employee {

    public int id;
    protected String dept;
    private int sal;

    void setSalary(int s) {
        sal = s;
    }

    int getSalary() {
        return sal;
    }

    public static void main(String[] args) {

        Manager m = new Manager();

        m.id = 56;
        m.dept = "cs";
        m.setSalary(1000000000);

        m.show();
    }
}

class Manager extends Employee {

    public void show() {
        System.out.println("Employee ID: " + id);
        System.out.println("Department: " + dept);
        System.out.println("Salary: " + getSalary());
    }
}