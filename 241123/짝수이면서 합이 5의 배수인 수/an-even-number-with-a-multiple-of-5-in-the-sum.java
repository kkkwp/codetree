import java.util.Scanner;

public class Main {
    static boolean isMagicNumber(int n) {
        int sum = 0;
        int tmp = n;
        while (tmp > 0) {
            sum += tmp%10;
            tmp /= 10;
        }
        return n%2==0 && sum%5==0;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(isMagicNumber(n) ? "Yes" : "No");
    }
}