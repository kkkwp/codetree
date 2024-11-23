import java.util.Scanner;

public class Main {
    static boolean isLeapYear(int y) {
        if (y%400 == 0)
            return true;
        if (y%100 == 0)
            return true;
        if (y%4==0)
            return true;
        return false;
    }

    static boolean isValidDate(int y, int m, int d) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (isLeapYear(y))
            daysInMonth[2] = 29;
        
        if (m < 1 || m > 12)
            return false;
        if (d < 1 || d > daysInMonth[m])
            return false;
        return true;
    }

    static String getSeason(int m) {
        if (3<=m && m<=5)
            return "Spring";
        if (6<=m && m<=8)
            return "Summer";
        if (9<=m && m<=11)
            return "Fall";
        else
            return "Winter";
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        System.out.print(isValidDate(y, m, d) ? getSeason(m) : -1);
    }
}