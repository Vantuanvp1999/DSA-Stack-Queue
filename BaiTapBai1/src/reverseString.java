import java.util.Stack;

public class reverseString {
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : str.toCharArray()){
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("chuỗi ban đầu "+str);
        reverseString(str);
        System.out.println("chuỗi sau khi đảo ngược "+reverseString(str));
    }
}
