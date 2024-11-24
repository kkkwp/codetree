import java.util.Scanner;

class IntWrapper {
    int value;

    IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    static void func(IntWrapper a, IntWrapper b) {
        if (a.value < b.value) {
            a.value += 10;
            b.value *= 2;
        } else {
            a.value *= 2;
            b.value += 10;
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());
        func(a, b);
        System.out.print(a.value + " " + b.value);
    }
}