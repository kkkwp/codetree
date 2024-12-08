import java.util.Scanner;

public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = s.length();
        int nx = 0, ny = 0;
        int dir = 3;
        for (int i=0; i<n; i++) {
            char cmd = s.charAt(i);
            if (cmd == 'L')
                dir = (dir + 3) % 4;
            else if (cmd == 'R')
                dir = (dir + 1) % 4;
            else {
                nx += dx[dir];
                ny += dy[dir];
            }
        }
        System.out.print(nx + " " + ny);
    }
}