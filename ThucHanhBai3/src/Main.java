//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    MyQueue m = new MyQueue(10);
    m.enqueue(1);
    m.enqueue(2);
    m.enqueue(3);
    m.enqueue(4);
    m.enqueue(5);
    m.dequeue();
    m.dequeue();
    
    }
}