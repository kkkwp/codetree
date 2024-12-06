import java.util.Arrays;
import java.util.Scanner;

class Handshake implements Comparable<Handshake> {
    int time, x, y;

    Handshake(int time, int x, int y) {
        this.time = time;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Handshake other) {
        return this.time - other.time;
    }
}

public class Main {
    static int n, k, p, t;
    static int[] cnt;
    static boolean[] infected;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 개발자 수
        k = sc.nextInt(); // 전염 제한 횟수
        p = sc.nextInt(); // 최초 감염자
        t = sc.nextInt(); // 악수 횟수

        Handshake[] handshakes = new Handshake[t];
        for (int i=0; i<t; i++) {
            int time = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            handshakes[i] = new Handshake(time, x, y);
        }

        Arrays.sort(handshakes);

        infected = new boolean[n+1];
        cnt = new int[n+1];
        infected[p] = true;
        for (Handshake hs : handshakes) {
            int x = hs.x;
            int y = hs.y;
            if (infected[x] && cnt[x] < k) {
                infected[y] = true;
                cnt[x]++;
            }
            if (infected[y] && cnt[y] < k) {
                infected[x] = true;
                cnt[y]++;
            }
        }

        for (int i=1; i<=n; i++)
            System.out.print(infected[i] ? 1 : 0);
    }
}