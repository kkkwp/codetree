import java.util.Scanner;

public class Main {
    static int recur(int prod) {
        if (prod < 10)
            return prod;
        return prod%10 + recur(prod/10);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int prod = 1;
        for (int i=0; i<3; i++)
            prod *= sc.nextInt();
        System.out.print(recur(prod));
    }
}