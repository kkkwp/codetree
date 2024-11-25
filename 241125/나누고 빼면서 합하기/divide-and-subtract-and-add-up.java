import java.util.Scanner;

public class Main {
    static int m;
    static int[] a;

    static int func() {
        int sum = 0;
        while (m>1) {
            sum += a[m-1];
            if (m%2==0)
                m /= 2;
            else
                m -= 1;
        }
        sum += a[m-1];
        return sum;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++)
            a[i] = sc.nextInt();
        System.out.print(func());
    }
}