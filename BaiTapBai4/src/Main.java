import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thập phân: ");
        int decimal = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int binary;
        while (decimal > 0) {
            binary = decimal % 2;
            stack.push(binary);
            decimal = decimal / 2;
        }
        System.out.println("Số nhị phân tương đương là");
        while (!stack.isEmpty()) {
            System.out.printf("%d",stack.pop());
        }
    }
}