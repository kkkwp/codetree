import java.util.Arrays;
import java.util.Scanner;

class Person {
    String name;
    int height;
    int weight;

    Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] people = new Person[n];
        for (int i=0; i<n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            people[i] = new Person(name, height, weight);
        }

        Arrays.sort(people, (o1, o2) -> {
            return o1.height - o2.height;
        });

        for (Person p : people)
            System.out.println(p.name + " " + p.height + " " + p.weight);
    }
}