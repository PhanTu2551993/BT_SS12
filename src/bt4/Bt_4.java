package bt4;
import java.util.Scanner;
import java.util.Stack;
public class Bt_4 {
    public static void main(String[] args) {
            Stack<String> wordStack = new Stack<>();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bạn muốn nhập mây từ: ");
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập từ thứ " + (i + 1) + ": ");
                String word = scanner.nextLine();
                wordStack.push(word);
            }
            System.out.println("Các từ theo thứ tự đảo ngược:");
            while (!wordStack.isEmpty()) {
                System.out.print(wordStack.pop()+" ");
            }
        }
    }

