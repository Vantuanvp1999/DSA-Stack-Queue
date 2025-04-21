//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.enqueue(10);
        solution.enqueue(20);
        solution.enqueue(35);
        solution.displayQueue();
        solution.dequeue();
        solution.displayQueue();
    }
}