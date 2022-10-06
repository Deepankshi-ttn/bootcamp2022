import java.util.stream.IntStream;
public class IteratorStream {
    public static void main(String[] args) {
        System.out.println("Iterator stream method using a stream");
        IntStream
                .iterate(1,i->i<=30,i->i*3)
                .forEach(System.out::println);
    }
}
