import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[b];
        int sum = 0;
        while (a > 1) {
            arr[a%b]++;
            a /= b;
        }
        
        for (int i=0; i<b; i++)
            sum += Math.pow(arr[i], 2);
        System.out.print(sum);
    }
}