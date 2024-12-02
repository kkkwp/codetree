import java.util.Scanner;

public class Main {
    static final int OFFSET = 100;
    static int width = 8;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[][] grid = new boolean[201][201];
        while (n-- > 0) {
            int x = sc.nextInt() + OFFSET;
            int y = sc.nextInt() + OFFSET;
            for (int i=x; i<x+width; i++)
                for (int j=y; j<y+width; j++)
                    grid[i][j] = true;
        }

        int area = 0;
        for (int i=0; i<=200; i++)
            for (int j=0; j<=200; j++)
                if (grid[i][j])
                    area++;
        System.out.print(area);
    }
}