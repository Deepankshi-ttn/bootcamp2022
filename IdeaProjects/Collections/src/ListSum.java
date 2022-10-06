import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListSum {
    public static void main(String[] args)
    {
        List<Float> list = new ArrayList<>();
        list.add(2.2f);
        list.add(5.3f);
        list.add(7.4f);
        list.add(6.2f);
        list.add(1.3f);

        ListIterator<Float> it = list.listIterator();
        float sum =0;
        while(it.hasNext())
        {
            sum = sum + it.next();
        }

        System.out.println("Sum of the elements :\n" + sum);
    }
}