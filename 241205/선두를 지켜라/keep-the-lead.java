import java.util.Scanner;

public class Main {
    static final int MAX_TIME = 1_000_000;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[MAX_TIME+1];
        int cur = 1;
        while (n-->0) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            while (t-->0) {
                a[cur] = a[cur-1] + v;
                cur++;
            } 
        }

        int[] b = new int[MAX_TIME+1];
        cur = 1;
        while (m-->0) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            while (t-->0) {
                b[cur] = b[cur-1] + v;
                cur++;
            }
        }

        int answer = 0;
        int leader = 0;
        for (int i=1; i<cur; i++) {
            if (a[i] > b[i]) {
                if (leader == 2)
                    answer++;
                leader = 1;
            } else if (a[i] < b[i]) {
                if (leader == 1)
                    answer++;
                leader = 2;
            }
        }
        System.out.print(answer);
    }
}