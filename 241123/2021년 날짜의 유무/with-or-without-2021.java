import java.util.Scanner;

public class Main {
    static boolean isValidDate(int m, int d) {
        int[] daysInMonth  = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (m<1 || m>12)
            return false;
        if (d<1 || d>daysInMonth[m])
            return false;
        return true;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        System.out.print(isValidDate(m, d) ? "Yes" : "No");
    }
}