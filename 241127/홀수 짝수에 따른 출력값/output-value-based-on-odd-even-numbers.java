import java.util.Scanner;

public class Main {
    static int getSum(int n) {
        if (n <= 0)
            return 0;
        return n + getSum(n-2);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(getSum(n));
    }
}