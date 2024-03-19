package bt5;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class Bt_5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập chuỗi cần kiểm tra Palindrome: ");
            String inputString = scanner.nextLine();
            inputString = inputString.toLowerCase().trim();
            Queue<Character> queue = new LinkedList<>();
            Stack<Character> stack = new Stack<>();
            for (char c : inputString.toCharArray()) {
                queue.offer(c);
                stack.push(c);
            }
            boolean check= true;
            while (!queue.isEmpty()) {
                if (!queue.poll().equals(stack.pop())) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Chuỗi \"" + inputString + "\" là chuỗi Palindrome.");
            } else {
                System.out.println("Chuỗi \"" + inputString + "\" không phải là chuỗi Palindrome.");
            }
        }
    }
