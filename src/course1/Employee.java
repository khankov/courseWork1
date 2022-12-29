package course1;

public class Employee {
    private static int count = 1;
    private String fio;
    private int department;
    private int salary;
    private final int id;

    public Employee(String fio, int department, int salary) {
        this.id = count++;
        this.fio = fio;
        this.department = department;
        this.salary = salary;
    }

    public String getFio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }



    @Override
    public String toString() {
        return "fio: " + fio + ", Department = " + department + ", id = " + id + ", salary = " + salary;
    }
}
