import java.util.Scanner;

public class Main {
    static int recur(int n) {
        if (n==1)
            return 2;
        if (n==2)
            return 4;
        return (recur(n-2) * recur(n-1)) % 100;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(recur(n));
    }
}