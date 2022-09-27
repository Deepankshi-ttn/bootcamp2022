import java.util.*;
class Xdone{
    public static void main(String args[]) {

        Scanner x = new Scanner(System.in);
        System.out.println("enter the input");
        List<String> Data = new ArrayList<>();
        while (true) {
            String s = x.nextLine();
            if (s.equals("XDONE")) {
                break;
            }
            Data.add(s);}
        System.out.println(Data);
    }}
