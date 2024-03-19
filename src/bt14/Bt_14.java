package bt14;
import java.util.Stack;
public class Bt_14 {
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static boolean containsPrimeNumbers(String input) {
            Stack<Character> stack = new Stack<>();
            for (char ch : input.toCharArray()) {
                if (Character.isDigit(ch)) {
                    stack.push(ch);
                }
            }

            while (!stack.isEmpty()) {
                char digitChar = stack.pop();
                int digit = Character.getNumericValue(digitChar);
                if (!isPrime(digit)) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            String input1 = "abc123xyz";
            String input2 = "257983";
            String input3 = "246810";

            System.out.println(input1 + " chứa số nguyên tố: " + containsPrimeNumbers(input1));
            System.out.println(input2 + " chứa số nguyên tố: " + containsPrimeNumbers(input2));
            System.out.println(input3 + " chứa số nguyên tố: " + containsPrimeNumbers(input3));
        }

}
