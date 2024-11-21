import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        int minVal = arr[1] - arr[0];
        for (int i=2; i<n; i++) {
            int d = arr[i] - arr[i-1];
            if (d < minVal)
                minVal = d;
        }
        System.out.print(minVal);
    }
}