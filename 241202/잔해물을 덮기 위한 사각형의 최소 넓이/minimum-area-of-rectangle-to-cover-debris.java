import java.util.Scanner;

public class Main {
    static final int OFFSET = 1000;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] x1 = new int[2];
        int[] y1 = new int[2];
        int[] x2 = new int[2];
        int[] y2 = new int[2];
        for (int i=0; i<2 ;i++) {
            x1[i] = sc.nextInt() + OFFSET;
            y1[i] = sc.nextInt() + OFFSET;
            x2[i] = sc.nextInt() + OFFSET;
            y2[i] = sc.nextInt() + OFFSET;
        }

        boolean[][] grid = new boolean[2001][2001];
        for (int i=0; i<2; i++) {
            for (int x=x1[i]; x<x2[i]; x++) {
                for (int y=y1[i]; y<y2[i]; y++) {
                    grid[x][y] = i == 0 ? true : false;
                }
            }
        }

        int minX = 2001, minY = 2001, maxX = -1, maxY = -1;
        for (int i=0; i<=2000; i++) {
            for (int j=0; j<=2000; j++) {
                if (grid[i][j]) {
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }
        }
        System.out.print((maxX - minX + 1) * (maxY - minY + 1));
    }
}