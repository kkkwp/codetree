import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int idx = s.length() - 1;
        if (idx%2==0)
            idx--;
        for (int i=idx; i>=0; i-=2)
            System.out.print(s.charAt(i));
    }
}