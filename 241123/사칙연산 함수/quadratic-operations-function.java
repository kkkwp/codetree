import java.util.Scanner;

public class Main {
    static void add(int a, int c) {
        System.out.printf("%d + %d = %d", a, c, a+c);
    }

    static void substract(int a, int c) {
        System.out.printf("%d - %d = %d", a, c, a-c);
    }

    static void multiply(int a, int c) {
        System.out.printf("%d * %d = %d", a, c, a*c);
    }

    static void divide(int a, int c) {
        System.out.printf("%d / %d = %d", a, c, a/c);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        if (o == '+')
            add(a, c);
        else if (o == '-')
            substract(a, c);
        else if (o == '*')
            multiply(a, c);
        else if (o == '/')
            divide(a, c);
        else
            System.out.print("False");
    }
}