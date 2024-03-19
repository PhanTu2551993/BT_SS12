package bt11;

import java.util.Stack;

public class Bt_11 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1,2,3,4,4,9,9,10};
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || arr[i] > stack.peek()){
                stack.push((arr[i]));
            }
        }
        System.out.println("Phần tử lớn nhất là : "+stack.peek());
    }
}
