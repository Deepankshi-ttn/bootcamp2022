public class Employee {

    private String first_name;
    private String last_name;
    private int age ;
    private String designation;

    public Employee(String first_name, String last_name, int age, String designation) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.designation = designation;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return this.first_name + " " + this.last_name+ " "+ this.age+ " "+ this.designation;
    }
    public static void main(String aA[])
    {

        Employee a=new Employee("Deepankshi","Arora",24,"JVM");
        System.out.println(a);
    }
}