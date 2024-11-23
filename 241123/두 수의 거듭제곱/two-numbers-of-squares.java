import java.util.Scanner;

public class Main {
    static int getPow(int a, int b) {
        return (int)Math.pow(a, b);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(getPow(a, b));
    }
}