import java.util.Scanner;

public class Main {
    static boolean isPerfect(int n) {
        if (n%2==0)
            return false;
        if (n%10==5)
            return false;
        if (n%3==0 && n%9!=0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for (int i=a; i<=b; i++) {
            if (isPerfect(i))
                cnt++;
        }
        System.out.print(cnt);
    }
}