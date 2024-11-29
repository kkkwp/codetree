import java.util.Scanner;

class User {
    String id;
    int level;

    User() {
        this.id = "codetree";
        this.level = 10;
    }

    User(String id, int level) {
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        User user1 = new User();
        System.out.printf("user %s lv %d\n", user1.id, user1.level);

        User user2 = new User(sc.next(), sc.nextInt());
        System.out.printf("user %s lv %d" , user2.id, user2.level);
    }
}