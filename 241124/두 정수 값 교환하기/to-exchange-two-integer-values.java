import java.util.Scanner;

class IntWrapper {
    int value;

    IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    static void swap(IntWrapper a, IntWrapper b) {
        int tmp = a.value;
        a.value = b.value;
        b.value = tmp;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        IntWrapper n = new IntWrapper(sc.nextInt());
        IntWrapper m = new IntWrapper(sc.nextInt());
        swap(n, m);
        System.out.print(n.value + " " + m.value);
    }
}