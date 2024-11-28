import java.util.Arrays;
import java.util.Scanner;

public class Main { 
    static String t;

    static boolean startsWithT(String word) {
        return word.length() >= t.length() && word.substring(0, t.length()).equals(t);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        t = sc.next();

        String[] words = new String[n];
        int cnt = 0;
        for (int i=0; i<n; i++) {
            String word = sc.next();
            if (startsWithT(word))
                words[cnt++] = word;
        }
        
        String[] matched = new String[cnt];
        for (int i=0; i<cnt; i++)
            matched[i] = words[i];
        Arrays.sort(matched);
        System.out.print(matched[k-1]);
    }
}