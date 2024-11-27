import java.util.Scanner;

public class Main {
    static int fact(int n) {
        if (n==0 || n==1)
            return 1;
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fact(n));
    }
}