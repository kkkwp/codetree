import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] line = new int[201];
        int offset = 100;
        int maxVal = -1;
        for (int i=0; i<n; i++) {
            int x1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset;
            for (int j=x1; j<x2; j++) {
                line[j]++;
                if (line[j] > maxVal)
                    maxVal = line[j];
            }
        }
        System.out.print(maxVal);
    }
}