public class FunctionalInterface {  //ek baar method bna dia then uska method refernce harr jagah paas krdie
    static void display(int a,int b) {

        int multiplication = a * b;
        System.out.println("Static method returns multiplication:\n" + multiplication);
    }

    void display2(int a,int b) {
        int sum = a + b;
        int subtract = a - b;
        System.out.println("Instance add method returns sum:\n" + sum + " \nand returns subtraction:\n" + subtract);

    }

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        MethodReferenceInterface methodreferenceinterface = FunctionalInterface::display;
        methodreferenceinterface.print(50,30);

        FunctionalInterface methodreference = new FunctionalInterface();
        MethodReferenceInterface methodreferenceinterface1 = methodreference::display2;
        methodreferenceinterface1.print(50,30);
    }
}

interface MethodReferenceInterface {
    void print(int a,int b);  //No Method body-only declare krdia implementation provide nhi kia
                              //jo print() method hai usmein 2 parameters hai and we are using uski functionality in my display(int a, int b)
}
