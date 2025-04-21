import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> Stack;
    public MyGenericStack() {
        Stack = new LinkedList<>();
    }
    public void push(T t) {
        Stack.addFirst(t);
    }
    public T pop() {
        if (Stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return Stack.removeFirst();
    }
    public int size() {
        return Stack.size();
    }
    public boolean isEmpty() {
        if (Stack.size() == 0) {
            return true;
        }
        return false;
    }
}
