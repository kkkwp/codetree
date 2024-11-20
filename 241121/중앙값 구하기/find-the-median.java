import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i=0; i<3; i++)
            nums[i] = sc.nextInt();
        Arrays.sort(nums);
        System.out.print(nums[1]);
    }
}