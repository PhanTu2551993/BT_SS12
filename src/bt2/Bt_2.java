package bt2;

import java.util.Stack;

public class Bt_2 {
    public static void main(String[] args) {
        String inputString = ")(";
        if (check(inputString)) {
            System.out.println("Chuỗi ngoặc hợp lệ.");
        } else {
            System.out.println("Chuỗi ngoặc không hợp lệ.");
        }
    }

    public static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || !ktngoac(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean ktngoac(char open, char close) {
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
    }

}
