import java.util.Scanner;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int x = 0, y = 0;
        int dir = 0;
        int time = 0;
        for (char c : s.toCharArray()) {
            if (c=='L') {
                dir = (dir+3)%4;
                time++;
            } else if (c=='R') {
                dir = (dir+1)%4;
                time++;
            } else {
                x += dx[dir];
                y += dy[dir];
                time++;
            }
            
            if (x==0 && y==0) {
                System.out.print(time);
                return;
            }
        }
        System.out.print(-1);
    }
}