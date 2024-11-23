import java.util.Scanner;

public class Main {
    static boolean contains369(int n) {
        int tmp = n;
        while (tmp > 0) {
            int digit = tmp%10;
            if (digit == 3 || digit == 6 || digit == 9)
                return true;
            tmp /= 10;
        }
        return false;
    }

    static boolean isMasicNumber(int n) {
        return n%3==0;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for (int i=a; i<=b; i++) {
            if (isMasicNumber(i) || contains369(n))
                cnt++;
        }
        System.out.print(cnt);
    }
}