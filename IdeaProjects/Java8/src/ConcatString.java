//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//class Employee{
//    String full_Name;
//    long emp_salary;
//    String emp_city;
//
//    public Employee(String  full_Name,long emp_salary,String emp_city)
//    {
//        this.full_Name=full_Name;
//        this.emp_salary=emp_salary;
//        this.emp_city=emp_city;
//    }
//}
//
//public class ConcatString {
//    public static void main(String[] args) {
//        Employee[] employees=new Employee[5];
//        employees[0]=new Employee("Deepu Deepankshi dep",5000,"Delhi");
//        employees[1]=new Employee("Kashish Arora ",6700,"Gujarat");
//        employees[2]=new Employee("Ritu Sharma Stronger",1200,"Delhi");
//        employees[3]=new Employee("Lata Kumar Mangeshkar",4000,"Delhi");
//        employees[4]=new Employee("Rahul Kumar",2400,"Maharashtra");
//
//        System.out.println(Stream.of(employees)
//                .filter(e-> e.emp_salary<5000 && e.emp_city.equals("Delhi") )
//                .map(e->e.full_Name.split(" ")[0])
//                .collect(Collectors.toSet()));;
//
//    }
//}
