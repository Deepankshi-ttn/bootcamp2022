import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TakeDropWhile {
    public static void main(String[] args) {
        System.out.println("TakeWhile number is < 15 using takeWhile operation: ");
        System.out.println(IntStream
                .rangeClosed(10,20)
                .takeWhile(x->x<=15)
                .boxed()
                .collect(Collectors.toList()));

        System.out.println("DropWhile number is <15 using dropWhile operation: ");
        System.out.println(IntStream
                .rangeClosed(10,20)
                .dropWhile(x->x<=15)
                .boxed()
                .collect(Collectors.toList()));
    }
}

