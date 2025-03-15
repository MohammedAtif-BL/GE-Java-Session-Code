package java8features.practice.advance;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBySalary {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John", 55000),
                new Employee("Jane", 62000),
                new Employee("Bob", 75000),
                new Employee("Alice", 68000),
                new Employee("Eve", 48000)
        );

        Map<String, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(e -> {
                    if (e.getSalary() < 60000) {
                        return "<60K";
                    } else if (e.getSalary() <= 70000) {
                        return "60k-70k";
                    } else {
                        return ">70K";
                    }
                }));

        map.forEach((range,list)->{
            System.out.println(range+": "+list);
        });
    }
}
