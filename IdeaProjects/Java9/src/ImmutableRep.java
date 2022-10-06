import java.util.Objects;

record Student(String name, int id, int age)
{
    static int count=0;
    static void incrementCount()
    {
        count++;
    }
    Student{
        Objects.requireNonNull(name);
        Objects.requireNonNull(id);
        Objects.requireNonNull(age);
        incrementCount();
    }
}
public class ImmutableRep{
    public static void main(String[] args) {
        Student stu1=new Student("Deepu",1,24);
        Student stu2=new Student("Aditya",2,24);
        Student stu3=new Student("Yash",3,23);
        Student stu4=new Student("Sohit",1,25);
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);
        System.out.println(stu4);
        System.out.println("Are Student 1 and Student 4 equal?");
        System.out.println(stu1.equals(stu2));
        System.out.println("Number of students created: ");
        System.out.println(Student.count);
    }
}


