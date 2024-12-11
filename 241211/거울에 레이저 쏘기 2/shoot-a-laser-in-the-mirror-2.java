import java.util.Scanner;

class Position {
    int x, y, dir;

    Position(int x, int y, int dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }
}

public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int n;
    static char[][] grid;

    static Position getStart(int k) {
        if (k <= n)
            return new Position(0, k-1, 0);
        else if (k <= 2*n)
            return new Position(k-n-1, n-1, 1);
        else if (k <= 3*n)
            return new Position(n-1, 3*n-k, 2);
        else
            return new Position(4*n-k, 0, 3);
    }

    static boolean inRange(int x, int y) {
        return 0<=x && x<n && 0<=y && y<n;
    }

    static int getDir(char mirror, int dir) {
        if (mirror == '/') {
            if (dir==0 || dir==2) return (dir+1)%4;
            if (dir==1 || dir==3) return (dir+3)%4;
        } else {
            if (dir==0 || dir==2) return (dir+3)%4;
            if (dir==1 || dir==3) return (dir+1)%4;
        }
        return dir;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new char[n][n];
        for (int i=0; i<n; i++)
            grid[i] = sc.next().toCharArray();
        int k = sc.nextInt();

        Position start = getStart(k);
        int x = start.x;
        int y = start.y;
        int dir = start.dir;
        int cnt = 0;
        while (inRange(x, y)) {
            dir = getDir(grid[x][y], dir);
            x += dx[dir];
            y += dy[dir];
            cnt++;
        }
        System.out.print(cnt);
    }
}