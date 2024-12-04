import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int totalTime = 0;

        int[] a = new int[1_000_000];
        int cur = 0;
        int time = 0;
        while (n-- > 0) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            int dir = d == 'L' ? -1 : 1;
            for (int i=0; i<t; i++) {
                cur += dir;
                a[time++] = cur;
            }
        }

        int[] b = new int[1_000_000];
        cur = 0;
        time = 0;
        while (m-- > 0) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            int dir = d == 'L' ? -1 : 1;
            for (int i=0; i<t; i++) {
                cur += dir;
                b[time++] = cur;
            }
        }

        for (int i=0; i<time; i++) {
            if (a[i] == b[i]) {
                System.out.print(i+1);
                return;
            }
        }
        System.out.print(-1);
    }
}