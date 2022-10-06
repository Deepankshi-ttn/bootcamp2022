import java.util.Stack;

class MyStack {
    Stack<Integer> stk;
    Integer minElement;

    MyStack() { stk = new Stack<Integer>();
    }

    void getMin() {

        if (stk.isEmpty())
            System.out.println("Stack is empty");

        else
            System.out.println("The minimum element in the " + " stack is: " + minElement);
    }

    void peek() { if (stk.isEmpty()) {
        System.out.println("Stack is empty "); return;
    }

        Integer topElement = stk.peek(); // Top element.

        System.out.print("Top Most Element in the stack is: ");

        if (topElement < minElement)
            System.out.println(minElement);
        else
            System.out.println(topElement);
    }

    void pop()
    {
        if (stk.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("The top most element has removed: ");
        Integer t = stk.pop();

        if (t < minElement) {
            System.out.println(minElement);
            minElement = 2 * minElement - t;
        }

        else
            System.out.println(t);
    }

    void push(Integer x) { if (stk.isEmpty())
    {
        minElement = x;
        stk.push(x);
        System.out.println("Element Inserted: " + x); return;
    }

        if (x < minElement) {
            stk.push(2 * x - minElement);
            minElement = x;
        }

        else
            stk.push(x);

        System.out.println("Elements Inserted: " + x);
    }
};
public class SpecialStack {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(4);
        s.push(3);
        s.getMin();
        s.push(3);

        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
    }
}
