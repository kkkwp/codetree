import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int aa = sc.nextInt();
        char ag = sc.next().charAt(0);
        int ba = sc.nextInt();
        char bg = sc.next().charAt(0);
        System.out.print((aa>=19 && ag=='M') || (ba>=19 && bg=='M') ? 1 : 0);
    }
}