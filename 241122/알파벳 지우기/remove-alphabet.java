import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        String num1 = "";
        String num2 = "";
        for (int i=0; i<s1.length(); i++) {
            char ch = s1.charAt(i);
            if ('0' <= ch && ch <='9')
                num1 += ch;
        }
        for (int i=0; i<s2.length(); i++) {
            char ch = s2.charAt(i);
            if ('0' <= ch && ch <= '9')
                num2 += ch;
        }

        System.out.print(Integer.parseInt(num1) + Integer.parseInt(num2));
    }
}