package bt13;
import java.util.Stack;

public class Bt_13 {
    public static void main(String[] args) {
        String input1 = "3424";
        String input2 = "987654";
        String input3 = "123454321";

        System.out.println(input1 + " là chuỗi giảm dần : " + ktChuoi(input1));
        System.out.println(input2 + " là chuỗi giảm dần : " + ktChuoi(input2));
        System.out.println(input3 + " là chuỗi giảm dần : " + ktChuoi(input3));
    }

    public static boolean ktChuoi(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = input.length() - 1; i >= 0; i--) {
            stack.push(input.charAt(i));
        }
        boolean flag = true;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char stackTop = stack.pop();
            if (currentChar != stackTop) {
                flag = false;
                break;
            }
        }
        return flag && stack.isEmpty();
    }
}
