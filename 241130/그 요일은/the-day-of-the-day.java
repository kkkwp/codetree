import java.util.Scanner;

public class Main {
    static int[] daysOfMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

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
        String a = sc.next();

        int targetDay = -1;
        for (int i=0; i<7; i++) {
            if (days[i].equals(a)) {
                targetDay = i;
                break;
            }
        }
                
        int diff = getDays(m2, d2) - getDays(m1, d1);
        int cnt = diff/7;
        if (diff%7 >= targetDay)
            cnt++;
        System.out.print(cnt);
    }
}