import java.util.Scanner;

public class Main {
    static int[] daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

    static int getDays(int m, int d) {
        int sum = 0;
        for (int i=1; i<m; i++)
            sum += daysOfMonth[i];
        sum += d;
        return sum;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int diff = Math.abs(getDays(m2, d2) - getDays(m1, d1));
        System.out.print(days[diff%7-1]);
    }
}