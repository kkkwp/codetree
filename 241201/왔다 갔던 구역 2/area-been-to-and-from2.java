import java.util.Scanner;

public class Main {
    static final int OFFSET = 1000;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] line = new int[2001];
        int cur = 0;
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            if (dir == 'L') {
                for (int j=0; j<x; j++) {
                    line[cur-1 + OFFSET]++;
                    cur--;
                }
            } else {
                for (int j=0; j<x; j++) {
                    line[cur + OFFSET]++;
                    cur++;
                }
            }
        }

        int area = 0;
        for (int l : line)
            if (l >= 2)
                area++;
        System.out.print(area);
    }
}