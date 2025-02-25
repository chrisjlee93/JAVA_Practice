public class Employee {

    private int id;
    private double salary;
    private Address address;


    public Employee(int id, double s, Address addr) {
        this.id = id;
        this.salary = s;
        this.address = addr;
    }

    public Employee(int id, double s, String c, String st) {
        this.id = id;
        this.salary = s;
        this.address = new Address(c, st);
    }

    public void setId(int i) {
        id = i;

    }

    public void setSalary(double s) {
        salary = s;

    }


    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

}

