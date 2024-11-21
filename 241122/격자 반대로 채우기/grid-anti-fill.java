import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;
        int[][] arr2d = new int[n+1][n+1];
        for (int j=n; j>=1; j--) {
            if ((n-j)%2 == 0) {
                for (int i=n; i>=1; i--)
                    arr2d[i][j] = num++;
            } else {
                for (int i=1; i<=n; i++)
                    arr2d[i][j] = num++;
            }
        }

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++)
                System.out.print(arr2d[i][j] + " ");
            System.out.println();
        }
    }
}