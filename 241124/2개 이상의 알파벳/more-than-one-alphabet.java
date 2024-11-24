import java.util.Scanner;

public class Main {
    static boolean func(int[] alpha) {
        int cnt = 0;
        for (int value : alpha)
            if (value>=1)
                cnt++;
        return cnt>=2;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int[] alpha = new int[26];
        for (int i=0; i<a.length(); i++)
            alpha[a.charAt(i)-'a']++;
        System.out.print(func(alpha) ? "Yes" : "No");
    }
}