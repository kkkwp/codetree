import java.util.Scanner;

public class Main {
    static int fibo(int n) {
        if (n==1 || n==2)
            return 1;
        return fibo(n-2) + fibo(n-1);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibo(n));
    }
}