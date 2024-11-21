import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for (int i=0; i<n; i++) {
            for (int j=0; j<i; j++)
                System.out.print("  ");
            for (int j=n-i; j>=1; j--) {
                System.out.print(ch + " ");
                ch++;
                if (ch > 'Z')
                    ch = 'A';
            }
            System.out.println();
        }
    }
}