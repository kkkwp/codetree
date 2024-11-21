import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int minLen = 21;
        int maxLen = -1;
        for (int i=0; i<3; i++) {
            String s = sc.next();
            int len = s.length();
            minLen = Math.min(minLen, len);
            maxLen = Math.max(maxLen, len);
        }
        System.out.print(maxLen - minLen);
    }
}