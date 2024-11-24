import java.util.Scanner;

public class Main {
    static String reverseString(String a) {
        StringBuilder reversed = new StringBuilder(a);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = reverseString(a);
        System.out.print(a.equals(b) ? "Yes" : "No");   
    }
}