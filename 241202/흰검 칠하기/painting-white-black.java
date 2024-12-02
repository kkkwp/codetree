import java.util.Scanner;

public class Main {
    static final int OFFSET = 100000;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] line = new int[200001];
        int[] white = new int[200001];
        int[] black = new int[200001];
        int cur = OFFSET;
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            if (dir == 'L') {
                while (x-- > 0) {
                    line[cur] = 1;
                    white[cur]++;
                    if (x > 0)
                        cur--;
                }
            } else {
                while (x-- > 0) {
                    line[cur] = -1;
                    black[cur]++;
                    if (x > 0)
                        cur++;
                }
            }
        }

        int w = 0, b = 0, g = 0;
        for (int i=0; i<200001; i++) {
            if (white[i] >= 2 && black[i] >= 2)
                g++;
            else if (line[i] == 1)
                w++;
            else if (line[i] == -1)
                b++;
        }
        System.out.print(w + " " + b + " " + g);
    }
}