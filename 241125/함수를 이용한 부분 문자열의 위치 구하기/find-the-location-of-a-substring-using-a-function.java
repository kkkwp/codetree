import java.util.Scanner;

public class Main {
    static String input, target;

    static int findSubstring() {
        return input.indexOf(target);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        input = sc.next();
        target = sc.next();
        System.out.print(findSubstring());
    }
}