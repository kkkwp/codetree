import java.util.Scanner;

public class Main {
    static final int OFFSET = 100;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] grid = new int[201][201];
        for (int i=1; i<=n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;
            if (i%2==1) {
                for (int x=x1; x<x2; x++)
                    for (int y=y1; y<y2; y++)
                        grid[x][y] = 1;
            } else {
                for (int x=x1; x<x2; x++)
                    for (int y=y1; y<y2; y++)
                        grid[x][y] = -1;
            }
        }

        int blue = 0;
        for (int i=0; i<=200; i++)
            for (int j=0; j<=200; j++)
                if (grid[i][j] == -1)
                    blue++;
        System.out.print(blue);
    }
}