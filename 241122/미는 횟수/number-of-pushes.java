import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int cnt = 0;
        int len = a.length();
        boolean flag = false;
        for (int i=0; i<len; i++) {
            a = a.substring(len-1) + a.substring(0, len-1);
            cnt++;
            if (a.equals(b)) {
                flag = true;
                break;
            }
        }
        System.out.print(flag ? cnt : -1);
    }
}