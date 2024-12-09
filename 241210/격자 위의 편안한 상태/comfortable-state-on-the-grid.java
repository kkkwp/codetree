import java.util.Scanner;

public class Main {
    static int[] dx = {0, 1, -1, 0};
    static int[] dy = {1, 0, 0, -1};
    static int n, m;
    static int[][] grid;

    static boolean inRange(int x, int y) {
        return 0<=x && x<n && 0<=y && y<n;
    }

    static int isStable(int x, int y) {
        int cnt = 0;
        for (int dir=0; dir<4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (inRange(nx, ny) && grid[nx][ny] == 1)
                cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        grid = new int[n][n];
        while (m-->0) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;
            grid[r][c] = 1;
            System.out.println(isStable(r, c) == 3 ? 1 : 0);
        }
    }
}