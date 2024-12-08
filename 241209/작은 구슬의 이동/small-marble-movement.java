import java.util.Scanner;

public class Main {
    static int[] dx = {0, 1, -1, 0};
    static int[] dy = {1, 0, 0, -1};
    static int n;

    static int getDir(char d) {
        if (d == 'U') return 2;
        else if (d == 'D') return 1;
        else if (d == 'R') return 0;
        else return 3;
    }

    static boolean inRange(int x, int y) {
        return 0<=x && x<n && 0<=y && y<n;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;
        char d = sc.next().charAt(0);

        int dir = getDir(d);
        int x = r, y = c;
        while (t-->0) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (!inRange(nx, ny))
                dir = 3 - dir;
            else {
                x = nx;
                y = ny;
            }
        }
        System.out.print((x+1) + " " + (y+1));
    }
}