import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i=0; i<n; i++)
            words[i] = sc.next();
        Arrays.sort(words);
        for(String word : words)
            System.out.println(word);
    }
}