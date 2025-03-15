package java8features.practice.advance;

import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 50000);
        Employee employee2 = new Employee("Jane", 60000);
        Employee employee3 = new Employee("Bob", 70000);

        List<Employee> employeeList = List.of(employee1, employee2, employee3);

        List<Employee> list = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(2)
                .toList();

        System.out.println(list);


    }
}
