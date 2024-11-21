import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        for (int i=0; i<s1.length(); i++)
            System.out.print(s1.charAt(i) != ' ' ? s1.charAt(i) : "");
        for (int i=0; i<s2.length(); i++)
            System.out.print(s2.charAt(i) != ' ' ? s2.charAt(i) : "");
    }
}