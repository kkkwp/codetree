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

        int aTime = 1;
        while (n-->0) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            int dir = d == 'L' ? -1 : 1;
            while (t-->0) {
                a[aTime] = a[aTime-1] + dir;
                aTime++;
            }
        }

        int bTime = 1;
        while (m-->0) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            int dir = d == 'L' ? -1 : 1;
            while (t-->0) {
                b[bTime] = b[bTime-1] + dir;
                bTime++;
            }
        }

        int maxTime = 0;
        if (aTime > bTime) {
            maxTime = aTime;
            for (int i=bTime; i<aTime; i++)
                b[i] = b[i-1];
        } else {
            maxTime = bTime;
            for (int i=aTime; i<bTime; i++)
                a[i] = a[i-1];
        }

        int answer = 0;
        for (int i=1; i<maxTime; i++)
            if (a[i] == b[i] && a[i-1] != b[i-1])
                answer++;
        System.out.print(answer);
    }
}