import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] students = new int[n+1];
        int answer = -1;
        while (m-->0) {
            int penalty = sc.nextInt();
            for (int i=1; i<=n; i++) {
                if (students[i] >= k) {
                    answer = i;
                    break;
                }
            }
            students[penalty]++;
        }
        System.out.print(answer);
    }
}