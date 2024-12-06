import java.util.Scanner;

public class Main {
    static final int MAX_TIME = 1_000_000;
    static int n, m;
    static int[] a = new int[MAX_TIME+1];
    static int[] b = new int[MAX_TIME+1];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int cur = 1;
        while (n-->0) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            while (t-->0) {
                a[cur] = a[cur-1] + v;
                cur++;
            }
        }

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
        int prevLeader = 0;
        for (int i=1; i<cur; i++) {
            int curLeader = prevLeader;
            if (a[i] > b[i])
                curLeader = 1;
            else if (a[i] < b[i])
                curLeader = 2;
            else
                curLeader = 3;
            
            if (prevLeader != curLeader) {
                answer++;
                prevLeader = curLeader;
            }
        }
        System.out.print(answer);
    }
}