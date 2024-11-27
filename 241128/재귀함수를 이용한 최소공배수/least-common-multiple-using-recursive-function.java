import java.util.Scanner;

public class Main {
    static int[] arr;

    static int findLCM(int idx) {
        if (idx==0)
            return arr[0];
        
        int a = findLCM(idx-1);
        int b = arr[idx];
        int gcd = 1;
        for (int i=2; i<=Math.min(a, b); i++) {
            if (a%i==0 && b%i==0)
                gcd = i;
        }
        return a * b / gcd;
            
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.print(findLCM(n-1));
    }
}