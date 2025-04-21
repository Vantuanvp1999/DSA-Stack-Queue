import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi để kiểm tra");
        String input = sc.nextLine();
        Stack<String> stack = new Stack<String>();
        Queue<String> queue = new LinkedList<>();
        input = input.toLowerCase().replaceAll("[^a-zA-Z]", "");
        String[] words = input.split("");
        for(String word : words){
            stack.push(word);
            queue.offer(word);
        }
        Boolean isPalindrome = true;
        while(!queue.isEmpty()&&!stack.isEmpty()){
            if(!queue.poll().equals(stack.pop())){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Đây là chuỗi Palindrome");
        }else {
            System.out.println("Đây không phải là chuỗi Palindrome");
        }
    }
}