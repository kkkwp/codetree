import java.util.Arrays;
import java.util.Scanner;

public class Main {   
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2*n];
        for (int i=0; i<2*n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int answer = 0;
        for(int i=0; i<n; i++) {
            int sum = arr[i] + arr[2*n-1-i];
            answer = Math.max(answer, sum);
        }  
        System.out.print(answer);
    }
}