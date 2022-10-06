import java.util.Arrays;
import java.util.Optional;

public class OptionalToStream {
    public static void main(String[] args) {
        Optional<Integer> optionalInteger = Arrays.asList(1,2,3,4,5,6,7,8,9,10)
                .stream()
                .filter(e->e<10)
                .findFirst()
                .or(()-> Optional.of(-1));
        System.out.println(optionalInteger.get());

    }
}
