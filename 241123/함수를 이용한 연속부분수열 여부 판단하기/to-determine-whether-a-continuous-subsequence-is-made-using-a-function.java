import java.util.Scanner;

public class Main {
    static boolean isSubsequence(int[] a, int[] b, int n1, int n2) {
        if (n1 < n2)
            return false;
            
        for (int i=0; i<=n1-n2; i++) {
            boolean flag = true;
            for (int j=0; j<n2; j++) {
                if (a[i+j] != b[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i=0; i<n1; i++)
            a[i] = sc.nextInt();
        for (int i=0; i<n2; i++)
            b[i] = sc.nextInt();
        System.out.print(isSubsequence(a, b, n1, n2) ? "Yes" : "No");
    }
}