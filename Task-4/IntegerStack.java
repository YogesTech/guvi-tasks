import java.util.ArrayDeque;
import java.util.Deque;

public class IntegerStack {
    static Deque<Integer> stack = new ArrayDeque<>();

    public static void pushElement(int element) {
        stack.push(element);
    }

    public static void popElement() {
        if (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        } else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }

    public static void isStackEmpty() {
        System.out.println("Is stack empty? " + stack.isEmpty());
    }

    public static void main(String[] args) {
        isStackEmpty();
        pushElement(10);
        pushElement(20);
        pushElement(30);
        popElement();
        popElement();
        popElement();
        popElement();
        isStackEmpty();
    }
}
