import java.util.Scanner;

public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n, m;

    static boolean inRange(int x, int y) {
        return 0<=x && x<n && 0<=y && y<m;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int[][] grid = new int[n][m];
        int dir = 0;
        int x = 0, y = 0;
        for (int i=1; i<=n*m; i++) {
            grid[x][y] = i;
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (!inRange(nx, ny) || grid[nx][ny] != 0)
                dir = (dir+1)%4;
            x += dx[dir];
            y += dy[dir];
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println();
        }
    }
}