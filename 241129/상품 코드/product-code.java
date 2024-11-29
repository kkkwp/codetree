import java.util.Scanner;

class Product {
    String name;
    int code;

    Product() {
        this.name = "codetree";
        this.code = 50;
    }

    Product(String name, int code) {
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product();
        Product p2 = new Product(sc.next(), sc.nextInt());
        System.out.println("product " + p1.code + " is " + p1.name);
        System.out.print("product " + p2.code + " is " + p2.name);
    }
}