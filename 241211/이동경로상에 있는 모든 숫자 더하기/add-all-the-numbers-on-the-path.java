import java.util.Scanner;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n, t;
    static int[][] grid;

    static boolean inRange(int x, int y) {
        return 0<=x && x<n && 0<=y && y<n;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();
        String cmd = sc.next();

        grid = new int[n][n];
        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++)
                grid[i][j] = sc.nextInt();
        
        int x = n/2, y = n/2;
        int sum = grid[x][y];
        int dir = 0;
        for (char c : cmd.toCharArray()) {
            if (c=='L')
                dir = (dir+3)%4;
            else if (c=='R')
                dir = (dir+1)%4;
            else {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if (!inRange(nx, ny))
                    continue;
                x = nx;
                y = ny;
                sum += grid[x][y];
            }
        }
        System.out.print(sum);
    }
}