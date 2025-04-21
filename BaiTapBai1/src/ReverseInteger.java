import java.util.Stack;

public class ReverseInteger {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] arr = {11, 4, 3, 5, 2, 6, 9, 7, 8, 10};
        for (int num : arr) {
            stack.push(num);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
