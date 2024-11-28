import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i=0; i<n; i++)
            a[i] = sc.nextInt();
        int[] b = new int[n];
        for (int i=0; i<n; i++)
            b[i] = sc.nextInt();
        
        Arrays.sort(a);
        Arrays.sort(b);

        boolean flag = true;
        for (int i=0; i<n; i++) {
            if (a[i] != b[i]) {
                flag = false;
                break;
            }
        }
        System.out.print(flag ? "Yes" : "No");
    }
}