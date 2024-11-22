import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        for (int i=0; i<n; i++) {
            char ch = s.charAt(i);
            if (ch <= 'Z')
                System.out.print((char)(ch - 'A' + 'a'));
            else
                System.out.print((char)(ch - 'a' + 'A'));
        }
    }
}