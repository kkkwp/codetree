import java.util.Scanner;

public class Main {
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int nx = 0, ny = 0;
        while (n-->0) {
            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();

            int dirNum;
            if (dir == 'W')
                dirNum = 0;
            else if (dir == 'S')
                dirNum = 1;
            else if (dir == 'N')
                dirNum = 2;
            else
                dirNum = 3;

            nx += dx[dirNum] * dist;
            ny += dy[dirNum] * dist;
        }
        System.out.print(nx + " " + ny);
    }
}