import java.util.Scanner;

public class Main {
    static final int OFFSET = 1000;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] x1 = new int[3];
        int[] y1 = new int[3];
        int[] x2 = new int[3];
        int[] y2 = new int[3];
        for (int i=0; i<3; i++) {
            x1[i] = sc.nextInt() + OFFSET;
            y1[i] = sc.nextInt() + OFFSET;
            x2[i] = sc.nextInt() + OFFSET;
            y2[i] = sc.nextInt() + OFFSET;
        }

        int[][] grid = new int[2001][2001];
        for (int i=0; i<3; i++)
            for (int x=x1[i]; x<x2[i]; x++)
                for (int y=y1[i]; y<y2[i]; y++)
                    grid[x][y] = i+1;

        int cnt = 0;
        for (int i=0; i<=2000; i++)
            for (int j=0; j<=2000; j++)
                if (grid[i][j] == 1 || grid[i][j] == 2)
                    cnt++;
        System.out.print(cnt);
    }
}