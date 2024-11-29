import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int baseDay = 11, baseHour = 11, baseMinute = 11;
        int totalBase = (baseDay-11)*24*60 + (baseHour-11)*60 + baseMinute;
        int totalInput = (a-11)*24*60 + (b-11)*60 + c;
        int diff = totalInput - totalBase;
        System.out.print(diff < 0 ? -1 : diff);
    }
}