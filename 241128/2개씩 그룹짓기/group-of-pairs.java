import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, answer;
    static int[] arr;
    
    static void findMax(int idx) {
        int sum = arr[idx] + arr[n-1-idx];
        answer = Math.max(answer, sum);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for(int i=0; i<n; i++)
            findMax(i);
        System.out.print(answer);
    }
}