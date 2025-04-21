public class StackCLient {
    public static void main(String[] args) {
        MyStack stack = new MyStack(10);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1. Size of stack after push operation: " + stack.size());
        System.out.println("2. Pop elements from stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("3. size of stack after pop operation: " + stack.size());
    }
}
