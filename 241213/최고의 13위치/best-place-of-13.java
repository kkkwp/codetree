import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++)
                grid[i][j] = sc.nextInt();
        
        int maxVal = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<=n-3; j++) {
                int coins = grid[i][j] + grid[i][j+1] + grid[i][j+2];
                maxVal = Math.max(maxVal, coins);
            }
        }
        System.out.print(maxVal);
    }
}