import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        
        int cnt = 0;
        int maxCnt = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] > t) {
                cnt++;
                maxCnt = Math.max(maxCnt, cnt);
            } else 
                cnt = 0;
        }
        System.out.print(maxCnt);
    }
}