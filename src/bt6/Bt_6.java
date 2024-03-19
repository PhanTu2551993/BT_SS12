package bt6;
import java.util.Stack;
public class Bt_6 {
    public static void main(String[] args) {
        String chuoi1 = "s * (s – a) * (s – b) * (s – c)";
        String chuoi2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String chuoi3 = "s * (s – a) * (s – b * (s – c)";
        String chuoi4 = "s * (s – a) * s – b) * (s – c)";

        System.out.println(kiemtraNgoac(chuoi1));
        System.out.println(kiemtraNgoac(chuoi2));
        System.out.println(kiemtraNgoac(chuoi3));
        System.out.println(kiemtraNgoac(chuoi4));
    }

    public static boolean kiemtraNgoac(String chuoi) {
        Stack<Character> bStack = new Stack<>();

        for (int i = 0; i < chuoi.length(); i++) {
            char sym = chuoi.charAt(i);

            if (sym == '(') {
                bStack.push(sym);
            } else if (sym == ')') {
                if (bStack.isEmpty()) {
                    return false;
                }
                char left = bStack.pop();
                if (left != '(') {
                    return false;
                }
            }
        }
        return bStack.isEmpty();
    }
}


