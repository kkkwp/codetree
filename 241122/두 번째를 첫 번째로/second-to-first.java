import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        char from = arr[1];
        char to = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == from)
                arr[i] = to;
        }
        System.out.print(String.valueOf(arr));
    }
}