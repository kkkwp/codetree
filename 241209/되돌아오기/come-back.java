import java.util.Scanner;

public class Main {
    static int[] dx = {0, 1, -1, 0};
    static int[] dy = {-1, 0, 0, 1};

    static int getDir(char d) {
        if (d=='W') return 0;
        else if (d=='S') return 1;
        else if (d=='N') return 2;
        else return 3;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0, y = 0;
        int time = 0;
        while (n-->0) {
            char d = sc.next().charAt(0);
            int dist = sc.nextInt();
            int dir = getDir(d);
            
            for (int i=0; i<dist; i++) {
                x += dx[dir];
                y += dy[dir];
                time++;

                if (x==0 && y==0) {
                    System.out.print(time);
                    return;
                }
            }
        }
        System.out.print(-1);
    }
}