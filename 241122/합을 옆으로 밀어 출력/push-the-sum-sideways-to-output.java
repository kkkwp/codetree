import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += sc.nextInt();
        }
        String result = Integer.toString(sum);
        System.out.print(result.substring(1) + result.substring(0,1));
    }
}