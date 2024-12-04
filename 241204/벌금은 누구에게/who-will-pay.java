import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] penalties = new int[n+1];
        while (m-->0) {
            int student = sc.nextInt();
            penalties[student]++;
            if (penalties[student] >= k) {
                System.out.print(student);
                return;
            }
        }
        System.out.print(-1);
    }
}