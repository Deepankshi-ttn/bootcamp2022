import java.util.*;

class Employee {
    int age;
    String name;
    String designation;

    Employee(int age, String name, String designation) {
        this.age = age;
        this.name = name;
        this.designation = designation;
    }

    public String toString() {

        return "Age of the employee is :" + age + "" + "\nName of the employee is :" + name + "" + "\nDesignation of the employee is :" + designation;
    }

}

public class MapInterface {

    public static void main(String args[]) {
        Employee e1 = new Employee(22, "Sohit", "Director");
        Employee e2 = new Employee(24, "Sonia", "CEO");
        Employee e3 = new Employee(21, "Ayush", "Manager");
        Employee e4 = new Employee(31, "Tanu", "Trainee");

        Map<Employee, Integer> map = new LinkedHashMap<>();

        map.put(e1, 650);
        map.put(e2, 2049);
        map.put(e3, 1567);
        map.put(e4, 3434);
        for (Employee key : map.keySet()) {
            System.out.println(key + ":\nSalary of the employee: " + map.get(key));
        }
    }
}
