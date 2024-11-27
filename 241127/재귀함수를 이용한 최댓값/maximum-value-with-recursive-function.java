import java.util.Scanner;

public class Main {
    static int n;
    static int[] arr;

    static int findMax(int idx) {
        if (idx == 0)
            return arr[0];
        return Math.max(arr[idx], findMax(idx-1));
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.print(findMax(n-1));
    }
}