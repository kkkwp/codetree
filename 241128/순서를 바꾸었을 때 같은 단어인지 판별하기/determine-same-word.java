import java.util.Arrays;
import java.util.Scanner;

public class Main {   
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.print(String.valueOf(a).equals(String.valueOf(b)) ? "Yes" : "No");
    }
}