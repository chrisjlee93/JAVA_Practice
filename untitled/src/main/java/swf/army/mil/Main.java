
package swf.army.mil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        Employee [] emps = new Employee[4];

        for ( int i = 0; i <4 ; i++ )
            emps[i] = new Employee();

        for (Employee emp : emps)
            System.out.println(emp);

    }
}


class Employee {
    private String id;
    private String name;
    private double salary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String ID, String name, double salary) {
        this.id = ID;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
        this.id = "null";
        this.name = "null";
        this.salary = 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}




