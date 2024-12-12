import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] people = new int[n];
        for (int i=0; i<n; i++)
            people[i] = sc.nextInt();
        
        int minVal = Integer.MAX_VALUE;
        for (int i=0; i<n; i++) {
            int sum = 0;
            for (int j=0; j<n; j++)
                sum += Math.abs(j-i) * people[j];
            minVal = Math.min(minVal, sum);
        }
        System.out.print(minVal);
    }
}