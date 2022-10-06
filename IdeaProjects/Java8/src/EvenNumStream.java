import java.util.Arrays;
import java.util.List;
public class EvenNumStream {
    public static void main(String[] args) {

        System.out.println("Even numbers in the list are:");
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                num.
                stream().filter(value -> value % 2 == 0).
                forEach(System.out::println);

    }
}
