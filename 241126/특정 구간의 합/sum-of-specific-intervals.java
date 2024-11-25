import java.util.Scanner;

public class Main {
    static int[] a;

    static int getSum(int a1, int a2) {
        int sum = 0;
        for (int i=a1; i<=a2; i++)
            sum += a[i];
        return sum;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++)
            a[i] = sc.nextInt();
        for (int i=0; i<m; i++) {
            int a1 = sc.nextInt() - 1;
            int a2 = sc.nextInt() - 1;
            System.out.println(getSum(a1, a2));
        }
    }
}