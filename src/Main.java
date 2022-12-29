import course1.Employee;

public class Main {
    public static void main(String[] args) {
        printEmployee();
        System.out.println("Cумма затрат на зарплаты за месяц: " + amountSalary());
        System.out.println("Сотрудник с минимальной зарплатой " + minSalary());
        System.out.println("Сотрудник с максимальной зарплатой "+ maxSalary());
        System.out.println("Средняя зарплата = " + averageSalary());
        printFullName();

    }

    public final static Employee[] employees = {
            new Employee("Иванов Иван Иванович", 1, 1000),
            new Employee("Сергеев Сергей Сергеевич", 1, 2000),
            new Employee("Андреев Андерей Андреевич", 2, 3000),
            new Employee("Николаев Николай Николаевич", 2, 4000),
            new Employee("Фёдоров Фёдор Фёдорович", 3, 5000),
            new Employee("Максимов Максим Максимович", 3, 6000),
            new Employee("Витальев Виталий Витальевич", 4, 7000),
            new Employee("Владов Влад Владович", 4, 8000),
            new Employee("Владимиров Владимир Владимирович", 5, 9000),
            new Employee("Олегов Олег Олегович", 5, 10000)
    };

    public static void printEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int amountSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee minSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee maxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static int averageSalary() {
        return amountSalary() / (int) employees.length;//Правильнее делить на кол-во сотрудников, но так как у нас готовый массив, можем делать на длину массива
    }
    public static void printFullName(){
        for (Employee employee : employees){
            System.out.println(employee.getFio());
        }
    }
}