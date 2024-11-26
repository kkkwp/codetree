import java.util.Scanner;

public class Main {
    static void printAsc(int n) {
        if (n==0)
            return;
        printAsc(n-1);
        System.out.print(n + " ");
    }

    static void printDesc(int n) {
        if (n==0)
            return;
        System.out.print(n + " ");
        printDesc(n-1);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printAsc(n);
        System.out.println();
        printDesc(n);
    }
}