class Input
{

    static int Age=24;
    static String First_Name="DEEPANKSHI";
    static String Last_Name="ARORA";


    public static void show()
    {
        System.out.println("Static method");
        System.out.println(First_Name+ " " +Last_Name +" " +Age);

    }

    static
    {
        System.out.println("Static block");
        System.out.println(First_Name+ " " +Last_Name +" " +Age);

    }

    public static void main(String args[])
    {

        show();

    }



}