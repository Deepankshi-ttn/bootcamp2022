import java.util.stream.IntStream;

public class RangeClosed {
    public static void main(String[] args) {
        System.out.println("Without using rangeClosed on {10-20}:");
        IntStream.range(10,15).
                forEach(System.out::println);
        System.out.println("With using rangeClosed on {10-20}:");
        IntStream.rangeClosed(10,15).
                forEach(System.out::println);

    }
}
