import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biểu thức: ");
        String word = sc.nextLine();
        if(isValidExpression(word)){
            System.out.println("Biểu thức dùng dấu ngoặc đúng!");

        }else {
            System.out.println("Biểu thức dùng dấu ngoặc sai");
        }

    }
    public static boolean isValidExpression(String expression) {
        Stack<Character> stack = new Stack<>();
        for(char c : expression.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }else if(c == ')' || c == '}' || c == ']') {
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if(isMatchingPair(c,top)){
                    return true;
                }

            }
        }
        return stack.isEmpty();
    }
    public static boolean isMatchingPair(char c1, char c2) {
        return (c1 == '(' && c2 == ')')|| (c1 == '{' && c2 == '}')||( c1 == '[' && c2 == ']');
    }


}