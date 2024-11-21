import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        for (int i=2; i<10; i++)
            arr[i] = arr[i-1] + 2 * arr[i-2];
        for (int a : arr)
            System.out.print(a + " ");
    }
}