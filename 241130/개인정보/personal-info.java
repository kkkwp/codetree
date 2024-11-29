import java.util.Arrays;
import java.util.Scanner;

class Person {
    String name;
    int height;
    double weight;

    Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = 5;
        Person[] people = new Person[n];
        for (int i=0; i<n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            people[i] = new Person(name, height, weight);
        }

        System.out.println("name");
        Arrays.sort(people, (o1, o2) -> {
            return o1.name.compareTo(o2.name);
        });
        for (Person p : people)
            System.out.printf("%s %d %.1f\n", p.name, p.height, p.weight);

        System.out.println();
        System.out.println("height");
        Arrays.sort(people, (o1, o2) -> {
            return o2.height - o1.height;
        });
        for (Person p : people)
            System.out.printf("%s %d %.1f\n", p.name, p.height, p.weight);
    }
}