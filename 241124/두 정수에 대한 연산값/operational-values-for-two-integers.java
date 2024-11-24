import java.util.Scanner;

class IntWrapper {
    int value;

    IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    static void modify(IntWrapper a, IntWrapper b) {
        if (a.value > b.value) {
            a.value += 25;
            b.value *= 2;
        } else {
            a.value *= 2;
            b.value += 25; 
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());
        modify(a, b);
        System.out.print(a.value + " " + b.value);
    }
}