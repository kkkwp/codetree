import java.util.Scanner;

public class Main {
    static final int OFFSET = 100000;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] line = new int[200001];
        int cur = OFFSET;
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            if (dir == 'L') {
                for (int j=0; j<x; j++) {
                    cur--;
                    line[cur] = 1;
                }
            } else {
                for (int j=0; j<x; j++) {
                    line[cur] = -1;
                    cur++;
                }
            }
        }

        int white = 0, black = 0;
        for (int l : line) {
            if (l == 1) 
                white++;
            else if (l == -1)
                black++;
        }
        System.out.print(white + " " + black);
    }
}