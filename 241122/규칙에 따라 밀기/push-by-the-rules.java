import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String cmd = sc.next();

        int idx = 0;
        int n = a.length();
        for (int i=0; i<cmd.length(); i++) {
            if (cmd.charAt(i) == 'L')
                a = a.substring(1) + a.substring(0, 1);
            else
                a = a.substring(n-1) + a.substring(0, n-1);
        }
        System.out.print(a);
    }
}