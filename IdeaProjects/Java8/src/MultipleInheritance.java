interface Clickable {
    default void click() {
        System.out.println("click the button");
    }
}
interface Accessible {
    default void access() {
        System.out.println("access the button");
    }
}

public class MultipleInheritance implements Clickable,Accessible {
    public static void main(String[] args) {
        MultipleInheritance button = new MultipleInheritance();
        button.click();
        button.access();
    }
}
