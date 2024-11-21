import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String ab = a+b;
        String ba = b+a;

        boolean flag = true;
        for (int i=0; i<ab.length(); i++) {
            if (ab.charAt(i) != ba.charAt(i)) {
                flag = false;
                break;
            }
        }
        System.out.print(flag ? true : false);
    }
}