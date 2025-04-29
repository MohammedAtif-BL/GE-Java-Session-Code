package hashmap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Employee, String> obj = new HashMap<>();

        Employee employee1 = new Employee(101, "ABC");
        Employee employee2 = new Employee(102, "XYZ");

        obj.put(employee1,"Developer");

        System.out.println(obj.get(employee2));

        System.out.println(obj);
    }
}
