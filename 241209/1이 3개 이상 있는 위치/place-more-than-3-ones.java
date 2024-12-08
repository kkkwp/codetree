import java.util.Scanner;

public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int n;
    static int[][] grid;

    static boolean inRange(int x, int y) {
        return 0<=x && x<n && 0<=y && y<n; 
    }

    static int countOnes(int x, int y) {
        int cnt = 0;
        for (int dir=0; dir<4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (inRange(nx, ny) && grid[nx][ny]==1)
                cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        grid = new int[n][n];
        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++)
                grid[i][j] = sc.nextInt();
        
        int cnt = 0;
        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++)
                if (countOnes(i, j) >= 3)
                    cnt++;
        System.out.print(cnt);
    }
}