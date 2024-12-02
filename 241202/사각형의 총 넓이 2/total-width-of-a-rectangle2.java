import java.util.Scanner;

public class Main {
    static final int OFFSET = 100;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[][] grid = new boolean[201][201];
        int area = 0;
        while (n-- > 0) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int i=x1; i<x2; i++) {
                for (int j=y1; j<y2; j++) {
                    if (!grid[i][j]) {
                        grid[i][j] = true;
                        area++;
                    }
                }
            }
        }
        System.out.print(area);
    }
}