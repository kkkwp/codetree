import java.util.Scanner;

public class Main {
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};
    static int n;
    static int[][] grid;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        grid = new int[n][n];
        int x = n/2, y = n/2;
        int dir = 0;
        int num = 1;
        int cnt = 1;
        while (num <= n*n) {
            for (int d=0; d<2 && num<=n*n; d++) {
                for (int i=0; i<cnt && num<=n*n; i++) {
                    grid[x][y] = num++;
                    x += dx[dir];
                    y += dy[dir];
                }
                dir = (dir+1)%4;
            }
            cnt++;
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println();
        }
    }
}