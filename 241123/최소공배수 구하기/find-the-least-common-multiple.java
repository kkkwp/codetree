import java.util.Scanner;

public class Main {
    static int getGcd(int n, int m) {
        int tmp = Math.min(n, m);
        for (int i=tmp; i>=2; i--) {
            if (n%i==0 && m%i==0)
                return i;
        }
        return 1;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int gcd = getGcd(n, m);
        System.out.print((n * m) / gcd);
    }
}