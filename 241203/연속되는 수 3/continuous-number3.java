import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        
        int cnt = 1;
        int maxCnt = 1;
        for (int i=1; i<n; i++) {
            if (arr[i] * arr[i-1] > 0) {
                cnt++;
                maxCnt = Math.max(maxCnt, cnt);
            } else
                cnt = 1;
        }
        System.out.print(maxCnt);
    }
}