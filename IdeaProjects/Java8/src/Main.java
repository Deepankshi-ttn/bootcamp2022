interface concatenation{
    String concatMethod(String a, String b);
}
interface greater{
    boolean greaterMax(int x,int y);
}
interface increment{
    int incrementMethod(int a);
}
interface uppercase{
    String upperMethod(String a);
}
public class Main {
    public static void main(String[] args) {
        greater gr = (int x,int y)->{
            if(x>y)
                return true;
            else
                return false;
        };
        increment ic = (int a)-> ++a;
        uppercase uc = (String a)->a.toUpperCase();
        concatenation cm = (String a, String b)->a+b;
        System.out.println(cm.concatMethod("Hello","world!"));
        System.out.println(gr.greaterMax(4,5));
        System.out.println(ic.incrementMethod(5));
        System.out.println(uc.upperMethod("deepankshi"));
    }
}

